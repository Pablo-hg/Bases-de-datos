
package conexionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.lang.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insert_Delete {
    
    /* Isertar por consola:
    INSERT INTO EMPLOYEES (EMPLOYEE_ID,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,SALARY,DEPARTMENT_ID)
    VALUES (9944,'MARTIN PEREZ','marper@ceu.es','10/10/2019','AC_MGR',5000,30)
    */
    
    public static void main (String [] args) {
        
        //INSERTAR
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
            Statement sentencia = conexion.createStatement();
            Scanner pantalla = new Scanner(System.in);
            String cod_empl;
            String email;
            System.out.println("Introduzca el codigo de empelado");
            cod_empl = pantalla.nextLine();
            System.out.println("Introduzca el email del empleado");
            email = pantalla.nextLine();
            /*String sql2 = "INSERT INTO EMPLOYEES (EMPLOYEE_ID,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,SALARY,DEPARTMENT_ID)" +
                            "VALUES (2168,'MARTIN PEREZ','otr4@ceu.es','10/10/2019','AC_MGR',5000,30)";*/
            String sql = "INSERT INTO EMPLOYEES (EMPLOYEE_ID,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,SALARY,DEPARTMENT_ID)" +
                            "VALUES ("+cod_empl+",'MARTIN PEREZ','"+email+"','10/10/2019','AC_MGR',5000,30)";
            int nreg;
            nreg = sentencia.executeUpdate(sql);
            System.out.println(nreg + " fila insertada");
            //sentencia2.close();
            String sql2 = "SELECT EMPLOYEE_ID,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,SALARY,DEPARTMENT_ID "+
                    "FROM EMPLOYEES " +
                    "WHERE EMPLOYEE_ID ="+cod_empl;
            Statement sentencia2 = conexion.createStatement();
            ResultSet filas;
            System.out.println(sql2);
            System.out.println("\n\n Datos del empleados insertado");
            filas = sentencia.executeQuery(sql2);
            while(filas.next()){
                System.out.println("Numero:     "+filas.getString(1));
                System.out.println("NOmbre:     "+filas.getString(2));
                System.out.println("Email:     "+filas.getString(3));
                System.out.println("Fecha:     "+filas.getString(4));
                System.out.println("Trabajo:     "+filas.getString(5));
                System.out.println("Salario:     "+filas.getString(6));
                System.out.println("Departamento:     "+filas.getString(7));
            }
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Insert_Delete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Insert_Delete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        //ELIMINAR
        /*try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
            Statement sentencia = conexion.createStatement();
            Scanner pantalla = new Scanner(System.in);
            String codempl;
            System.out.println("Introduzca el codigo del empleado");
            codempl=pantalla.nextLine();
            String sql = "SELECT EMPLOYEE_ID,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,SALARY,DEPARTMENT_ID "+
                    "FROM EMPLOYEES " +
                    "WHERE EMPLOYEE_ID ="+codempl;
            Statement sentencia2 = conexion.createStatement();
            ResultSet filas;
            filas = sentencia2.executeQuery(sql);
            if(filas.next()){
                System.out.println("Numero:     "+filas.getString(1));
                System.out.println("NOmbre:     "+filas.getString(2));
                System.out.println("Email:     "+filas.getString(3));
                System.out.println("Fecha:     "+filas.getString(4));
                System.out.println("Trabajo:     "+filas.getString(5));
                System.out.println("Salario:     "+filas.getString(6));
                System.out.println("Departamento:     "+filas.getString(7));
                System.out.println("\n\n ¿Quieres borrar el empleado " + codempl+"?");
                String rep = pantalla.nextLine();
                if(rep.equals("S")){
                    String sql2 = "DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID =" + codempl;
                    int nreg = sentencia2.executeUpdate(sql2);
                    System.out.println("El empleado " + codempl + " ha sido borrado");
                    sentencia2.close();
                }
            }
            else System.out.println("El empleado " +codempl+" no existe");
            filas.close();
            sentencia.close();
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Insert_Delete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Insert_Delete.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
    }
}
