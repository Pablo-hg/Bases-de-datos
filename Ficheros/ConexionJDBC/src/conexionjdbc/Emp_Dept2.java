package conexionjdbc;

import java.sql.*;
import java.util.Scanner;

public class Emp_Dept2 {
    
    public static void main (String [] args) {
        
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conexion2 = DriverManager.getConnection("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
            Scanner pantalla=new Scanner(System.in);
            String cod_dep;
            int encontrado =0;
            do{
                System.out.println("Introduzca el codigo del departamento");
                cod_dep = pantalla.nextLine();
                String sql;
                Statement sentencia=conexion2.createStatement();
                sql = "select * from departments where department_id="+cod_dep;
                ResultSet filas;
                filas = sentencia.executeQuery(sql);
                if (filas.next())
                    {
                        encontrado=1;
                        System.out.println("Los datos del departamento son \n\n");
                        System.out.println("Departamento: "+ filas.getString(1));
                        System.out.println("Nombre......: "+ filas.getString(2));
                        System.out.println("Responsable: "+ filas.getString(3));
                        System.out.println("Localidad...: "+ filas.getString(4));
                        filas.close();
                        sentencia.close();
                        String sql2;
                        sql2="SELECT EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME NOMBRE, EMAIL, SALARY, PHONE_NUMBER, JOB_ID "+
                        "from employees "+
                        "where department_id ="+cod_dep;
                        Statement sentencia2 = conexion2.createStatement();
                        ResultSet filas2;
                        System.out.println("\nDatos de los empleados del departamento\n");
                        filas2 = sentencia2.executeQuery(sql2);
                        int registros=0;
                        System.out.println("Id     Nombre                 Email        Salario      Telefono");
                        System.out.println("====== ======================= ============ ============ ========");
                        while (filas2.next()){
                            System.out.print(" "+filas2.getString(1));
                            System.out.print(" "+filas2.getString(2));
                            System.out.print(" "+filas2.getString(3));
                            System.out.print(" "+filas2.getString(4));
                            System.out.println(" "+filas2.getString(5));
                            registros = registros + 1;
                        }
                        System.out.println("\nHay "+registros+ " empleados");
                        filas2.close();
                        sentencia2.close();
                        /* fin copdigo java para sacar la informacion de los empleados del 
                           departamento que hay por pantalla
                        */

                        /*Principio sentencias examen */
                        /* iNSERTAR EMPLEO*/


                        /*Fin sentencias examen */

                    }
                else System.out.println("Departamento no existente");
            }
            while (encontrado==0);    


            conexion2.close();
        
        
        } catch (ClassNotFoundException cn) {cn.printStackTrace();
        }catch (SQLException e) {e.printStackTrace();
        } 
    }
}
