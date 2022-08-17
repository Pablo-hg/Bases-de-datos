
package controlador;

import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Noticias;
import modelo.Usuarios;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Operaciones {
    
    //PAGINA 30 DE PDF GUIA-HIBERNATE
    
    public void altaUsuario(Usuarios usuarios){
        
        //Creamos objetos en nulo que son los que se van a conectar a la abse de datos
        Session session = null;
        //Una Transsacion es un cojunto de operaciones que se tiene que realizar de forma seguida,
        //o se hace todo o nada, y despues de cada transacion, se cierra.
        Transaction tx = null;

        try{
            //Creamos la fabrica de sesiones de Hibernate
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            //Abrimos la fabrica para crear sesiones
            session = sf.openSession();
            //sobre la sesion, creamos una transacion
            tx = session.beginTransaction();
            //El usuario que le pasemos, LO GUARDA en la sesion(en la base de datos)
            session.save(usuarios);
            //cerramos la transacion
            tx.commit();
            //Mensaje por pantalla que muestra un texto
            JOptionPane.showMessageDialog(null, "Insertador corrextamente");
        }catch(HibernateException he){
            //si da algún eeror, hacemos un rollback para volver atras, es decir,
            //para que la base de datos no guarde el fallo
            tx.rollback();
            JOptionPane.showMessageDialog(null, "Clave duplicada" + he.getLocalizedMessage());
        }finally{
            //Al final de todo, cerramos la sesion de la base de datos
            session.close();
        }
    }
    
    public void verUsuarioPorCodigo(){
        
        Session session = null;
        Transaction tx = null;
        try{
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            session = sf.openSession();
            //Creamos el objeto de tipo Uusario, casteamos el tipo , y reaalizamos el get.
            //El método .get recibe dos parametros: 1º la clase y 2º la clave primaria(el Usuarrio)
            Usuarios u = (Usuarios)session.get(Usuarios.class, "Juan");
            //creamos una ventanita que muestre el .string de dicho usuario (de Pepe)
            JOptionPane.showMessageDialog(null, u.toString());
        }catch(HibernateException he){
            tx.rollback();
            JOptionPane.showMessageDialog(null, "Clave duplicada" + he.getLocalizedMessage());
        }finally{
            session.close();
        }
    }
    
    //Método que al pasarrle un usuario, comprueba si existe, y si existe,
    //devuelve la info de se usuario
    public Usuarios Obtenerusuario(String username){
        Session session = null;
        Transaction tx = null;
        Usuarios u = null;
        try{
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            session = sf.openSession();
            u = (Usuarios)session.get(Usuarios.class,username);
        }catch(HibernateException he){
            tx.rollback(); 
            JOptionPane.showMessageDialog(null, "Clave duplicada" + he.getLocalizedMessage());
        }finally{
            session.close();
        }
        return u;
    }
    
    //Método que nos permite modificar el nombre de un usuario
    public void cambiarUsuario(String username){
        Session session = null;
        Transaction tx = null;
        Usuarios u = null;
        try{
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            u = (Usuarios)session.get(Usuarios.class,username);
            //al nombre de añadimos una A
            u.setNombre(u.getNombre() + " A");
            session.update(u);
            tx.commit();
        }catch(HibernateException he){
            tx.rollback(); 
            JOptionPane.showMessageDialog(null, "Clave duplicada" + he.getLocalizedMessage());
        }finally{
            session.close();
        }
    }
    
    //Método que nos permite eliminar un usuario
    public void eliminarUsuario(String username){
        Session session = null;
        Transaction tx = null;
        Usuarios u = null;
        try{
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            u = (Usuarios)session.get(Usuarios.class,username);
            //Eliminamos el usuario que le pasamos a "u"
            session.delete(u);
            tx.commit();
        }catch(HibernateException he){
            tx.rollback(); 
            JOptionPane.showMessageDialog(null, "Clave duplicada" + he.getLocalizedMessage());
        }finally{
            session.close();
        }   
    }
    
    public DefaultListModel mostrarUsuarios(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        List<Usuarios> lista=null;
        try{
            Query q;
            q = session.createQuery("from Usuarios");
            lista = (List<Usuarios>)q.list();
            tx.commit();
        }catch (Exception e){
            System.out.println(e.getMessage()+"query incorrecta");
        }finally {
            session.close();
        }
        Iterator<Usuarios> iter=lista.iterator();
        DefaultListModel dlm = new DefaultListModel();
        while(iter.hasNext()){
           Usuarios usu = (Usuarios) iter.next();
           dlm.addElement(usu);
        }
        return dlm;
    }    
    
    
    //Método que devuelve una lista con todos los usuarios
    public List<Object[]> VerUsuarios(){
        Session session = null;
        List<Object[]> usuarios = null;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        session = sf.openSession();
        //NO ES SQL, ES HQL
        //1º se hace un query con la sentencia HQL
        Query q = session.createQuery("SELECT u.usuario FROM Usuarios u");
        //2º le psamos que nos devuelva la "lista"(con.list)
        usuarios = q.list();
        session.close();
        return usuarios;
    }
    
    //Método que nos devuelve un Array de objetos que contienen
    //el "usuario" y el correo de cada usuario
    public List<Object[]> VerUsuariosCorreo(){
        Session session = null;
        List<Object[]> usuarios = null;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        session = sf.openSession();
        Query q = session.createQuery("SELECT u.usuario, u.email FROM Usuarios u");
        usuarios = q.list();
        session.close();
        return usuarios;
    }
    
    //Método que nos permite eliminar un usuario
    public void bajaUsuarios(String clave){
        Transaction tx=null;
        Session session=null;
        try {
            SessionFactory sesion = NewHibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
            Usuarios usu =(Usuarios)session.load(Usuarios.class, clave);
            session.delete(usu);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Eliminado correctamente.");
        } catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible eliminar el usuario");
            System.out.println("Mensaje de la baja "+he.getMessage());
        } finally {
            session.close();
        }  
    }
    
    
    public void altaNoticias(Noticias noti){
     
        Session session = null;
        Transaction tx = null;
        try{
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(noti);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Insertador corrextamente");
        }catch(HibernateException he){
            tx.rollback();
            JOptionPane.showMessageDialog(null, "Clave duplicada" + he.getLocalizedMessage());
        }finally{
            session.close();
        }
    }
    
    //Método para listar las noticias
    public DefaultListModel mostrarNoticias(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        List<Noticias> lista=null;
        try{
            Query q;
            q = session.createQuery("from Noticias");
            lista = (List<Noticias>)q.list();
            tx.commit();
        }catch (Exception e){
            System.out.println(e.getMessage()+"query incorrecta");
        }finally {
            sesion.close();
        }
        Iterator<Noticias> iter=lista.iterator();
        DefaultListModel dlm = new DefaultListModel();
        while(iter.hasNext()){
           Noticias noti = (Noticias) iter.next();
           dlm.addElement(noti);
        }
        return dlm;
    }
    
    public DefaultListModel listaNoticias(){
        return null;
    }
    
    public void bajaNoticias(String clave){
        Transaction tx=null;
        Session session=null;
        try {
            SessionFactory sesion = NewHibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
            Noticias not =(Noticias)session.load(Noticias.class, clave);
            session.delete(not);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Eliminado correctamente.");
        } catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible eliminar la noticia");
            System.out.println("Mensaje de la baja "+he.getMessage());
        } finally {
            session.close();
        }  
    }
    
    public void actualizarNoticia(Noticias noti_act, String tit_copia){
    
       Transaction tx=null;
       Session session= null;
       try{
           Noticias n = (Noticias) session.createQuery("SELECT n FROM Noticias WHERE titular=tit_copia").uniqueResult();
           String key = n.getTitular();
           Noticias noc = (Noticias)session.load(Noticias.class, key);
           noc.setTexto(noti_act.getTexto());
           noc.setFecha(noti_act.getFecha());
           noc.setTitular(noti_act.getTitular());
           //noc.setUsuarios(noti_act.getUsuarios().getUsuario());
           session.update(noc);
           tx.commit();
           JOptionPane.showMessageDialog(null, "Actualizado Correctamente");
        } catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible actualizar noticia");
            //System.out.println("Mensaje de la baja "+he.getMessage());
        } finally {
            session.close();
       }
    }
    
    //Devuelve la info de la noticia seleccionada
    public Noticias buscaNoticia(String titular){
        Session session = null;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        session = sf.openSession();
        String texto = titular;
        Noticias n = (Noticias) session.createQuery("SELECT n.texto FROM Noticias n WHERE n.titular=texto").uniqueResult();
        vista.Modificar_noticias.jTextArea1.setText(n.getTexto());
        session.close();
        return n;
        
    }
    
    public void actualizarUsuarios(Usuarios usuario){
        Transaction tx=null;
        Session session=null;
        try {
            SessionFactory sesion = NewHibernateUtil.getSessionFactory();
            session = sesion.openSession();
            tx = session.beginTransaction();
            String key=usuario.getUsuario();
            //recuperamos el objeto a modificar
            Usuarios us=(Usuarios)session.load(Usuarios.class, key);
            //Actualizar datos
            //us.setUsuario(usuario.getUsuario());
            us.setNombre(usuario.getNombre());
            us.setApellidos(usuario.getApellidos());
            us.setCalle(usuario.getCalle());
            us.setNumero(usuario.getNumero());
            us.setCp(usuario.getCp());
            us.setTelefono(usuario.getTelefono());
            us.setEmail(usuario.getEmail());
            us.setProvincia(usuario.getProvincia());
            us.setClave(usuario.getClave());
            //us.setNoticiases(usuario.getNoticiases());
            //actualizamos objeto
            session.update(us);
            tx.commit();
            JOptionPane.showMessageDialog(null,"Actualizado correctamente.");
        } catch (HibernateException he) {
            tx.rollback();
            JOptionPane.showMessageDialog(null,he.getMessage()+"No ha sido posible actualizar usuario");
            //System.out.println("Mensaje de la baja "+he.getMessage());
        } finally {
            session.close();
        }
    }
}    