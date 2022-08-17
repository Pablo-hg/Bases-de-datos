
package Controlador;

import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Modelo.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Operaciones {
    
    //Añadir un Empleado
    public static void AnadirEmpleado(Empleados empleados){
        Session session = null;
        Transaction tx = null;
        try{
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(empleados);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
        }catch(HibernateException he){
            tx.rollback();
            JOptionPane.showMessageDialog(null, "Clave duplicada" + he.getLocalizedMessage());
        }finally{
            session.close();
        }
    }
    
    
    //Añadir un Ordenador
    public static void AñadirOrdenador(Ordenadores ordenador){
        Session session = null;
        Transaction tx = null;
        try{
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(ordenador);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
        }catch(HibernateException he){
            tx.rollback();
            JOptionPane.showMessageDialog(null, "Clave duplicada" + he.getLocalizedMessage());
        }finally{
            session.close();
        }
    }
    
    
    //Añadir un Periferico
    public static void AñadirPeriferico(Perifericos periferico){
        Session session = null;
        Transaction tx = null;
        try{
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(periferico);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
        }catch(HibernateException he){
            tx.rollback();
            JOptionPane.showMessageDialog(null, "Clave duplicada" + he.getLocalizedMessage());
        }finally{
            session.close();
        }
    }
    
    
  
    //Ver todos los empleados
    public DefaultListModel VerTodosEmpleados(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        List<Empleados> lista=null;
        try{
            Query q;
            q = session.createQuery("from Empleados");
            lista = (List<Empleados>)q.list();
            tx.commit();
        }catch (Exception e){
            System.out.println(e.getMessage()+"query incorrecta");
        }finally {
            session.close();
        }
        Iterator<Empleados> iter=lista.iterator();
        DefaultListModel dlm = new DefaultListModel();
        while(iter.hasNext()){
           Empleados e = (Empleados) iter.next();
           dlm.addElement(e);
        }
        return dlm; 
    }
    
    
    //Ver todos los ordenadores
    public DefaultListModel VerTodosOrdenador(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        List<Ordenadores> lista=null;
        try{
            Query q;
            q = session.createQuery("from Ordenadores");
            lista = (List<Ordenadores>)q.list();
            tx.commit();
        }catch (Exception e){
            System.out.println(e.getMessage()+"query incorrecta");
        }finally {
            session.close();
        }
        Iterator<Ordenadores> iter=lista.iterator();
        DefaultListModel dlm = new DefaultListModel();
        while(iter.hasNext()){
           Ordenadores o = (Ordenadores) iter.next();
           dlm.addElement(o);
        }
        return dlm; 
    }
    
    
    //Ver todos los perifericos
    public DefaultListModel VertodosPerifericos(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        List<Perifericos> lista=null;
        try{
            Query q;
            q = session.createQuery("from Perifericos");
            lista = (List<Perifericos>)q.list();
            tx.commit();
        }catch (Exception e){
            System.out.println(e.getMessage()+"query incorrecta");
        }finally {
            session.close();
        }
        Iterator<Perifericos> iter=lista.iterator();
        DefaultListModel dlm = new DefaultListModel();
        while(iter.hasNext()){
           Perifericos per = (Perifericos) iter.next();
           dlm.addElement(per);
        }
        return dlm; 
    }
    

    //Ver solo un empleado
    public Empleados VerEmpleado(Integer asiento){
       Session session = null;
        Transaction tx = null;
        Empleados e = null; 
        try{
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            session = sf.openSession();
            e = (Empleados)session.get(Empleados.class,asiento);
        }catch(HibernateException he){
            tx.rollback(); 
            JOptionPane.showMessageDialog(null, "Clave duplicada" + he.getLocalizedMessage());
        }finally{
            session.close();
        }
        return e;
    }
    
    
    //Ver un ordenador 
    public Ordenadores VerOrdenador(Integer asiento){
        Session session = null;
        Transaction tx = null;
        Ordenadores o = null;
        try{
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            session = sf.openSession();
            o = (Ordenadores)session.get(Ordenadores.class,asiento);
        }catch(HibernateException he){
            tx.rollback(); 
            JOptionPane.showMessageDialog(null, "Clave duplicada" + he.getLocalizedMessage());
        }finally{
            session.close();
        }
        return o;
    }
    
    
    //Ver un periferico
    public Perifericos VerPeriferico(Integer asiento){
        Session session = null;
        Transaction tx = null;
        Perifericos p = null;
        try{
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            session = sf.openSession();
            p = (Perifericos)session.get(Perifericos.class,asiento);
        }catch(HibernateException he){
            tx.rollback(); 
            JOptionPane.showMessageDialog(null, "Clave duplicada" + he.getLocalizedMessage());
        }finally{
            session.close();
        }
        return p;
        
    }
    
    
    //Eliminar un empleado
    public void EliminarEmpleado(Integer clave){
        Transaction tx=null;
        Session session=null;
        try {
            SessionFactory sesion = NewHibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
            Empleados e =(Empleados)session.load(Empleados.class, clave);
            session.delete(e);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Eliminado correctamente.");
        } catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible eliminar el empleado");
            System.out.println("Mensaje de la baja "+he.getMessage());
        } finally {
            session.close();
        }  
    }
    
    
    
    //Eliminar un ordenador
    public void EliminarOrdenador(Integer asiento){
        Transaction tx=null;
        Session session=null;
        try {
            SessionFactory sesion = NewHibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
            Ordenadores o =(Ordenadores)session.load(Ordenadores.class, asiento);
            session.delete(o);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Eliminado correctamente.");
        } catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible eliminar el ordenador");
            System.out.println("Mensaje de la baja "+he.getMessage());
        } finally {
            session.close();
        }  
    }
    
    
    //Eliminar un periferico usando la tabla
    public void EliminarPerifericoTabla(Integer asiento){
        Transaction tx=null;
        Session session=null;
        try {
            SessionFactory sesion = NewHibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
            Perifericos p =(Perifericos)session.load(Perifericos.class, asiento);
            session.delete(p);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Eliminado correctamente.");
        } catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible eliminar el periferico");
            System.out.println("Mensaje de la baja "+he.getMessage());
        } finally {
            session.close();
        }  
    }
    
    public static void EliminarPeriferico(){
        Transaction tx=null;
        Session session=null;
        try{
            int asiento = Integer.parseInt(Vista.EliminarPeriferico.jTextFieldasiento.getText());   
            Perifericos per = (Perifericos) session.createQuery("SELECT p FROM Perifericos p WHERE sitio="+asiento);
            if(Vista.EliminarPeriferico.jCheckBoxm1.isSelected()){
                per.setMonitor1("Null");
            }
            if(Vista.EliminarPeriferico.jCheckBoxm2.isSelected()){
                per.setMonitor1("Null");
            }
            if(Vista.EliminarPeriferico.jCheckBoxr.isSelected()){
                per.setMonitor1("Null");
            }
            if(Vista.EliminarPeriferico.jCheckBoxt.isSelected()){
                per.setMonitor1("Null");
            }
            if(Vista.EliminarPeriferico.jCheckBoxd.isSelected()){
                per.setMonitor1("Null");
            }
            JOptionPane.showMessageDialog(null,"Periferico/s eliminado/s");
        } catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible eliminar el periferico");
            System.out.println("Mensaje de la baja "+he.getMessage());
        } finally {
            session.close();
        }  
    }
    
    //Modificar un empleado
    public void ModificarEmpleado(Empleados empleado){
        Transaction tx=null;
        Session session=null;
        try{
           SessionFactory sesion = NewHibernateUtil.getSessionFactory();
           session = sesion.openSession();
           tx = session.beginTransaction(); 
           int key = empleado.getSitio();
           Empleados empl = (Empleados)session.load(Empleados.class, key);
           empl.setSitio(empleado.getSitio());
           empl.setNombre(empleado.getNombre());
           empl.setApellidos(empleado.getApellidos());
           empl.setDepartamento(empleado.getDepartamento());
           System.out.println(empleado.toString());
           session.update(empl);
           tx.commit();
           JOptionPane.showMessageDialog(null,"Actualizado correctamente.");
        }catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible actualizar el Empleado");
        } finally {
            session.close();
        }
    }
    
    
    //Modificar un Ordenador
    public  void ModificarOrdenador(Ordenadores ordenador){
        Transaction tx=null;
        Session session=null;
        try{
           SessionFactory sesion = NewHibernateUtil.getSessionFactory();
           session = sesion.openSession();
           tx = session.beginTransaction(); 
           int key = ordenador.getSitio();
           Ordenadores ord = (Ordenadores)session.load(Ordenadores.class, key);
           ord.setSitio(ordenador.getSitio());
           ord.setPlaca(ordenador.getPlaca());
           ord.setProcesador(ordenador.getProcesador());
           ord.setTarjetaGrafica(ordenador.getTarjetaGrafica());
           ord.setMemoriaRam(ordenador.getMemoriaRam());
           ord.setAlimentacion(ordenador.getAlimentacion());
           ord.setDiscoDuro(ordenador.getDiscoDuro());
           ord.setDiscoSsd(ordenador.getDiscoSsd());
           ord.setVentilacion(ordenador.getVentilacion());
           System.out.println(ordenador.toString());
           session.update(ord);
           tx.commit();
           JOptionPane.showMessageDialog(null,"Actualizado correctamente.");
        }catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible actualizar el Ordenador");
        } finally {
            session.close();
        }
    }
    
    
    //Modificar Periferico
    public  void ModificarPeriferico(Perifericos periferico){
        Transaction tx=null;
        Session session=null;
        try{
           SessionFactory sesion = NewHibernateUtil.getSessionFactory();
           session = sesion.openSession();
           tx = session.beginTransaction(); 
           int key = periferico.getSitio();
           Perifericos per = (Perifericos)session.load(Perifericos.class, key);
           per.setSitio(periferico.getSitio());
           per.setMonitor1(periferico.getMonitor1());
           per.setMonitor2(periferico.getMonitor2());
           per.setRaton(periferico.getRaton());
           per.setTeclado(periferico.getTeclado());
           per.setDiscoPortatil(periferico.getDiscoPortatil());
           System.out.println(periferico.toString());
           session.update(per);
           tx.commit();
           JOptionPane.showMessageDialog(null,"Actualizado correctamente.");
        }catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible actualizar el Ordenador");
        } finally {
            session.close();
        }
    }

}
