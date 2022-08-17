
package controlador;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.Empleado;
import modelo.Ordenador;

//AQUI VAN TODOS LOS METODOS QUE SE EJECUTAN EN EL PROGRAMA
public class Controlador {
    
    //Abrimos la conexion con la base de datos
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("empleados.odb"); ;
    static EntityManager em = emf.createEntityManager();;
    
    
    //Añadir un empleado
    public static void AñadirEmpleado(){
        //Empezamos la transaccion
        em.getTransaction().begin();
        String nombre = vista.CrearEmpleado.jTextFieldnombre.getText();
        String apellidos = vista.CrearEmpleado.jTextFieldapellidos.getText();
        String departamento = vista.CrearEmpleado.jTextFielddepartamento.getText();
        int sitio = Integer.parseInt(vista.CrearEmpleado.jTextFieldasiento.getText());
        //creamos el objeto Empleado con sus datos
        Empleado empl = new Empleado(nombre,apellidos,departamento,sitio);
        //añadimos el nuevo empleado
        em.persist(empl);
        //La cerramos
        em.getTransaction().commit();
        vista.CrearEmpleado.jLabelerror.setText("Empleado añadido");
    }
    
     //Añadir un empleado con Mongo
    public static void AñadirEmpleadoMongo(){
        
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
    
    //Añadir un Ordenador mongo
    public static void AñadirOrdenadorMongo(){
        
    }
    
  
    //Ver todos los empleados
    public static void VerTodosEmpleados(){
        TypedQuery<Empleado> query = em.createQuery("SELECT empl FROM Empleado empl", Empleado.class);
        List<Empleado> results = query.getResultList();
        String datos = "";
        for (Empleado p : results) {
            datos += p.toString();
            vista.VerEmpleado.jTextAreaInfoEmpleados.setText(datos);
        }
    }
    
    //Ver todos los empleados con Mongo
    public static void VerTodosEmpleadosMongo(){
        
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
    
    //Ver todos los ordenadores con mongo
    public static void VerTodosOrdenadorMongo(){
        
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
                vista.VerEmpleado.jTextAreaInfoEmpleados.setText(dato);
            }
        }
        else vista.VerEmpleado.jLabel4.setText("Noy nadie sentado en el asiento " + asiento);
        em.getTransaction().commit();
    }
    
    //Ver un empleado con Mongo
    public static void VerEmpleadoMongo(){
        
    }
    
    //Ver un ordenador 
    public static void VerOrdenador(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt(vista.VerOrdenador.jTextFieldasiento.getText());
        Query query = em.createQuery("SELECT ord FROM Ordenador ord WHERE ord.Id="+asiento);
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
    
    //Ver un Ordenador con Mongo
    public static void VerOrdenadorMongo(){
        
    }
    
    //Eliminar un empleado
    public static void EliminarEmpleado(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt(vista.EliminarEmpleado.jTextFieldasiento.getText());
        Query query = em.createQuery("SELECT empl FROM Empleado empl WHERE empl.Sitio="+asiento);
        if (!query.equals(true)){
            modelo.Empleado p = (modelo.Empleado) query.getSingleResult();
            if (asiento==p.getSitio()){
                em.remove(p);
                vista.EliminarEmpleado.jLabel3.setText("El empleado que se sentaba en el asiento " + asiento + " ha sido eliminado");
            }
        }
        else vista.VerEmpleado.jLabel4.setText("Noy nadie sentado en el asiento " + asiento);
        em.getTransaction().commit();
    }
    
    //Eliminar un empleado con Mongo
    public static void EliminarEmpleadoMongo(){
         
    }
    
    //Eliminar un ordenador
    public static void EliminarOrdenador(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt(vista.EliminarOrdenador.jTextFieldasiento.getText());
        Query query = em.createQuery("SELECT ord FROM Ordenador ord WHERE ord.Id="+asiento);
        if (!query.equals(true)){
            modelo.Ordenador o = (modelo.Ordenador) query.getSingleResult();
            if (asiento==o.getId()){
                em.remove(o);
                vista.EliminarOrdenador.jLabel3.setText("El ordeandor en el asiento " + asiento + " ha sido eliminado");
            }
        }
        else vista.VerEmpleado.jLabel4.setText("Noy nadie sentado en el asiento " + asiento);
        em.getTransaction().commit();
    }
    
    //Eliminar un ordenador con MOngo
    public static void EliminarordenadorMongo(){
        
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
            vista.ModificarEmpleado.jLabel6.setText("Empleado Modificado");
        }
        else vista.ModificarEmpleado.jLabel6.setText("Debes escribir el asiento para modificar");
    }
    
     //Modificar un empleado con Mongo
    public static void ModificarEmpleadoMongo(){
        
    }
    
    //Modificar un Ordenador
    public static void ModificarOrdenador(){
        em.getTransaction().begin();
        int asiento = Integer.parseInt((vista.ModificarOrdenador.jTextFieldasiento.getText()));
        Ordenador o = em.find(Ordenador.class, asiento);
        if (!vista.ModificarOrdenador.jTextFieldasiento.getText().equals("")){
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
    
    //modificar un ordenador con mongo
    public static void ModificarOrdenadorMongo(){
         
    }
    
    //Crear un Periferico
    public static void AñadirPeriferico(){
        
    }
    
}
