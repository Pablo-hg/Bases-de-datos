
package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Perifericos {
    
    String Monitor1;
    String Monitor2;
    String Raton;
    String Teclado;
    String Disco_portatil;
    @Id int Asiento;

    public Perifericos(String Monitor1, String Monitor2, String Raton, String Teclado, String Disco_portatil, int asiento) {
        this.Monitor1 = Monitor1;
        this.Monitor2 = Monitor2;
        this.Raton = Raton;
        this.Teclado = Teclado;
        this.Disco_portatil = Disco_portatil;
        this.Asiento = asiento;
    }

    public int getAsiento() {
        return Asiento;
    }

    public void setAsiento(int asiento) {
        this.Asiento = asiento;
    }


    public String getMonitor1() {
        return Monitor1;
    }

    public void setMonitor1(String Monitor1) {
        this.Monitor1 = Monitor1;
    }

    public String getMonitor2() {
        return Monitor2;
    }

    public void setMonitor2(String Monitor2) {
        this.Monitor2 = Monitor2;
    }

    public String getRaton() {
        return Raton;
    }

    public void setRaton(String Raton) {
        this.Raton = Raton;
    }

    public String getTeclado() {
        return Teclado;
    }

    public void setTeclado(String Teclado) {
        this.Teclado = Teclado;
    }

    public String getDisco_portatil() {
        return Disco_portatil;
    }

    public void setDisco_portatil(String Disco_portatil) {
        this.Disco_portatil = Disco_portatil;
    }

    @Override
    public String toString() {
        return "Monitor1: " + Monitor1 + ";   Monitor2: " + Monitor2 + ";   Raton: " + Raton + ";   Teclado: " + Teclado + ";   Disco_portatil: " + Disco_portatil + ";   Asiento: " + Asiento + '\n';
    }

    
    
}
