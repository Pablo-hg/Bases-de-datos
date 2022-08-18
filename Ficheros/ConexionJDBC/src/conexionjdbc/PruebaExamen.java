
package conexionjdbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PruebaExamen {
    
    public static void main (String [] args) {
      
        String id,titulo,minsalar,maxsalar,sql,sql2;
        ResultSet fila;
        Statement sentencia,sentencia2,sentencia3;
        Connection conexion,conexion2;
        try {
            System.out.println("MENÚ DE ACCIONES");
            System.out.println("1.Dar de alta a un trabajador");
            System.out.println("2.Eliminar un trabajador");
            System.out.println("3.Consultar los empleados");
            System.out.println("4.Cargar empleados");
            System.out.println("5.Salir");
            Scanner pantalla = new Scanner(System.in);
            String accion = pantalla.nextLine();
            switch(accion){
                case "1" : //INSERTAR TRABAJADOR
                    Class.forName("oracle.jdbc.OracleDriver");
                    conexion = DriverManager.getConnection("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
                    sentencia = conexion.createStatement();
                    System.out.println("Introduce el ID");
                    id = pantalla.nextLine();
                    System.out.println("Introduce el titulo");
                    titulo = pantalla.nextLine();
                    System.out.println("Introduce el min del salario");
                    minsalar = pantalla.nextLine();
                    System.out.println("Introduce el max del salario");
                    maxsalar = pantalla.nextLine();
                    sql = "INSERT INTO JOBS (JOB_ID,JOB_TITLE,MIN_SALARY,MAX_SALARY)"+
                         "VALUES('"+id+"','"+titulo+"',"+Integer.parseInt(minsalar)+","+Integer.parseInt(maxsalar)+")";
                    System.out.println("Trabajador dado de alta");
                    sentencia.execute(sql);
                    sql2 = "SELECT JOB_ID,JOB_TITLE,MIN_SALARY,MAX_SALARY "+
                            "FROM JOBS " +
                            "WHERE JOB_ID = '"+id+"'";
                    sentencia2 = conexion.createStatement();
                    System.out.println("\n\nDato del empelado Insertado");
                    fila = sentencia.executeQuery(sql2);
                    if(fila.next()){
                        System.out.println("Id:          "+fila.getString(1));
                        System.out.println("Titulo:      "+fila.getString(2));
                        System.out.println("Min salario: "+fila.getString(3));
                        System.out.println("Max salario: "+fila.getString(4));
                    }
                    sentencia2.close();
                    sentencia.close();
                    conexion.close();
                break;
                case "2"://ELIMINAR TRABAJADOR
                    Class.forName("oracle.jdbc.OracleDriver");
                    conexion = DriverManager.getConnection("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
                    sentencia = conexion.createStatement();
                    System.out.println("Introduce el id del trabajador a eliminar");
                    id = pantalla.nextLine();
                    sql = "SELECT JOB_ID,JOB_TITLE,MIN_SALARY,MAX_SALARY " +
                          "FROM JOBS "+
                          "WHERE JOB_ID ='"+id+"'";
                    sentencia = conexion.createStatement();
                    fila = sentencia.executeQuery(sql);
                    if(fila.next()){
                        System.out.println("Id:          "+fila.getString(1));
                        System.out.println("Titulo:      "+fila.getString(2));
                        System.out.println("Min salario: "+fila.getString(3));
                        System.out.println("Max salario: "+fila.getString(4));
                        System.out.println("\n\n¿Quieres borrar el trabajador?");
                        String rep = pantalla.nextLine();
                        if(rep.equals("S")){
                            sql2= "DELETE FROM JOBS WHERE JOB_ID='"+id+"'";
                            sentencia.executeQuery(sql2);
                            sentencia.close();
                            System.out.println("El trabajador " +  id + " ha sido eliminado");
                        }
                    }
                    else System.out.println("No hay nigun trabajador con el id " + id);
                    fila.close();
                    sentencia.close();
                    conexion.close();
                break;   
                case "3"://CONSULTAR EMPLEADOS
                    Class.forName("oracle.jdbc.OracleDriver");
                    conexion = DriverManager.getConnection("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
                    sentencia = conexion.createStatement();
                    System.out.println("Introduce el id del departamento a consultar");
                    String iddept = pantalla.nextLine();
                    sql = "SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, JOB_TITLE, EMAIL, PHONE_NUMBER "
                            + "FROM EMPLOYEES,JOBS "
                            + "WHERE EMPLOYEES.JOB_ID = JOBS.JOB_ID AND " 
                            + "EMPLOYEES.DEPARTMENT_ID  = " + iddept;
                    sentencia = conexion.createStatement();
                    fila = sentencia.executeQuery(sql);
                    while(fila.next()){
                        System.out.print(" " + fila.getString(1));
                        System.out.print(" " + fila.getString(2));
                        System.out.print(" " + fila.getString(3));
                        System.out.print(" " + fila.getString(4));
                        System.out.print(" " + fila.getString(5));
                        System.out.println(" " + fila.getString(6));
                    }
                    fila.close();
                    sentencia.close();
                    conexion.close();
                break; 
                case "4": //CARGAR EN UN TXT LOS EMPLEADOS
                    File fichero = new File("D:\\Cosas de clase\\Cosas de todo\\NetBeansProjects"+
                            "\\SEGUNDO\\Datos\\Antonio\\2ºEVA\\ConexionJDBC\\src\\conexionjdbc\\EMPLEADOS.txt");
            {
                try {
                    FileReader fic = new FileReader(fichero);
                    int i;
                    char caracter = ';';
                    char[] arraycadena;
                    try {
                        String linea;
                        while((i = fic.read())!= -1){
                        System.out.print((char)i);
                        }
                        
                        
                        /*
                        String id,nombre,apellidos,email,fecha,dept;
                        int salario
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
                                case 6 : cinco = i;
                                        break;
                                case 7 : cinco = i;
                                        break;
                            }
                        }
                        id = Integer.parseInt(linea.substring(0, uno));
                        nombre = linea.substring(uno+1, dos);
                        apellidos = linea.substring(dos+1, tres);
                        email = linea.substring(tres+1, cuatro);
                        fecha = linea.substring(cuatro+1, cinco);
                        dept = linea.substring(cinco+1, seis);
                        salario = Integer.parseInt(linea.substring(seis+1, siete));
                        */
                        fic.close();
                    } catch (IOException ex) {
                        Logger.getLogger(PruebaExamen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(PruebaExamen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    
                break;        
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PruebaExamen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PruebaExamen.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
