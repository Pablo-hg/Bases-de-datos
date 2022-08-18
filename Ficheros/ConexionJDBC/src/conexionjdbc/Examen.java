
package conexionjdbc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Examen {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    
        
        int contador = 0;
        int uno = 0,cuatro = 0,cinco = 0;
        int id;
        String jobid;
        //nuevo
        /*int dos = 0, tres = 0, seis = 0,siete=0;
        String nombre,apellido,correo;
        int salar,dept;*/
        //nuevo

        System.out.println("Introduce el fichero de los empleados");
        String fichero = sc.nextLine();
        File fichA = new File(fichero);
        System.out.println("Intropduce la direccion del fic");
        String ficherob = sc.nextLine();
        if (!fichA.exists()){
                System.out.println("El fichero A no existe");
            }
        else {
            try {
                
                BufferedReader fich = new BufferedReader (new FileReader(fichero));
                BufferedWriter fiche = new BufferedWriter (new FileWriter(ficherob));
                String linea;
                while((linea = fich.readLine())!=null){
                    char[] arraycadena;
                    char caracter = ';';
                    arraycadena = linea.toCharArray();
                    for(int i = 0; i < arraycadena.length;i++){
                        if (arraycadena[i]==caracter){
                            contador++;
                        }
                        if(arraycadena[i]==caracter){
                            switch(contador){
                                case 1 : uno = i;
                                    break;
                                case 4 : cuatro = i;
                                     break;    
                                case 5 : cinco = i;
                                    break;
                                    //nuevo
                                /*case 2: dos = i;   
                                    break;
                                case 3: tres = i;
                                    break;
                                case 6: seis = i;
                                    break;
                                case 7: siete = i;
                                    break;*/
                                    //nuevo
                            }
                        }
                    }
                    id = Integer.parseInt(linea.substring(0,uno));
                    jobid = linea.substring(cuatro+1,cinco);
                    //nuevo
                    /*nombre = linea.substring(uno+1,dos);
                    apellido = linea.substring(dos+1,tres);
                    correo = linea.substring(tres+1,cuatro);
                    salar = Integer.parseInt(linea.substring(cinco+1,seis));
                    dept = Integer.parseInt(linea.substring(seis+1,siete));*/
                    //nuevo
                    
                    try {
                        Class.forName("oracle.jdbc.OracleDriver");
                        Connection conexion2 = DriverManager.getConnection
                                    ("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
                        Statement sentencia  = conexion2.createStatement();
                        ////
                        String sql = "select * from employees where employee_id=" + id;
                        ResultSet fila = sentencia.executeQuery(sql);
                        int registros = 0;
                        while(fila.next()){
                            registros++;
                        }
                        //si está ya en la tabla,escribimos el error
                        if(registros!=0){
                            fiche.write("Error: Codigo " + id + " de empleado existente");
                            fiche.newLine();
                        }
                        ////
                        Statement sentencia2 = conexion2.createStatement();
                        String sql2 = "select * from jobs where job_id='"+jobid+"'";
                        ResultSet fila2 = sentencia2.executeQuery(sql2);
                        int registros2 = 0;
                        while(fila2.next()){
                            registros2++;
                        }//si no existe en la tabla, se escreibe el error.
                        if(registros2==0){//==
                            fiche.write("Error: Codigo " + jobid  + " de cídgo de empleo");
                            fiche.newLine();
                        }
                        //si no ha pasado las validaciones...
                        if(registros==0&&registros2!=0){
                            /*Statement sentencia3 = conexion2.createStatement();
                            String sql3 = "INSERT INTO EMPLOYEES (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,JOB_ID,SALARY,DEPARTMENT_ID)" +
                            "VALUES ("+id+",'"+nombre+"','"+apellido+"','"+correo+"','"+jobid+"',"+salar+",30)";
                            sentencia3.executeUpdate(sql3);*/
                        }
                        
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    contador = 0;
                    
                }
                
                fiche.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
