
package conexionjdbc;

import java.sql.*;
import java.lang.*;
import java.util.Scanner;

public class Conexion1 {
    
    public static void main (String [] args) {

        String actor="3";
        String pel="2";
        //desc EMPLOYEES; --> Ver la tabla
        //Tiene que estar activado el servicio de OracleServiceXE ( para estar local)
        //Tiene que estar activadoe l servicio de Oracle Listener(para una conexion cliente-servidor)
        //Para desbloaque un usuario --> alter user usuario identified by contra account unlock;
        try{
            //a traves del driver
            Class.forName("oracle.jdbc.OracleDriver");
            //F:\Programas\OracleDatabase11g\app\oracle\product\11.2.0\server\network\ADMIN
            //creamos la conexion a la base de datos "sdfsfsfsf:usuario/passwd@//asdadad"
            Connection conexion2 = DriverManager.getConnection
                 ("jdbc:oracle:thin:hr/HR@//localhost:1521/XE");
            //pedimos por pantalla los nombres del usuario y de la tabla o vista
            Scanner pantalla = new Scanner(System.in);
            String tabview;
            String esquema;
            System.out.println("Introduzca el esquema donde se busca la tabla o vista");
            esquema = pantalla.nextLine();
            System.out.println("Introduzca el nombre de la tabla o vista");
            tabview = pantalla.nextLine();
            //creamos una databasemetadara (clase que nos aporta info de la base de datos) sobre al conexion
            DatabaseMetaData dbms = conexion2.getMetaData();
            //Guardamos en variables los datos que queremos sacar
            String nombre = dbms.getDatabaseProductName();
            String driver = dbms.getDriverName();
            String url = dbms.getURL();
            String usuario = dbms.getUserName();
            String version = dbms.getDriverVersion();
            String juegoca = dbms.getExtraNameCharacters();
            System.out.println("\nNombre BD:      "+nombre);
            System.out.println("\nDriver   :      "+driver);
            System.out.println("\nURL      :      "+url);
            System.out.println("\nUsuario  :      "+usuario);
            System.out.println("\nVersion  :      "+version);
            System.out.println("\nJuego de caracteres  :      "+juegoca);
            ResultSet tablas_usuario;
            //no podemos saber las filas que contiene el resulset
            //tablas_usuario = dbms.getTables(catalogo,esquema,tabla,tipo)
            tablas_usuario = dbms.getTables(null,esquema,tabview,null);
            int encontrado = 0;
            //mientras next sea distinto de null
            while(tablas_usuario.next()){
                //imprimimos las columnas de las filas en cada bucle
                encontrado = 1;
                /*System.out.println(tablas_usuario.getString(1 + " "));
                System.out.println(tablas_usuario.getString(2 + " "));
                System.out.println(tablas_usuario.getString(3 + " "));
                System.out.println(tablas_usuario.getString(4 + " "));*/
                /*System.out.println("la tabla o vista " + tabview + " existe");
                System.out.println(" Nombre      Nulo       Tipo");*/
                System.out.println(" Nombre          Nulo    Tipo    ");
            }
            
            //al ser econtrado 0 siginifica que no hay ninfun resultado;
            if (encontrado ==0){
                System.out.println("la tabla o la vista no existe");
            }
            //si existe, mostramos las columnas
            else {
                //Creamos un resulset pasandolse el usuario y la tabla
                ResultSet columnas = dbms.getColumns(null, esquema, tabview, null);
                //cojemos las columas 4,11,6 y 7(NOMBRE,NUUL,TIPO Y CANTIDAD)
                while(columnas.next()){
                    System.out.print(" " + columnas.getString(4));
                    if (columnas.getString(11).equals(0)){
                        System.out.print("      NOT NULL ");
                    }
                    else{
                        System.out.print("      NULL ");
                    }
                    System.out.print("      " +columnas.getString(6));
                    System.out.println("(" +columnas.getString(7) +")");
                }
                //cerramos el result
                columnas.close();
                
                
                //COMINENZO EJECUCION SENTENCIA SQL
                String sql;
                //Select de todos los daots de la tabla employees
                //sql = "Select * from employees";
                //Select de x datos de los empleados del departamento 30
                sql = "SELECT EMPLOYEE_ID, FIRST_NAME ||' '||LAST_NAME, EMAIL, SALARY, PHONE_NUMBER "
                        + "from employees"
                        + " where department_id = 30";
                //Creamos el objeto sentencia a partir de la conexion
                Statement sentencia = conexion2.createStatement();
                //devolemos todas las filas
                ResultSet filas;
                //le pasamos al resulset la ejecucion del sql
                filas = sentencia.executeQuery(sql);
                int registros = 0;
                //imprimimos mientras haya algo la columnas
                while(filas.next()){
                    System.out.print(" " + filas.getString(1));
                    System.out.print(" " + filas.getString(2));
                    System.out.print(" " + filas.getString(3));
                    System.out.print(" " + filas.getString(4));
                    System.out.println(" " + filas.getString(5));
                    registros++;
                }
                filas.close();
                //sentencia.close();
                if(registros==0){
                    System.out.println("No hay empleados");
                }
                else System.out.println("Hay " + registros + " empleados");
                //FIN SENTENCIA SQL
                
                
                
                //UPDATE
                //Creamos la sentencia
                Statement sentencia2 = conexion2.createStatement();
                //Creamos els tring con el sql de update
                String sql2 = "UPDATE EMPLOYEES SET SALARY = SALARY * 1.1 WHERE DEPARTMENT_ID=30";
                int nreg; // nreg será el numero de filas que han sido actialiadas
                //guardamos el numero de veces que se ha ejecutado
                nreg = sentencia2.executeUpdate(sql2);
                System.out.println("Han sido " + nreg + " filas actualizadas");
                sentencia2.close();
                
                //CONSULTAR
                System.out.println(sql);
                System.out.println("Datos de los empleados actualizados:");
                filas = sentencia.executeQuery(sql);
                registros=0;
                while(filas.next()){
                    System.out.print(" " + filas.getString(1));
                    System.out.print(" " + filas.getString(2));
                    System.out.print(" " + filas.getString(3));
                    System.out.print(" " + filas.getString(4));
                    System.out.println(" " + filas.getString(5));
                    registros++;
                }
                System.out.println("Hay " + registros + " empleados");
                filas.close();
                sentencia.close();
            }
            //cerramos el resultSet
            tablas_usuario.close();
            //cerramos la conexion
            conexion2.close();
        }catch (ClassNotFoundException cn){
            cn.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
      
    }
}
