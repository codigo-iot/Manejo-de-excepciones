package com.sic;
public class ExcepcionPropia extends Exception {
    int valorRecibido;
    public ExcepcionPropia(int valorRecibido) {
        this.valorRecibido = valorRecibido;
    }
    public String toString(){
        return("El valor que causo error fue: " + valorRecibido);
    }
}
