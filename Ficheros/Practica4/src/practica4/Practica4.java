
package practica4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

/*Realizar un proyecto java que permita realizar las siguientes operaciones a partir de
    un fichero de texto con la información de una entidad de datos del sistema de 
    información de cada alumno (empleados, farmacias, dispositivos, animales, jugadores)
    en el que en cada línea están los datos de cada ocurrencia separados por comas.
    (empleados en el ejemplo de la práctica 3). 

A)Crear el fichero binario de acceso aleatorio con los datos del fichero de texto.

B)Añadir un nuevo registro con la información de cada entidad de datos del 
    sistema de información de cada alumno (empleados, farmacias, dispositivos,
    animales, jugadores)  al fichero con datos que se piden por pantalla.

C)Modificar dos datos (por ejemplo: nombre y correo). Se pedirá el número de
    registro que se quiere modificar, sino existe se visyalizará error y si existe 
    se visualizzarán los datos y se pedirán los nuevos.

D)Crear un informe con los datos del fichero.

E)Eliminar los datos de una ocurrencia de Entidad (marcando con -1)

F)Crear un fichero XML utilizando DOM con todos los datos del fichero.
*/

public class Practica4 {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException{
        
        System.out.println("Programa para realizar operaciones de una entidad de datos");
        System.out.println("1.Crear un fichero binario de acceso aleatorio");
        System.out.println("2.Añadir un nuevo registro");
        System.out.println("3.Modificar dos datos");
        System.out.println("4.Crear un informe con los datos");
        System.out.println("5.Eliminar los datos de una ocurrencia(marcando un -1)");
        System.out.println("6.Crear un ficher XMl con DOM de todos los datos");
        int opcion = Integer.parseInt(sc.nextLine());
        
        switch (opcion){
            case 1: crearaleatorio();
                break;
            case 2: añadiregistro();
                break;
            case 3: modificardatos();
                break;
            case 4: crearinforme();
                break;
            case 5: eliminardatos();
                break;
            case 6: crearxml();
                break;
        }
    }

    private static void crearaleatorio() throws FileNotFoundException, IOException {
        //Preguntamos el fichero
        System.out.println("Introduce el fichero");
        String ficherorigen = sc.nextLine();
        File fich = new File(ficherorigen);
        System.out.println("Escribe el nombre del fichero binario");
        String ficheronuevo = sc.nextLine();
        File fichbi = new File(ficheronuevo);
        if (fichbi.exists()){
            System.out.println("Ya existe un fichero con ese nombre");
        } else {
            //Creamos el objeto de acceso aleatorio
            RandomAccessFile file = new RandomAccessFile(fichbi, "rw");
            StringBuffer bnombre = null;
            StringBuffer bdept = null;
            StringBuffer bdispo = null;
            BufferedReader leerfich = new BufferedReader(new FileReader(fich));
            String linea;
            while((linea = leerfich.readLine())!=null){//mientras haya algo...
                int uno = 0;
                int dos = 0;
                int tres = 0;
                int cuatro = 0;
                int cinco = 0;
                char[] arraycadena;
                char caracter = ';';
                arraycadena = linea.toCharArray();//convertimos la linea en un array de chars
                int contador = 0;
                for(int i = 0; i < arraycadena.length;i++){
                    //comprobamos que si hay un ;....
                    if (arraycadena[i]==caracter){
                        contador++;
                    }
                    if (arraycadena[i]==caracter){
                        switch(contador){
                            case 1 : uno = i;
                                break;
                            case 2 : dos = i;
                                break;
                            case 3 : tres = i;
                                break;
                            case 4 : cuatro = i;
                                break;
                            case 5 : cinco = i;
                                break;
                        }
                    }
                }
                //igualamos las varibales al substring de linea
                int id = Integer.parseInt(linea.substring(0, uno));
                String nombre = linea.substring(uno+1, dos);
                int asiento = Integer.parseInt(linea.substring(dos+1, tres));
                String depart = linea.substring(tres+1, cuatro);
                String dispo = linea.substring(cuatro+1, cinco);
                contador = 0;
                //escribimos en binario las variables
                file.writeInt(id);
                file.writeChar(',');
                bnombre = new StringBuffer(nombre);
                bnombre.setLength(14);
                file.writeChars(bnombre.toString());
                file.writeChar(',');
                file.writeInt(asiento);
                file.writeChar(',');
                bdept = new StringBuffer(depart);
                bdept.setLength(24);
                file.writeChars(bdept.toString());
                file.writeChar(',');
                bdispo = new StringBuffer(dispo);
                bdispo.setLength(20);
                file.writeChars(bdispo.toString());
                file.writeChar('\n');
            }
            leerfich.close();
            file.close();
        }
    }

    private static void añadiregistro() throws FileNotFoundException, IOException {
        //Preguntamos el fichero
        System.out.println("Introduce el fichero donde vas a añadir info");
        String fich = sc.nextLine();
        File fichero = new File(fich);
        if (!fichero.exists()){
            System.out.println("El fichero introducido no existe");
        }
        else {
            //Creamos el objeto que lee el fichero
            BufferedReader leerfich = new BufferedReader(new FileReader(fichero));
            String linea;
            int registro = 0;
            //mostramos el contenido del fichero
             while((linea=leerfich.readLine()) != null){
                System.out.println(linea);
            }
            
            //Preguntamos los datos
            System.out.println("Introduce un ID:");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Introduce un Nombre");
            String nombre = sc.nextLine();
            System.out.println("Introduce el asiento");
            int asiento = Integer.parseInt(sc.nextLine());
            System.out.println("Introduce el departamento");
            String departamento = sc.nextLine();
            System.out.println("Introduce el dispositivo");
            String dispositivo = sc.nextLine();
            StringBuffer bnombre = null;
            StringBuffer bdept = null;
            StringBuffer bdispo = null;
           //Creamos el obeto aleatorio
            RandomAccessFile fileram = new RandomAccessFile(fichero, "rw");
            long posicion = fileram.length();
            //nos posicionamos al final del fichero
            fileram.seek(posicion);
            int siguiente = (int)((posicion + 60)/60);
            //escribimos las varibales y los string buffer
            fileram.writeChar('\n');
            fileram.writeInt(id);
            fileram.writeChar(',');
            bnombre = new StringBuffer(nombre);
            bnombre.setLength(14);
            fileram.writeChars(bnombre.toString());
            fileram.writeChar(',');
            fileram.writeInt(asiento);
            fileram.writeChar(',');
            bdept = new StringBuffer(departamento);
            bdept.setLength(24);
            fileram.writeChars(bdept.toString());
            fileram.writeChar(',');
            bdispo = new StringBuffer(dispositivo);
            bdispo.setLength(20);
            fileram.writeChars(bdispo.toString());
            fileram.close();
            leerfich.close();
            
        }
    }

    private static void modificardatos() throws FileNotFoundException, IOException {
        //introducims el fichero
        System.out.println("Introduce el fichero binario que quieres modificar");
        String fichero = sc.nextLine();
        File file = new File (fichero);
        if (!file.exists()){
            System.out.println("El fichero introducido no existe");
        }
        else{
            System.out.println("Introduce el primer dato de la entidad a modificar");
            String primerdato = sc.nextLine();
            System.out.println("Introduce el primer dato que quieres modificar");
            String dato1 = sc.nextLine();
            System.out.println("Introduce el segundo dato que quieres modificar");
            String dato2 = sc.nextLine();
            String linea;
            BufferedReader leerfich = new BufferedReader(new FileReader(file));
            int registro = 0;
            //Bucle para ver todas las lineas del fichero
            while((linea = leerfich.readLine())!=null){
                System.out.println(linea);
                char[] arraycadena;
                char caracter = ';';
                int contador = 0;
                String dato;
                arraycadena = linea.toCharArray();
                int contadorA=0,contadorB=0;
                ArrayList datos = new ArrayList();
                for(int i = 0; i < arraycadena.length;i++){
                    if (arraycadena[i]==caracter){
                        contador++;
                        contadorB = i;
                        if (contadorA == 0){
                                dato = linea.substring(contadorA,contadorB);
                                contadorA =contadorB;
                        }
                        else{
                            dato = linea.substring(contadorA+1,contadorB);
                            contadorA = contadorB; 
                        }
                        datos.add(dato);
                    }
                }
                //Si el primer dato coincide, preguntar y cambiar los valores del array
                if (datos.get(0).equals(primerdato)){
                    if(datos.contains(dato1)){
                        System.out.println("Introduce el nuevo dato que se sustituirá por " + dato1);
                        String nuevodato1 = sc.nextLine();
                        datos.set(datos.indexOf(dato1), nuevodato1);
                    }
                    else {
                        System.out.println("En esta entidad no hay ningún dato que coincidad con " + dato1);
                    }
                    if(datos.contains(dato2)){
                        System.out.println("Introduce el nuevo dato que se sustituirá por " + dato2);
                        String nuevodato2 = sc.nextLine();
                        datos.set(datos.indexOf(dato2), nuevodato2);
                        
                    }
                    else {
                        System.out.println("En esta entidad no hay ningún dato que coincidad con " + dato2);
                    }
                    //Nos posicionamos y modificamos
                    RandomAccessFile fileale = new RandomAccessFile(file, "rw");
                    int posicion = (registro-1)*60;
                    
                }
                else {
                    System.out.println("No existe el dato " + primerdato + " en esta entidad");
                }
                registro++;
            }
            leerfich.close();
    
        }
    }
    
    private static void crearinforme() throws FileNotFoundException, IOException {
        //preguntamos el fichero binario
        System.out.println("Introduce un fichero para crar el informe");
        String informe = sc.nextLine();
        File file = new File(informe);
        //creamos el obeto aleatorio y las varibales 
        RandomAccessFile fileale = new RandomAccessFile(file, "r");
        int posicion = 0;
        char nombrechar[] = new char[6], auxnombre;
        char deptchar[] = new char[20], auxdept;
        char dispochar[] = new char[15], auxdispo;
        int id,asiento;
        char coma;
        //nos posicionamos en cada linea al principio y guardamos en las varibles
        //los enteros,carcateres y string binarios
        for(;;){
            fileale.seek(posicion);//nos colocamos al principio del fichero
            id = fileale.readInt();//leemos el id del empleado
            coma = fileale.readChar();
            for (int i = 0; i < nombrechar.length; i++){
                auxnombre = fileale.readChar();
                nombrechar[i] = auxnombre; //voy guardando los caracteres en el array
            }
            String nombre = new String(nombrechar);
            asiento = fileale.readInt();
            for (int i = 0; i < deptchar.length; i++){
                auxdept = fileale.readChar();
                deptchar[i] = auxdept; //voy guardando los caracteres en el array
            }
            String departamento = new String(deptchar);
            coma = fileale.readChar();
            for (int i = 0; i < dispochar.length; i++){
                auxdispo = fileale.readChar();
                dispochar[i] = auxdispo; //voy guardando los caracteres en el array
            }
            String dispositivos = new String(dispochar);
            //si tienen en id mayor a -1(si no estan eliminados), imprimios las variables
            if(id >=-1){
                System.out.println("ID: " + id + coma + " Nombre: " + nombre + 
                        coma + " Asiento:" + asiento + coma + " Dept: " + departamento +
                        coma + " Dispo:" + dispositivos);
            }
            posicion = posicion + 60;//pasamos al siguiente empleado
            //si llegamos al byte funal, nos salismo
            if (fileale.getFilePointer() == fileale.length()){
                break;
            }
            
        }
        fileale.close();
    }

    private static void eliminardatos() throws FileNotFoundException, IOException {
        //Introducimos el fichero 
        System.out.println("Introduce el fichero donde quires eliminar un dato");
        String fichero = sc.nextLine();
        File file = new File(fichero);
        BufferedReader leerfich = new BufferedReader(new FileReader(file));
        String linea;
        //preguntamos el id 
        System.out.println("Introduce el primer dato de la entidad a borrar");
        String primervalor = sc.nextLine();
        int registro = 0;
        //Bucle para ver todas las lineas del fichero
        while((linea = leerfich.readLine())!=null){
            char[] arraycadena;
                char caracter = ';';
                int contador = 0;
                String dato;
                arraycadena = linea.toCharArray();
                int contadorA=0,contadorB=0;
                ArrayList datos = new ArrayList();
                //bucle que guardado en dato las ids de cada linea
                for(int i = 0; i < arraycadena.length;i++){
                    if (arraycadena[i]==caracter){
                        contador++;
                        contadorB = i;
                        contadorA = 0;
                        dato = linea.substring(contadorA,contadorB);
                        datos.add(dato);
                        break;
                    }
                }
                //si coicniden el id introducido con alguno del fichero lo cambiamos a -1
            if (datos.contains(primervalor)){
                RandomAccessFile fileram = new RandomAccessFile(file, "rw");
                int posicion = (registro)*60;
                fileram.seek(posicion);
                fileram.writeInt(-1);
                fileram.close();
                leerfich.close();
                break;
            }  
            registro++;
        }
        leerfich.close();
    }


    private static void crearxml() throws FileNotFoundException, IOException {
        try {
            //INTRODUCCION
            System.out.println("Introduce un fichero");
            String fich = sc.nextLine();
            File ficherorigen = new File(fich);
            BufferedReader leerfich1 = new BufferedReader(new FileReader(ficherorigen));
            BufferedReader leerfich2 = new BufferedReader(new FileReader(ficherorigen));
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder creador = factory.newDocumentBuilder();
            Document documento = creador.newDocument();//Creamos un documento xml
            //CREAMOS NODOS Y LOS AÑADIMOS
            //RAIZ
            System.out.println("Introduce el elemento Raiz");
            String raiz = sc.nextLine();
            Element elementoraiz = documento.createElement(raiz);
            documento.appendChild(elementoraiz);
            //ELMENTO QUE CUELGA DE RAIZ
            System.out.println("Introduce que contiene cada linea en singular");
            String raizele = sc.nextLine();
            String lineaa;
            int contadorlinea = 0;
            //Miramos cuantos "<Empleado>" hay
            while((lineaa = leerfich1.readLine())!=null){
                contadorlinea++;
            }
            leerfich1.close();
            Element raizelemento [] = new Element[contadorlinea];//creamos un array de 5 de <Empleado>
            //CREAMOS LOS DATOS
            Boolean algo = false;
            int contador = 0;
            contadorlinea=0;
            String lineab;
            //En cada <Empleado>....
            while((lineab = leerfich2.readLine())!=null){
                char[] arraycadena;
                char caracter = ';';
                String dato = null;
                contador = 0;
                arraycadena = lineab.toCharArray();
                int contadorA=0,contadorB=0;
                //Bucle que me dice cuantos datos hay en cada empleado
                for(int i = 0; i < arraycadena.length;i++){
                    if (arraycadena[i]==caracter){
                        contador++;
                    }
                }
                //creamos un array del total de datos que tiene el empleado(5)
                Element elementonombre[] = new Element[contador];
                //Al ya saber cuantos datos hay, pregunte solo una vez como se llama el elemento
            if (algo.equals(false)){
                for(int i = 0; i < contador;i++){
                    System.out.println("Introduce el nombre del " + (i+1) + "º" + " Atributo");
                    String nombredato = sc.nextLine();
                    //Escribimos un nombre al elemento y lo añadimos al xml
                    //Decimos el dato[i] se llama xxxx
                   elementonombre[i] = documento.createElement(nombredato);
                   //Bucle que me añade el titulo del dato en cada empleado
                    for(int j = 0; j < raizelemento.length;j++){
                        //Creamos que cada <Empleado> creamos un elemento
                        raizelemento[j] = documento.createElement(raizele);
                        //Decimos que de <Empleados> salen <Empleado> (se hará 5 veces)
                        elementoraiz.appendChild(raizelemento[j]);
                        Element elemento = elementonombre[i];
                        raizelemento[j].appendChild(elemento);
                    }
                }
                algo = true;
                contador = 0;
                //bucle que guardada cada dato en en el texto del elemento
                for(int i = 0; i < arraycadena.length;i++){
                        if (arraycadena[i]==caracter){
                            contador++;
                            contadorB = i;
                            if (contadorA == 0){
                                dato = lineab.substring(contadorA,contadorB);
                                contadorA =contadorB;
                            }
                            else{
                                dato = lineab.substring(contadorA+1,contadorB);
                                contadorA = contadorB; 
                            }
                            //Añadimos un valor al dato añadido y lo añadimos al xml
                            Text textoNombre = documento.createTextNode(dato);
                            elementonombre[contador-1].appendChild(textoNombre);
                        }
                
                }
            } else {
                contador = 0;
                //bucle que guardada cada dato en en el texto del elemento
                 for(int i = 0; i < arraycadena.length;i++){
                        if (arraycadena[i]==caracter){
                            contador++;
                            contadorB = i;
                            if (contadorA == 0){
                                dato = lineab.substring(contadorA,contadorB);
                                contadorA =contadorB;
                            }
                            else{
                                dato = lineab.substring(contadorA+1,contadorB);
                                contadorA = contadorB; 
                            }
                            //Añadimos un valor al dato añadido y lo añadimos al xml
                            Text textoNombre = documento.createTextNode(dato);
                            elementonombre[contador-1].appendChild(textoNombre);
                        }
                }
            }
            contadorlinea++;
            }
            leerfich2.close();
            //TRANSFORMADOR A XML     
            TransformerFactory fábricaTransformador = TransformerFactory.newInstance();
            Transformer transformador ;
            try {
                transformador =fábricaTransformador.newTransformer(); 
                //Insertamos un salto de linea al final de cada linea
                transformador.setOutputProperty(OutputKeys.INDENT, "yes");
                //Añadimos tres espacios  en funcion del nodo
                transformador.setOutputProperty(OutputPropertiesFactory.S_KEY_INDENT_AMOUNT, "3");
                //Indicamos donde se genera el xml
                Source origen = new DOMSource(documento);
                System.out.println("Introduce la direccion y el  nombre para el xml");
                String xml = sc.nextLine();
                Result destino = new StreamResult(xml);
                //transformamos el docuemnto a xml donde le hemos indicado
                transformador.transform(origen, destino);
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(Practica4.class.getName()).log(Level.SEVERE, null, ex);
            }  catch (TransformerException ex) {
                System.out.println("ERROR: No se ha podido crear la salida del documento XML\n"+ex.getMessage());
            }
        } catch (ParserConfigurationException ex) {
            System.out.println("No se ha podido crear el creador de xml");
        }
    }  
}
