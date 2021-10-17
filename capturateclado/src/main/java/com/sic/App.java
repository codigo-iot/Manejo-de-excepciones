package com.sic;
import java.util.Scanner;

import javax.management.RuntimeErrorException;
public class App {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese edad: ");
        boolean repetir;
        int edad =0;
        do{
            repetir = false;
            try {
                edad = lectura.nextInt();
                if(edad<0) throw new RuntimeException("La edad debe ser mayor o igual que cero, ingrese un valor válido");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                lectura.nextLine();
                repetir= true;
            }

        } while(repetir);
        System.out.println("La edad ingresada es: " + edad);
    }
}