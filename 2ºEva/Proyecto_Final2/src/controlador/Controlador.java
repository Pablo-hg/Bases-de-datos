
package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.Empleado;
import modelo.Ordenador;
import modelo.Perifericos;

//AQUI VAN TODOS LOS METODOS QUE SE EJECUTAN EN EL PROGRAMA
public class Controlador {
    
    //Abrimos la conexion con la base de datos
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("empleados.odb"); ;
    static EntityManager em = emf.createEntityManager();;
    
    
    //Añadir un empleado
    public static void AnadirEmpleado(){
        //Empezamos la transaccion
        em.getTransaction().begin();
        String nombre = vista.CrearEmpleado.jTextFieldnombre.getText();
        String apellidos = vista.CrearEmpleado.jTextFieldapellidos.getText();
        String departamento = vista.CrearEmpleado.jTextFielddepartamento.getText();
        int sitio = Integer.parseInt(vista.CrearEmpleado.jTextFieldasiento.getText());
        Empleado empl = new Empleado(nombre,apellidos,departamento,sitio);
        em.persist(empl);
        em.getTransaction().commit();
        vista.CrearEmpleado.jLabelerror.setText("Empleado añadido");
    }
    
    
    //Añadir un Ordenador
    public static void AñadirOrdenador(){
        ////Empezamos la transaccion
        em.getTransaction().begin();
        //igualamos las variaables a los textfields
        String placa = vista.CrearOrdenador.jTextFieldplaca.getText();
        String procesador = vista.CrearOrdenador.jTextFieldprocesador.getText();
        String tarjeta = vista.CrearOrdenador.jTextFieldtarjeta.getText();
        String ram = vista.CrearOrdenador.jTextFieldram.getText();
        String ventilacion = vista.CrearOrdenador.jTextFieldventilacion.getText();
        String Alimentacion = vista.CrearOrdenador.jTextFieldventilacion.getText();
        String disco = vista.CrearOrdenador.jTextFielddiscoduro.getText();
        String ssd = vista.CrearOrdenador.jTextFielddiscossd.getText();
        String caja = vista.CrearOrdenador.jTextFieldtorre.getText();
        int asiento = Integer.parseInt(vista.CrearOrdenador.jTextFieldasiento.getText());
        //Creamos un ordenador con las variables
        Ordenador or = new Ordenador(placa,procesador,tarjeta,ram,Alimentacion,disco,ssd,ventilacion,caja,asiento);
        //lo añadimos a la base de datos
        em.persist(or);
        //Cerrams la transacion
        em.getTransaction().commit();
        vista.CrearOrdenador.jLabelerror.setText("Ordenador insertado");
    }
    
    
    //Añadir un Periferico
    public static void AñadirPeriferico(){
       em.getTransaction().begin();
       String monitor = vista.CrearPeriferico.jTextFieldmonitor1.getText();
       String monitor2 = vista.CrearPeriferico.jTextFielmonitor2.getText();
       String raton = vista.CrearPeriferico.jTextFieldraton.getText();
       String teclado = vista.CrearPeriferico.jTextFieldteclado.getText();
       String disco = vista.CrearPeriferico.jTextFielddisco1.getText();
       int asiento = Integer.parseInt(vista.CrearPeriferico.jTextFieldasiento.getText());
       Perifericos p = new Perifericos(monitor,monitor2,raton,teclado,disco,asiento);
       em.persist(p);
       em.getTransaction().commit();
       vista.CrearPeriferico.jLabelerror.setText("Perifericos añadidos");
    }
    
    
  
    //Ver todos los empleados
    public static void VerTodosEmpleados(){
        TypedQuery<Empleado> query = em.createQuery("SELECT empl FROM Empleado empl", Empleado.class);
        List<Empleado> results = query.getResultList();
        String datos = "";
        vista.VerEmpleado.jTextAreaInfoEmpleados.setText("");
        for (Empleado p : results) {
            datos += p.toString();
            vista.VerEmpleado.jTextAreaInfoEmpleados.setText(datos);
        }
    }
    
    
    //Ver todos los ordenadores
    public static void VerTodosOrdenador(){
        TypedQuery<Ordenador> query = em.createQuery("SELECT ord FROM Ordenador ord", Ordenador.class);
        List<Ordenador> results = query.getResultList();
        String datos = "";
        for (Ordenador ord : results){
            datos += ord.toString();
            vista.VerOrdenador.jTextAreaInfoOrdenadores.setText(datos);
        }
    }
    
    
    //Ver todos los perifericos
    public static void VertodosPerifericos(){
        TypedQuery<Perifericos> query = em.createQuery("SELECT per FROM Perifericos per", Perifericos.class);
        List<Perifericos> results = query.getResultList();
        String datos = "";
        for (Perifericos per : results){
            datos += per.toString();
            vista.VerPerifericos.jTextAreaInfoperifericos.setText(datos);
        }
    }
    

    //Ver solo un empleado
    public static void VerEmpleado(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt(vista.VerEmpleado.jTextFieldasiento.getText());
        Query query = em.createQuery("SELECT empl FROM Empleado empl WHERE empl.Sitio="+asiento);
        if (!query.equals(true)){
            modelo.Empleado p = (modelo.Empleado) query.getSingleResult();
            if (asiento==p.getSitio()){
                String dato = p.toString();
                vista.VerEmpleado.jTextAreaInfoEmpleados.setText("");
                vista.VerEmpleado.jTextAreaInfoEmpleados.setText(dato);
            }
        }
        else vista.VerEmpleado.jLabel4.setText("Noy nadie sentado en el asiento " + asiento);
        em.getTransaction().commit();
    }
    
    
    //Ver un ordenador 
    public static void VerOrdenador(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt(vista.VerOrdenador.jTextFieldasiento.getText());
        Query query = em.createQuery("SELECT ord FROM Ordenador ord WHERE ord.Id"+asiento);
        if (!query.equals(true)){
            modelo.Ordenador o = (modelo.Ordenador) query.getSingleResult();
            if (asiento==o.getId()){
                String dato = o.toString();
                vista.VerOrdenador.jTextAreaInfoOrdenadores.setText(dato);
            }
        }
        else vista.VerOrdenador.jTextAreaInfoOrdenadores.setText("Noy nadie sentado en el asiento " + asiento);
        em.getTransaction().commit();
    }
    
    
    //Ver un periferico
    public static void VerPeriferico(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt(vista.VerPerifericos.jTextFieldasiento.getText());
        Query query = em.createQuery("SELECT per FROM Perifericos per WHERE per.Asiento="+asiento);
        if (!query.equals(true)){
            modelo.Perifericos p =(modelo.Perifericos) query.getSingleResult();
            if (asiento==p.getAsiento()){
                String dato = p.toString();
                vista.VerPerifericos.jTextAreaInfoperifericos.setText(dato);
            }
        }
        else vista.VerPerifericos.jTextAreaInfoperifericos.setText("Noy nadie sentado en el asiento " + asiento);
        em.getTransaction().commit();
    }
    
    
    //Eliminar un empleado
    public static void EliminarEmpleado(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt(vista.EliminarEmpleado.jTextFieldasiento.getText());
        Query query = em.createQuery("SELECT empl FROM Empleado empl WHERE empl.Sitio="+asiento);
        if (!query.equals(true)){
            modelo.Empleado p = (modelo.Empleado) query.getSingleResult();
                em.remove(p);
                vista.EliminarEmpleado.jLabel3.setText("El empleado que se sentaba en el asiento " + asiento + " ha sido eliminado"); 
        }
        else vista.EliminarEmpleado.jLabel3.setText("Noy nadie sentado en el asiento " + asiento);
        em.getTransaction().commit();
    }
    
    
    
    //Eliminar un ordenador
    public static void EliminarOrdenador(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt(vista.EliminarOrdenador.jTextFieldasiento.getText());
        Query query = em.createQuery("SELECT ord FROM Ordenador ord WHERE ord.Id="+asiento);
        if (!query.equals(true)){
            modelo.Ordenador o = (modelo.Ordenador) query.getSingleResult();
            em.remove(o);
            vista.EliminarOrdenador.jLabel3.setText("El ordeandor en el asiento " + asiento + " ha sido eliminado");
        }
        else {
            vista.EliminarOrdenador.jLabel3.setText("Noy nadie sentado en el asiento " + asiento);
        }
        em.getTransaction().commit();
    }
    
    
    //Eliminar un periferico
    public static void EliminarPeriferico(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt(vista.EliminarPeriferico.jTextFieldasiento.getText());
        Query query = em.createQuery("SELECT per FROM Perifericos per WHERE per.Asiento="+asiento);
        if (!query.equals(true)){
            modelo.Perifericos p = (modelo.Perifericos) query.getSingleResult();
            if(vista.EliminarPeriferico.jCheckBoxm1.isSelected()){
                //Query query2 = em.createQuery("SELECT per.Monitor1 FROM Perifericos per WHERE per.Asiento="+asiento);
                p.setMonitor1("");
                vista.EliminarPeriferico.jLabel4.setText("El monitor1 del asiento " + asiento + " ha sido eliminado");
            }
            if(vista.EliminarPeriferico.jCheckBoxm1.isSelected()){
                p.setMonitor2("");
                vista.EliminarPeriferico.jLabel4.setText("El monitor2 del asiento " + asiento + " ha sido eliminado");
            }
            if(vista.EliminarPeriferico.jCheckBoxm1.isSelected()){
                p.setRaton("");
                vista.EliminarPeriferico.jLabel4.setText("El raton del asiento " + asiento + " ha sido eliminado");
            }
            if(vista.EliminarPeriferico.jCheckBoxm1.isSelected()){
                p.setTeclado("");
                vista.EliminarPeriferico.jLabel4.setText("El teclado del asiento " + asiento + " ha sido eliminado");
            }
            if(vista.EliminarPeriferico.jCheckBoxm1.isSelected()){
                p.setDisco_portatil("");
                vista.EliminarPeriferico.jLabel4.setText("El disco portatil del asiento " + asiento + " ha sido eliminado");
            }
            else {
                em.remove(p);
                vista.EliminarPeriferico.jLabel4.setText("Se han borrado los perifericos del asiento " + asiento);
            }
        }
        else vista.EliminarPeriferico.jLabel4.setText("No hay nadie sentado en el asiento " + asiento);
        em.getTransaction().commit();   
    }
    
    
    
    //Modificar un empleado
    public static void ModificarEmpleado(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt(vista.ModificarEmpleado.jTextFieldasiento.getText());
        Empleado empl = em.find(Empleado.class, asiento);
        if (!vista.ModificarEmpleado.jTextFieldasiento.getText().equals("")){
            if(!vista.ModificarEmpleado.jTextFieldnewApellidos.getText().equals("")){
                empl.setApellidos(vista.ModificarEmpleado.jTextFieldnewApellidos.getText());
            }
            if(!vista.ModificarEmpleado.jTextFieldnewNombre.getText().equals("")){
                empl.setNombre(vista.ModificarEmpleado.jTextFieldnewNombre.getText());
            }
            if(!vista.ModificarEmpleado.jTextFieldnewdept.getText().equals("")){
                empl.setDepartamento(vista.ModificarEmpleado.jTextFieldnewdept.getText());
            }
            em.getTransaction().commit();
            vista.ModificarEmpleado.jLabel6.setText("El empleado que se sentaba en " + asiento + " ha sido modificado");
        }
        else vista.ModificarEmpleado.jLabel6.setText("Debes escribir el asiento para modificar");
    }
    
    
    
    //Modificar un Ordenador
    public static void ModificarOrdenador(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt((vista.ModificarOrdenador.jTextFieldasiento.getText()));
        if (!vista.ModificarOrdenador.jTextFieldasiento.getText().equals("")){
            Ordenador o = em.find(Ordenador.class, asiento);
            if (!vista.ModificarOrdenador.jTextFieldplaca.getText().equals("")){
                o.setPlaca(vista.ModificarOrdenador.jTextFieldplaca.getText());
            }
            if (!vista.ModificarOrdenador.jTextFieldprocesador.getText().equals("")){
                o.setProcesador(vista.ModificarOrdenador.jTextFieldprocesador.getText());
            }
            if (!vista.ModificarOrdenador.jTextFieldram.getText().equals("")){
                o.setMemoria_ram(vista.ModificarOrdenador.jTextFieldram.getText());
            }
            if (!vista.ModificarOrdenador.jTextFieldalimentacion.getText().equals("")){
                o.setAlimentacion(vista.ModificarOrdenador.jTextFieldalimentacion.getText());
            }
            if (!vista.ModificarOrdenador.jTextFieldtarjeta.getText().equals("")){
                o.setTarjeta_grafica(vista.ModificarOrdenador.jTextFieldtarjeta.getText());
            }
            if (!vista.ModificarOrdenador.jTextFieldtorre.getText().equals("")){
                o.setCaja(vista.ModificarOrdenador.jTextFieldtorre.getText());
            }
            if (!vista.ModificarOrdenador.jTextFielddisco.getText().equals("")){
                o.setDisco_duro(vista.ModificarOrdenador.jTextFielddisco.getText());
            }
            if (!vista.ModificarOrdenador.jTextFieldssd.getText().equals("")){
                o.setDisco_ssd(vista.ModificarOrdenador.jTextFieldssd.getText());
            }
            if (!vista.ModificarOrdenador.jTextFieldventilacion.getText().equals("")){
                o.setVentilacion(vista.ModificarOrdenador.jTextFieldventilacion.getText());
            }
            vista.ModificarOrdenador.jLabel12.setText("Ordenador Modificado");
            em.getTransaction().commit();
        }
        else vista.ModificarOrdenador.jLabel12.setText("Debes escribir el asiento para modificar");
    }
    
    
    //Modificar Periferico
    public static void ModificarPeriferico(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt(vista.ModificarPerifericos.jTextFieldasiento.getText());
        if (!vista.ModificarPerifericos.jTextFieldasiento.getText().equals("")){
            Perifericos p = em.find(Perifericos.class, asiento);
            if(!vista.ModificarPerifericos.jTextFieldm1ç.getText().equals("")){
                p.setMonitor1(vista.ModificarPerifericos.jTextFieldm1ç.getText());
            }
            if(!vista.ModificarPerifericos.jTextFieldm2.getText().equals("")){
                p.setMonitor2(vista.ModificarPerifericos.jTextFieldm2.getText());
            }
            if(!vista.ModificarPerifericos.jTextFieldraton.getText().equals("")){
                p.setRaton(vista.ModificarPerifericos.jTextFieldraton.getText());
            }
            if(!vista.ModificarPerifericos.jTextFieldteclado.getText().equals("")){
                p.setTeclado(vista.ModificarPerifericos.jTextFieldteclado.getText());
            }
            if (!vista.ModificarPerifericos.jTextFielddusco.getText().equals("")){
                p.setDisco_portatil(vista.ModificarPerifericos.jTextFielddusco.getText());
            }
            vista.ModificarPerifericos.jLabelerrror.setText("Perifericos modificados");
            em.getTransaction().commit();
        }
        else vista.ModificarPerifericos.jLabelerrror.setText("No hay perifericos en el asiento " + asiento);
    }
}
