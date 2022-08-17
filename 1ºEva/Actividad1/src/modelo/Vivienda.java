
package modelo;


public class Vivienda {
    
    int Id,Numhabitaciones;
    String Direccion,Ciudad;

    public Vivienda(int Id, int Numhabitaciones, String Direccion, String Ciudad) {
        this.Id = Id;
        this.Numhabitaciones = Numhabitaciones;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getNumhabitaciones() {
        return Numhabitaciones;
    }

    public void setNumhabitaciones(int Numhabitaciones) {
        this.Numhabitaciones = Numhabitaciones;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    @Override
    public String toString() {
        return "Vivienda{" + "Id: " + Id + ", Numhabitaciones: " + Numhabitaciones + ", Direccion: " + Direccion + ", Ciudad: " + Ciudad + '}';
    }

    
    
    
}