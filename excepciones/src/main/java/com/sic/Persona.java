package com.sic;

public class Persona {
 
    private int edad;
    
    public int getEdad() {
        return this.edad;
    }
 
    public void setEdad(int edad) {
        if (edad <= 0)
            throw new RuntimeException("La edad debe ser positiva");
        this.edad = edad;
    }
 
}