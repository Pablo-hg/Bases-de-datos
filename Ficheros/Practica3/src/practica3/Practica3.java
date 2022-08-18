
package practica3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/*Realizar un programa que lea datos de dos ficheros de texto que tengan una
relación maestro-detalle (relación uno a varios, en un departamento trabajan
varios empleados, en un pedido hay varios productos, un alumno está matriculado
de varias asignaturas, etc) y cree dos ficheros de datos serializables, uno con 
cada fichero con la misma información que el fichero de texto (no se guardan
los “;” ya que son separadores. 

Posteriormente se pedirá por pantalla en código de una entidad maestra
(departamento, pedido, alumno) y se visualizará por pantalla la información
de los detalles de esa entidad (empleados, productos, asignaturas, etc)*/


public class Practica3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //creamosa las variables 
        Empleado empleado = null;
        Ordenador ordenador = null;
        int contador = 0,uno = 0,dos = 0,tres = 0,cuatro = 0,cinco = 0,seis=0,siete=0,ocho=0,nueve=0,diez=0;
        int id;
        String nombre = null;
        int asiento;
        String depart;
        String dispo;
        String departamento,dueño,placa,procesador, tarjeta,memoriaram, alimentacion,disco,ventilacion,torre;
        //Comprobacion de ficheros
        System.out.println("Introduce un fichero A");
        String ficheroA = sc.nextLine();
        File fichA = new File(ficheroA);
        if (!fichA.exists()){
            System.out.println("El fichero A no existe");
        }
        else {
            System.out.println("Introduce un fichero B");
            String ficheroB = sc.nextLine();
            File fichB = new File(ficheroB);
            if (!fichB.exists()){
                System.out.println("El fichero B no existe");
            }
            else {
                System.out.println("Introduce la ubicacion y el nombre del nuevo fichero Serializable A");
                String ficheroseA = sc.nextLine();
                File fichseA = new File(ficheroseA);
                if (fichseA.exists()){
                    System.out.println("El fichero " + fichseA + " ya existe");
                }
                else {
                    System.out.println("Introduce la ubicacion y el nombre del nuevo fichero Serializable B");
                    String ficheroseB = sc.nextLine();
                    File fichseB = new File(ficheroseB);
                    if (fichseB.exists()){
                        System.out.println("El fichero " + fichseB + " ya existe");
                    }
                    else {
                        //PRIMERA PARTE DEL PROGRAMA
                        //FICHERO A
                        //Creamos el objetoA de escritura
                        FileOutputStream fileA = new FileOutputStream(fichseA,true);
                        //Creamos el objetoA de escritura de objetos
                        ObjectOutputStream dataA = new ObjectOutputStream(fileA); 
                        //Creamos el objetoA de leer
                        BufferedReader leerfichA = new BufferedReader(new FileReader(fichA));
                        String linea;
                        //bucle que lee el fichero A hasta que no haya mas lineas
                        while((linea = leerfichA.readLine())!=null){
                            char[] arraycadena;
                            char caracter = ';';
                            arraycadena = linea.toCharArray();//convertimos la linea en un array de chars
                            for(int i = 0; i < arraycadena.length;i++){
                                //comprobamos que si hay un ;....
                                if (arraycadena[i]==caracter){
                                    contador++;
                                }
                                //si el caracter es un ; y depende de que nº sea...
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
                        id = Integer.parseInt(linea.substring(0, uno));
                        nombre = linea.substring(uno+1, dos);
                        asiento = Integer.parseInt(linea.substring(dos+1, tres));
                        depart = linea.substring(tres+1, cuatro);
                        dispo = linea.substring(cuatro+1, cinco);
                        contador = 0;
                        //metemos las varibales en el constructor de empleado
                        empleado = new Empleado(id,nombre,asiento,depart,dispo);
                        //escribimos el objeto en binario
                        dataA.writeObject(empleado);
                        }
                        //FICHERO B
                        //Creamos el objetoA de escritura
                        FileOutputStream fileB = new FileOutputStream(fichseB,true);
                        //Creamos el objetoA de escritura de objetos
                        ObjectOutputStream dataB = new ObjectOutputStream(fileB);  
                        //Creamos el objetoA de leer
                        BufferedReader leerfichB = new BufferedReader(new FileReader(fichB));
                        String lineab;
                        //bucle que lee el fichero A hasta que no haya mas lineas
                        while((lineab = leerfichB.readLine())!=null){
                            char[] arraycadena;
                            char caracter = ';';
                            arraycadena = lineab.toCharArray();//convertimos la linea en un array de chars
                            for(int i = 0; i < arraycadena.length;i++){
                                //comprobamos que si hay un ;....
                                if (arraycadena[i]==caracter){
                                    contador++;
                                }
                                //si el caracter es un ; y depende de que nº sea...
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
                                        case 6: seis = i;
                                            break;
                                        case 7: siete = i;
                                            break;
                                        case 8: ocho = i;
                                            break;
                                        case 9: nueve = i;
                                            break;
                                        case 10: diez = i;
                                            break;
                                    }
                                }
                            }
                            //igualamos las varibales al substring de linea
                            departamento = lineab.substring(0, uno);
                            dueño = lineab.substring(uno+1, dos);
                            placa = lineab.substring(dos+1, tres);
                            procesador = lineab.substring(tres+1,cuatro);
                            tarjeta= lineab.substring(cuatro+1,cinco);
                            memoriaram=lineab.substring(cinco+1,seis);
                            alimentacion=lineab.substring(seis+1,siete);
                            disco=lineab.substring(siete+1,ocho);
                            ventilacion =lineab.substring(ocho+1,nueve);
                            torre = lineab.substring(nueve+1,diez); 
                            contador = 0;
                            ordenador = new Ordenador(departamento,dueño,placa,procesador,tarjeta,memoriaram,alimentacion,disco,ventilacion,torre);
                            dataB.writeObject(ordenador);
                        }
                        //cerramos los fujos de lectura y escritura
                        leerfichA.close();
                        dataA.close();
                        leerfichB.close();
                        dataB.close();
                        
                        //SEGUNDA PARTE DEL PROGRAMA
                        String deps[] = {"INFORMATICA","VENTAS","NOTICIAS"};
                        String dept = "";
                        while(true){
                            System.out.println("Introduce un departamento");
                            dept = sc.nextLine();
                            if (!Arrays.asList(deps).contains(dept)){
                                System.out.println("El departamentonoe existe");
                            } else 
                              break; 
                        }
                        //Creamos los objetos que leen el fichero binario
                        FileInputStream filaA = new FileInputStream(fichseA);
                        ObjectInputStream datiA = new ObjectInputStream(filaA); 
                        for(int j = 0; j < 5;j++){
                            empleado = (Empleado) datiA.readObject();
                            if (empleado.getDepartamento().equals(dept)){
                                if (empleado.getDispositivos().equals("ORDENADOR")){
                                    System.out.println("ID:" + empleado.getId() + " Nombre:" + empleado.getNombre()
                                    + " Asiento:" + empleado.getNumero() + " Dispositivo:" + ordenador.toString());   
                                } else{
                                    System.out.println("ID:" + empleado.getId() + " Nombre:" + empleado.getNombre()
                                    + " Asiento:" + empleado.getNumero() + " Dispositivo:" + empleado.getDispositivos());   
                                }
                            }
                        }
                    }
                }
            }
        }    
    }  
}
