
package modelo;

import javax.persistence.ManyToOne;

public class Dispositivos{
    
    
    @ManyToOne
    Empleado Dueño;
    String Movil;
    String Portatil;
    Ordenador ordenador;
    Perifericos perifericos;

    public Dispositivos(Empleado Dueño, String Movil, String Portatil, Ordenador ordenador, Perifericos perifericos) {
        this.Dueño = Dueño;
        this.Movil = Movil;
        this.Portatil = Portatil;
        this.ordenador = ordenador;
        this.perifericos = perifericos;
    }

    public Empleado getDueño() {
        return Dueño;
    }

    public void setDueño(Empleado Dueño) {
        this.Dueño = Dueño;
    }

    public String getMovil() {
        return Movil;
    }

    public void setMovil(String Movil) {
        this.Movil = Movil;
    }

    public String getPortatil() {
        return Portatil;
    }

    public void setPortatil(String Portatil) {
        this.Portatil = Portatil;
    }

    public Ordenador getOrdenador() {
        return ordenador;
    }

    public void setOrdenador(Ordenador ordenador) {
        this.ordenador = ordenador;
    }

    public Perifericos getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(Perifericos perifericos) {
        this.perifericos = perifericos;
    }

    @Override
    public String toString() {
        return "Dispositivos{" + "Due\u00f1o=" + Dueño + ", Movil=" + Movil + ", Portatil=" + Portatil + ", ordenador=" + ordenador + ", perifericos=" + perifericos + '}';
    }
    
    
}
