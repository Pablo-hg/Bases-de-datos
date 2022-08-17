              
package modelo;

import java.util.ArrayList;

public class Persona {
    
    String nombre,dni;
    int edad;
    double altura,peso;
    char sexo;
    ArrayList <Vivienda> casas;
    
    

    public Persona(String nombre, String dni, int edad, double altura, double peso, char sexo,ArrayList<Vivienda> casas) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.casas = casas;
        sexo = Character.toLowerCase(sexo);
        if (sexo == 'H' || sexo == 'M'){
            this.sexo = sexo;
        } else {
           this.sexo = 'H'; 
        } 
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vivienda> getCasas() {
        return casas;
    }

    public void setCasas(ArrayList<Vivienda> casas) {
        this.casas = casas;
    }
    
    
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double alturam) {
        this.altura = alturam;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        sexo = Character.toLowerCase(sexo);
       if (sexo == 'H' || sexo == 'M'){
            this.sexo = sexo;
        } else {
           this.sexo = 'H'; 
        }
    }
    
    public int calcularIMC(){
        double altura = Persona.this.getAltura();
        double imc = peso/Math.pow(altura, 2);
        if (imc < 20){
            return -1;
        }else if (imc <= 25){
            return 0;
        } else { //imc > 25
            return 1;
        }
    }
    
    public boolean esMayordeEdad(){
        if (edad < 18){
            return false;
        } else {
            return true;
        }
    }
    
    public String comprobarSexo(){
        if (sexo == 'H' || sexo == 'M'){
            return null;
        } else{
            sexo = 'H';
            return null;
        }
    }
    
    public String generaDNI(){
        int cifras = (int) (Math.random()*10000000)+1000000;
        int resto = (int) (cifras % 23);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char f = letras.charAt(resto);
        String dnicompleto = String.valueOf(cifras) + f;
            return dnicompleto;
    }
    
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", sexo=" + sexo + '}' + ' ' + calcularIMC();
    }
    
    
    
    
    
    
    
    
}
