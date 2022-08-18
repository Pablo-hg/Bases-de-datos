

package practica3;

import java.io.Serializable;

public class Empleado implements Serializable{
 
    private int id;
    private String nombre;
    private int numero;
    private String departamento;
    private String dispositivos;

    public Empleado(int id, String nombre, int numero, String departamento, String dispositivos) {
        this.id = id;
        this.nombre = nombre;
        this.numero = numero;
        this.departamento = departamento;
        this.dispositivos = dispositivos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(String dispositivos) {
        this.dispositivos = dispositivos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", numero=" + numero + ", departamento=" + departamento + ", dispositivos=" + dispositivos + '}';
    }
        
}
