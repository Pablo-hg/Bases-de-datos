
package conexionjdbc;
import java.sql.*;
import java.util.Scanner;
public class Emp_Dept_PHG {
    public static void main (String [] args) {
    try
    {
    Class.forName("oracle.jdbc.OracleDriver");
    Connection conexion2 = DriverManager.getConnection
             ("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
    Scanner pantalla=new Scanner(System.in);
    String cod_dep;
    int encontrado =0;
    do
    {
    System.out.println("Introduzca el c�digo del departamento");
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
            
            /* principio copdigo java para sacar la informacion de los empleados del 
               departamento que hay por pantalla
            */

            String sql2;
            sql2="SELECT EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME NOMBRE, EMAIL, SALARY, PHONE_NUMBER, JOB_ID "+
            "from employees "+
            "where department_id ="+cod_dep;
            Statement sentencia2 = conexion2.createStatement();
            ResultSet filas2;
            System.out.println("\nDatos de los empleados del departamento\n");
            filas2 = sentencia2.executeQuery(sql2);
        int registros=0;
            System.out.println("Id     Nombre                 Email        Salario      Tel�fono");
            System.out.println("====== ======================= ============ ============ ========");
        while (filas2.next())
        {
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
            //Insertar un empleado en jobs, pidiendo por pantalla el cod del empleado y su descripcion
            Class.forName("oracle.jdbc.OracleDriver");
            conexion2 = DriverManager.getConnection("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
            sentencia = conexion2.createStatement();
            System.out.println("Introduce el codigo del nuevo empleado");
            String id = pantalla.nextLine();
            System.out.println("Introduce la descripcion del empleado");
            String desc = pantalla.nextLine();
            sql = "INSERT INTO JOBS (JOB_ID,JOB_TITLE,MIN_SALARY,MAX_SALARY) " +//nos podriamos ahorrar el congendio de los parenteis)
                    "VALUES('"+id+"','"+desc+"',100,10000)";
            System.out.println("Empleado dado de alta");
            sentencia.execute(sql);
            sentencia.close();
            conexion2.close();
            
            //UPDATE
            //actualizar el codigo del empleado de la tabla employees que trabaje en el departamento que le pasemos
            Class.forName("oracle.jdbc.OracleDriver");
            conexion2 = DriverManager.getConnection("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
            Statement sentencia3 = conexion2.createStatement();
            String sql3= "UPDATE EMPLOYEES"
                    + " SET JOB_ID ='"+id+
                    "' WHERE EMPLOYEE_ID=114";
            sentencia3.executeUpdate(sql3);
            System.out.println("Empleado actualizado");
            sentencia3.close();
            conexion2.close();
            
            //CONSULTA
            //mostrar los datos de los empleados(tabla employees) del departamento seleccionado,añadiendo la descripcion(tabla jobs).
            Class.forName("oracle.jdbc.OracleDriver");
            conexion2 = DriverManager.getConnection("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
            sentencia = conexion2.createStatement();
            String sql4 = "SELECT EMPLOYEE_ID, EMAIL, SALARY, PHONE_NUMBER, JOB_TITLE  "
                    + "FROM EMPLOYEES,JOBS  "
                    + "WHERE EMPLOYEES.JOB_ID = JOBS.JOB_ID AND " 
                    + "EMPLOYEES.DEPARTMENT_ID  = " + cod_dep;
            sentencia = conexion2.createStatement();
            System.out.println("Datos de los empleados del departamento:"
                    + "");
            ResultSet fila = sentencia.executeQuery(sql4);
            while(fila.next()){
                        System.out.println("EMPLOYEE_ID:  " + fila.getString(1));
                        System.out.println("EMAIL:  " + fila.getString(2));
                        System.out.println("SALARY:  " + fila.getString(3));
                        System.out.println("PHONE_NUMBER:  " + fila.getString(4));
                        System.out.println("JOB_TITLE :  " + fila.getString(5));
                        System.out.println("\n");
            }
            fila.close();
            sentencia.close();
            conexion2.close();
            /*Fin sentencias examen */

        }
    else System.out.println("Departamento no existente");
    }
    while (encontrado==0);    


    conexion2.close();
        
        
    }
    
    catch (ClassNotFoundException cn) {cn.printStackTrace();}
    catch (SQLException e) {e.printStackTrace();} 
    
}
}
