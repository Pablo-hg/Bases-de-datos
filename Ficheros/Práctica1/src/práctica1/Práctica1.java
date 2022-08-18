
package práctica1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*Realizar un programa que realice un encriptador/desencriptador de ficheros.
    Deberá aparecer un menú con las siguientes opciones:
        1.- Encriptar un fichero.
        2.- Desencriptar un fichero.
        3.- Salir.
    Si teclea un 1 se deberán realizar las siguientes acciones:
    - Pedir un nombre de fichero. Si no existe mensaje de error.
    - Si existe se pedirá por pantalla una contraseña y se creara un fichero
      que contenga lo siguiente:
	.- Primera línea: “Contraseña:valor”. Valor el pedido por pantalla.
	.- A continuación se ecribirá todo el fichero encriptado con los
           caracteres según la siguiente correspondencia:
                origen=“abcdefghijkl……….xyz”
                encrip=“ghtsdfqdwh…………….caq” .
            El resto de caracteres se escribirán igual.
    Si se teclea un 2 se realizarán las siguientes acciones:
    .- Pedir un nombre de fichero. Si no existe mensaje de error.
    .- Si existe se pedirá por pantalla una contraseña si la contraseña
    coincide con la del fichero, se visualizará por pantalla el contenido 
    desencriptado del fichero, sino coincide el mensaje de contraseña no valida.*/



public class Práctica1 {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        
        System.out.println("1. Encriptar un fichero");
        System.out.println("2. Desencriptar un fichero");
        System.out.println("3. Salir");
        
        int opcion = Integer.parseInt(sc.nextLine());
        
        switch(opcion){
            case 1:
                Encriptar();
                break;
            case 2:
                Desencriptar();
                break;
            case 3:
                Salir();
                break;
            default:
        }
    }

    private static void Encriptar(){
        System.out.println("Introduce el nombre del fichero a encriptar");
        String nombree = sc.nextLine();
        File fich = new File(nombree);
        
        if (fich.exists()){
            System.out.println("No existe el fichero ("+nombree+")");
        }
        else{
            //Si fich es un fichero...
                System.out.println("Escribe una contraseña para encriptar");
                String contra = sc.nextLine();
                BufferedWriter fichero;
                try {
                    fichero = new BufferedWriter (new FileWriter(nombree));
                    fichero.write("Contraseña: " + contra);
                    fichero.newLine();//Saltamos de linea
                    System.out.println("Escribe el texto a encriptar");
                    String texto = sc.nextLine();
                    //Guardamos cada letra del texto en una posicion
                    char array[] = texto.toCharArray();
                    for(int i =0; i<array.length;i++){
                        //a cada letra le sumanos 5 posiciones del abacedario ASCII
                        array[i] = (char)(array[i] + (char)5);
                    }
                    //guardamos los nuevos valores es un string
                    String encriptado = String.valueOf(array);
                    fichero.write(encriptado);//Escribimos todo el texto(el String "encriptado)
                    fichero.close();
                } catch (IOException ex) {
                    System.out.println("Error de E/S");
                }  
            
        }
    }

    private static void Desencriptar() {
        System.out.println("Introduce el nombre del fichero a desencriptar");
        String nombred = sc.nextLine();
        File fich = new File(nombred);
        
        if (!fich.exists()){
            System.out.println("No existe el fichero ("+nombred+")");
        }
        else{
            if (fich.isFile()){
                System.out.println("Escribe la contraseña");
                String contrad = ("Contraseña: " +sc.nextLine());
                BufferedReader fichero;
                try {
                    fichero = new BufferedReader (new FileReader(nombred));
                    try {
                        String contraseña = fichero.readLine();
                        if (contrad.equals(contraseña)){
                            System.out.println("Contraseña aceptada");
                            int i ;
                            char b[] = new char [100];
                            while ((i = fichero.read(b)) !=-1){//i vale el total de carcateres que escriba
                                String desencriptado = "";
                                desencriptado = desencriptado + String.valueOf(b);//voy añadiendo los acrcateres al String desencriptado
                                char arrayD[] = desencriptado.toCharArray();
                                for (int j = 0; j < arrayD.length; j++){
                                    arrayD[j] = (char)(arrayD[j]-(char)5);
                                    if (j+1 == i){//si j+1 es igual al total de carcateres que escriba(osea i)
                                        break;
                                    }
                                }
                                String textofinal = String.valueOf(arrayD);
                                System.out.println(textofinal);
                            }
                        } else System.out.println("La contraseña es invalida");
                    } catch (IOException ex) {
                        System.out.println("Error al Leer");
                    }
                } catch (FileNotFoundException ex) {
                    System.out.println("No se encuentra el fichero");
                }
            }
        }
    }
    
    private static void Salir() {
        System.out.println("Saliendo del programa");
        System.exit(0);
    }
}
