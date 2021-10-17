package com.sic;

public class App {
    public static void main(String[] args) {
        try {
            Persona persona = new Persona();
            persona.setEdad(-10);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Mensaje despues de error");
    }
}
