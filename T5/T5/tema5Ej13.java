/*Escribe un programa que lea una lista de diez números y determine
cuántos son positivos, y cuántos son negativos.*/

import java.util.Scanner;

public class tema5Ej13 {
  public static void main(String[] args) {
    int negativos = 0;
    int positivos = 0;
    int num = 0;
    
    System.out.println("Introduce 10 numeros y te dire cuantos eran positivos y cuales negativos" );
     
    for (int i = 0; i < 10; i++) {
      Scanner leer = new Scanner(System.in);
      num=leer.nextInt();
      if (num < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
  }
}
