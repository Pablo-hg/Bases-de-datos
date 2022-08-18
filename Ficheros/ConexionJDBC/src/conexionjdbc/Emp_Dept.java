
package conexionjdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Emp_Dept {
    
    public static void main (String [] args) {
        
        try{
            try {
                //driver
                Class.forName("oracle.jdbc.OracleDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Emp_Dept.class.getName()).log(Level.SEVERE, null, ex);
            }
            //conexion
            Connection conexion2 = DriverManager.getConnection
                 ("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
            //pedimos por pantalla el codigo del departamento
            Scanner pantalla = new Scanner(System.in);
            String cod_dep;
            int encontrado = 0;
            do{
                System.out.println("Introduzca el codigo del departamento");
                cod_dep = pantalla.nextLine();
                //Select de los empleados de departamentro que le hemos pasado
                String sql;
                sql = "select * from departments where department_id="+cod_dep;
                //creamos la sentencia con la conexion
                Statement sentencia = conexion2.createStatement();
                //guardamos en el resulset el resultadod del sql
                ResultSet filas;
                filas = sentencia.executeQuery(sql);
                //imprimimos mientras haya algo la columnas
                if(filas.next()){
                    System.out.println("Los datos del departamento son \n\n");
                    System.out.println("Departamento: " + filas.getString(1));
                    System.out.println("Nombre......: " + filas.getString(2));
                    System.out.println("Responsable.: " + filas.getString(3));
                    System.out.println("DLocalidad..: " + filas.getString(4));
                    encontrado = 1;
                    filas.close();
                    sentencia.close();
                    //Sacar la informacion de los empleados del departamento que hay por pantalla
                    String sql2;
                    sql2="SELECT EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME NOMBRE, EMAIL, SALARY, PHONE_NUMBER "+
                         "from employees "+
                         "where department_id ="+cod_dep;
                    Statement sentencia2 = conexion2.createStatement();
                    ResultSet filas2;
                    System.out.println("\nDatos de los empleados del departamento " + cod_dep+"\n");
                    filas2 = sentencia2.executeQuery(sql2);
                    int registros=0;
                    while (filas2.next()){
                        System.out.print(" "+filas2.getString(1));
                        System.out.print(" "+filas2.getString(2));
                        System.out.print(" "+filas2.getString(3));
                        System.out.print(" "+filas2.getString(4));
                        System.out.println(" "+filas2.getString(5));
                        registros = registros + 1;
                    }
                    System.out.println("Hay "+registros+ " empleados");
                    filas2.close();
                    sentencia2.close();
                }
                else  System.out.println("Departamento no existente");
            }while(encontrado==0);
            conexion2.close();
        }   catch (SQLException ex) {
            Logger.getLogger(Emp_Dept.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


    



