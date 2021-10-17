package com.sic;
public class App {
  public static void main(String[] args) {
    int[] valores = new int[] { 10, 51, 9, 70, 80 };
    try {
      for (int i = 0; i < valores.length; i++) {
        if (valores[i] < 10) {
          throw new ExcepcionPropia(valores[i]);
        }
        System.out.println("Valor obtenido de arreglo: " + valores[i]);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
