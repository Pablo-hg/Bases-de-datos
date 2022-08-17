package Modelo;
// Generated 14-feb-2021 11:56:58 by Hibernate Tools 4.3.1



/**
 * Perifericos generated by hbm2java
 */
public class Perifericos  implements java.io.Serializable {


     private int sitio;
     private String monitor1;
     private String monitor2;
     private String raton;
     private String teclado;
     private String discoPortatil;

    public Perifericos() {
    }

	
    public Perifericos(int sitio) {
        this.sitio = sitio;
    }
    public Perifericos(int sitio, String monitor1, String monitor2, String raton, String teclado, String discoPortatil) {
       this.sitio = sitio;
       this.monitor1 = monitor1;
       this.monitor2 = monitor2;
       this.raton = raton;
       this.teclado = teclado;
       this.discoPortatil = discoPortatil;
    }
   
    public int getSitio() {
        return this.sitio;
    }
    
    public void setSitio(int sitio) {
        this.sitio = sitio;
    }
    public String getMonitor1() {
        return this.monitor1;
    }
    
    public void setMonitor1(String monitor1) {
        this.monitor1 = monitor1;
    }
    public String getMonitor2() {
        return this.monitor2;
    }
    
    public void setMonitor2(String monitor2) {
        this.monitor2 = monitor2;
    }
    public String getRaton() {
        return this.raton;
    }
    
    public void setRaton(String raton) {
        this.raton = raton;
    }
    public String getTeclado() {
        return this.teclado;
    }
    
    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }
    public String getDiscoPortatil() {
        return this.discoPortatil;
    }
    
    public void setDiscoPortatil(String discoPortatil) {
        this.discoPortatil = discoPortatil;
    }

    @Override
    public String toString() {
        return "Sitio: " + sitio + ",  Monitor1: " + monitor1 + ",  Monitor2: " +
                monitor2 + ",  Raton: " + raton + ",  Teclado=: " + teclado +
                ",  DiscoPortatil:" + discoPortatil + '}';
    }




}


