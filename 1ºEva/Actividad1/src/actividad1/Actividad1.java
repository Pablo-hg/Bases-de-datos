
package actividad1;

import java.util.Scanner;
import modelo.Persona;
import modelo.Vivienda;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

public class Actividad1 {
    static Scanner sc = new Scanner(System.in);
    static String basedatos = "datos.odb";

    public static void main(String[] args) {
        System.out.println("1. Ver personas");
        System.out.println("2. Guardar persona");
        System.out.println("3. Consular persona");
        System.out.println("4. Eliminar persona");
        System.out.println("5. Actualizar DNI");
        System.out.println("Inserta opcion: ");
        int opcion = Integer.parseInt(sc.nextLine());
        switch(opcion){
            case 1:
                verPersonas();
                break;
            case 2:
                insertarPersona();
                break;
            case 3:
                consultarPersona();
                break;
            case 4:
                eliminarPersona();
                break;
             case 5:
                modificarDni();
                break;
            default:
        }
    }

    private static void insertarPersona(){
        ODB odb = ODBFactory.open(basedatos);
        
        System.out.println("DNI: ");
        String dni = sc.nextLine();
        System.out.println("Escribe el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Escribe tu edad");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Escribe la altura: ");
        double altura = Double.parseDouble(sc.nextLine());
        System.out.println("Escribe el peso: ");
        double peso = Double.parseDouble(sc.nextLine());
        System.out.println("Escribe tu sexo H o M: ");
        char sexo = sc.nextLine().charAt(0);
        System.out.println("Escribe el ID de la casa: ");
        int Id = Integer.parseInt(sc.nextLine());
        System.out.println("Escribe tu Direccion: ");
        String Direccion = sc.nextLine();
        System.out.println("Escribe tu Ciudad: ");
        String Ciudad = sc.nextLine();
        System.out.println("Escribe el nº de habitaciones: ");
        int Numhabitaciones = Integer.parseInt(sc.nextLine());
        
        Vivienda casa = new Vivienda(Id,Numhabitaciones,Direccion,Ciudad);
        Persona nueva = new Persona(nombre,dni,edad,altura,peso,sexo,casa);
        nueva.generaDNI();
        odb.store(nueva);
        System.out.println("Persona insertada");
        odb.close();
    }

    private static void verPersonas() {
        ODB odb = ODBFactory.open(basedatos);
        IQuery query;
        query = new CriteriaQuery(Persona.class);
        query.orderByAsc("dni");//Ordena los dni de la personas
        Objects<Persona> personas = odb.getObjects(query);
        Persona p;
        while(personas.hasNext()){
             p = personas.next();
             System.out.println("Nombre: " + p.getNombre() + "  IMC: " + p.calcularIMC());
             System.out.println(p.getDni() + p.getcasa());
        }
        odb.close();
    }

    private static void eliminarPersona() {
        Actividad1.verPersonas();
        ODB odb = ODBFactory.open(basedatos);
        System.out.println("Escribe el nombre de la persona que quieres eliminar: ");
        String personaeliminar = sc.nextLine();
        IQuery query = new CriteriaQuery(Persona.class, Where.equal("nombre",personaeliminar));
        Objects<Persona> personas = odb.getObjects(query);
        Persona p = null;
        int contador  = 0;
        while(personas.hasNext()){
             p = personas.next();
             odb.delete(p.getcasa());//elimina la casa
              odb.delete(p);//eliminar persona
              System.out.println(p.getNombre() + " Ha sido eliminado/a de la base de datos");
              contador++;
        }
        System.out.println("Han sido eliminadas " + contador + " pesonas");
        
        odb.close();
    }

    private static void consultarPersona() {
        System.out.println("Ingrese un nº de habitaciones");
        int nhab = Integer.parseInt(sc.nextLine());
        ODB odb = ODBFactory.open(basedatos);
        IQuery query = new CriteriaQuery(Persona.class, Where.gt("casa.Numhabitaciones",nhab));
        Objects<Persona> personas = odb.getObjects(query);
        Persona p = null;
        while(personas.hasNext()){
            p = personas.next();
            if (nhab <= p.getcasa().getNumhabitaciones()){
            System.out.println("Nombre: " + p.getNombre() + " tiene mas de " + nhab + " habitaciones");
            }
        }
        odb.close();
    }

    private static void modificarDni() {
        ODB odb = ODBFactory.open(basedatos);
        System.out.println("Ingrese el dni que quieres modificar");
        String dni = sc.nextLine();
        System.out.println("Ingrese el dni nuevo");
        String dninuevo = sc.nextLine();
        IQuery query = new CriteriaQuery(Persona.class, Where.equal("dni",dni));
        Objects<Persona> personas = odb.getObjects(query);
        Persona p = personas.getFirst();
                 p.setDni(dninuevo);
                 odb.store(p);
        odb.close();
    }
         
}
