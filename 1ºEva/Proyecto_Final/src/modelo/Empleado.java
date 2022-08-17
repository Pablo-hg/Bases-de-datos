
package modelo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Empleado {
    
    String Nombre;
    String Apellidos;
    String Departamento;
    @Id int Sitio;
    //Un empleado puede tener varios dispositivos
    //Un dipositivo solo puede tener un empleado
    
    public Empleado(String Nombre, String Apellidos, String Departamento, int Sitio) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Departamento = Departamento;
        this.Sitio = Sitio;
        //Creamos un conjunto de dispositivos para que un empleado pueda tener varios dipositivos
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public int getSitio() {
        return Sitio;
    }

    public void setSitio(int Sitio) {
        this.Sitio = Sitio;
    }

   
    
    
    @Override
    public String toString() {
        
        return "Nombre: " + Nombre  + ";   Apellidos: " + Apellidos + ";   Departamento: " + Departamento + ";   Asiento: " + Sitio + '\n';
    }
    
    
    
}
