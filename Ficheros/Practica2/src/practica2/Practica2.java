package practica2;

import java.io.*;
import java.util.Scanner;

/*Realizar un programa que lea datos de un fichero de texto y cree un fichero 
binario con la misma información que el fichero de texto (no se guardan los “;” 
ya que son separadores. Posteriormente se visualizará por pantalla los campos 
1, 3, 5, del fichero binario creado.

El fichero de texto contendrá la información de una serie de elementos de una 
entidad tipo (banco, empleados, supermercados, hospitales, equipos, etc) del 
sistema de información que cada alumno tenga definido para las prácticas.
Cada línea del fichero tiene datos de un elemento de entidad y se separan
por “;” cada una de las propiedades (ejemplo empleados.txt). Este fichero
tiene para cada empleado las propiedades: código, nombre, apellidos, correo, 
fecha de entrada, trabajo y salario.*/


public class Practica2 {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        
        String linea;
        int id,di;
        String nombre = null;
        int asiento,a;
        String depart,de,n;
        String dispo,dis; 
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int contador = 0;
        
        System.out.println("Introduce la direccion fichero");
        String direccion = sc.nextLine();
        //Creamos el objeto fichero  que queremos copiar
        File fichero = new File(direccion);
        if (!fichero.exists()){//si no existe el foichero...
            System.out.println("No existe el fichero " + direccion );
        }
        else {
            System.out.println("Introduce la direccion donde quieres que se cree el fichero binario");
            String nombrebi = sc.nextLine();
            //Creamos el fichero binario
            File ficherobi = new File(nombrebi);
            if (ficherobi.exists()){
                System.out.println("ya existe un fichero llamado " + ficherobi);
            }
            else{
                try {
                    //creamos el objerto que nmos permite leere el fichero
                    BufferedReader leerfich = new BufferedReader(new FileReader(fichero));
                    //Creamos el objeto que nos permite escribir en binario en el fichero
                    DataOutputStream escribirbi = new DataOutputStream(new FileOutputStream(ficherobi));
                    //Creamos el objero que nos permite leer un fichero binario
                    DataInputStream leerbi = new DataInputStream(new FileInputStream(ficherobi));
                   while((linea = leerfich.readLine())!=null){//bucle que lee hasta que no haya lineas en el fichero
                        char[] arraycadena;
                        char caracter = ';';
                        arraycadena = linea.toCharArray();//convertimos la linea en un array de chars
                        for(int i = 0; i < arraycadena.length;i++){
                            //comprobamos que si hay un ;....
                            if (arraycadena[i]==caracter){
                                contador++;
                            }
                            if (contador == 1 && arraycadena[i]==caracter){
                                uno = i;
                            }
                            if (contador == 2 && arraycadena[i]==caracter){
                                dos = i;
                            }
                            if (contador == 3 && arraycadena[i]==caracter){
                                tres = i;
                            }
                            if (contador == 4 && arraycadena[i]==caracter){
                                cuatro = i;
                            }
                            if (contador == 5 && arraycadena[i]==caracter){
                                cinco = i;
                            }
                        }
                        //igualamos las varibales al substring de linea
                        id = Integer.parseInt(linea.substring(0, uno));
                        nombre = linea.substring(uno+1, dos);
                        asiento = Integer.parseInt(linea.substring(dos+1, tres));
                        depart = linea.substring(tres+1, cuatro);
                        dispo = linea.substring(cuatro+1, cinco);
                        contador = 0;
                        //escribimos en binario las varibales
                        escribirbi.writeInt(id);
                        escribirbi.writeUTF(nombre);
                        escribirbi.writeInt(asiento);
                        escribirbi.writeUTF(depart);
                        escribirbi.writeUTF(dispo);
                        //leemos las varibales binarias
                        di = leerbi.readInt();
                        n = leerbi.readUTF();
                        a = leerbi.readInt();
                        de = leerbi.readUTF();
                        dis = leerbi.readUTF();
                        //mostramos por pantalla los cmapos 1,3,5(id,asiento,dispositivos)
                        System.out.println(di +" " + a  + " " + dis );
                    }
                    //cerramos el flujo de datos que lee el fichero
                    leerfich.close();
                    //cerramos el flujo de datos que lee el fichero en binario
                    leerbi.close();
                    //cerramos el flujo de datos que escribe en el fichero en binario
                    escribirbi.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("Fallo al no encontrar el fichero");
                } catch (IOException ex) {
                    System.out.println("Error al L/E");
                }
            }
        }
    }
}
