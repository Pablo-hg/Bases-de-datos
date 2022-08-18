
package practica3;

import java.io.Serializable;


public class Ordenador  implements Serializable{
    
    private String departamento;
    private String dueño;
    private String placa;
    private String procesador;
    private String tarjetag;
    private String memoriaram;
    private String alimentacion;
    private String disco;
    private String ventilacion;
    private String torre;

    public Ordenador(String departamento, String dueño, String placa, String procesador, String tarjetag, String memoriaram, String alimentacion, String disco, String ventilacion, String torre) {
        this.departamento = departamento;
        this.dueño = dueño;
        this.placa = placa;
        this.procesador = procesador;
        this.tarjetag = tarjetag;
        this.memoriaram = memoriaram;
        this.alimentacion = alimentacion;
        this.disco = disco;
        this.ventilacion = ventilacion;
        this.torre = torre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetag() {
        return tarjetag;
    }

    public void setTarjetag(String tarjetag) {
        this.tarjetag = tarjetag;
    }

    public String getMemoriaram() {
        return memoriaram;
    }

    public void setMemoriaram(String memoriaram) {
        this.memoriaram = memoriaram;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getVentilacion() {
        return ventilacion;
    }

    public void setVentilacion(String ventilacion) {
        this.ventilacion = ventilacion;
    }

    public String getTorre() {
        return torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "placa=" + placa + ", procesador=" + procesador + ", tarjetag=" + tarjetag + ", memoriaram=" + memoriaram + ", alimentacion=" + alimentacion + ", disco=" + disco + ", ventilacion=" + ventilacion + ", torre=" + torre + '}';
    }
    
    
}
