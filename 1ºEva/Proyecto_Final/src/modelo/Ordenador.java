
package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ordenador {
    String Placa;
    String Procesador;
    String Tarjeta_grafica;
    String Memoria_ram;
    String Alimentacion;
    String Disco_duro;
    String Disco_ssd;
    String Ventilacion;
    String Caja;
    @Id int Id;

    public Ordenador(String Placa, String Procesador, String Tarjeta_grafica, String Memoria_ram, String Alimentacion, String Disco_duro, String Disco_ssd, String Ventilacion, String Caja, int Id) {
        this.Placa = Placa;
        this.Procesador = Procesador;
        this.Tarjeta_grafica = Tarjeta_grafica;
        this.Memoria_ram = Memoria_ram;
        this.Alimentacion = Alimentacion;
        this.Disco_duro = Disco_duro;
        this.Disco_ssd = Disco_ssd;
        this.Ventilacion = Ventilacion;
        this.Caja = Caja;
        this.Id = Id;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public String getTarjeta_grafica() {
        return Tarjeta_grafica;
    }

    public void setTarjeta_grafica(String Tarjeta_grafica) {
        this.Tarjeta_grafica = Tarjeta_grafica;
    }

    public String getMemoria_ram() {
        return Memoria_ram;
    }

    public void setMemoria_ram(String Memoria_ram) {
        this.Memoria_ram = Memoria_ram;
    }

    public String getAlimentacion() {
        return Alimentacion;
    }

    public void setAlimentacion(String Alimentacion) {
        this.Alimentacion = Alimentacion;
    }

    public String getDisco_duro() {
        return Disco_duro;
    }

    public void setDisco_duro(String Disco_duro) {
        this.Disco_duro = Disco_duro;
    }

    public String getDisco_ssd() {
        return Disco_ssd;
    }

    public void setDisco_ssd(String Disco_ssd) {
        this.Disco_ssd = Disco_ssd;
    }

    public String getVentilacion() {
        return Ventilacion;
    }

    public void setVentilacion(String Ventilacion) {
        this.Ventilacion = Ventilacion;
    }

    public String getCaja() {
        return Caja;
    }

    public void setCaja(String Caja) {
        this.Caja = Caja;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "Placa: " + Placa + ";   Procesador: " + Procesador + ";   Tarjeta_grafica: "
                + Tarjeta_grafica + ";   Memoria_ram: " + Memoria_ram + ";   Alimentacion: "
                + Alimentacion + ";   Disco_duro: " + Disco_duro + ";   Disco_ssd: " +
                Disco_ssd + ";   Ventilacion: " + Ventilacion + ";   Caja: " + Caja +
                ",   Asiento: " + Id + '\n';
    }
    
    

    
    
}
