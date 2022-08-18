/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionjdbc;


public class Empleado {
    
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String dept;
    private int maxsalar;
    private int minsalar;

    public Empleado(int id, String nombre, String apellidos, String correo, String dept, int maxsalar, int minsalar) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.dept = dept;
        this.maxsalar = maxsalar;
        this.minsalar = minsalar;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getMaxsalar() {
        return maxsalar;
    }

    public void setMaxsalar(int maxsalar) {
        this.maxsalar = maxsalar;
    }

    public int getMinsalar() {
        return minsalar;
    }

    public void setMinsalar(int minsalar) {
        this.minsalar = minsalar;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + ", dept=" + dept + ", maxsalar=" + maxsalar + ", minsalar=" + minsalar + '}';
    }
    
    
    
}
