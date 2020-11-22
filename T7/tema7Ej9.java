/*Realiza un programa que pida 8 números enteros y que luego muestre esos números
junto con la palabra "par" o "impar" según proceda*/

import java.util.Scanner;

public class tema7Ej9 {
  public static void main(String[]args){
  Scanner leer = new Scanner(System.in);
    int[] array = new int[8];
    
    System.out.println("Introduzca 8 números enteros:");
    
    for (int i = 0; i < 8; i++) {
      array[i] = leer.nextInt();
    }
    for (int i = 0; i < 8; i++) {
      if (array[i] % 2 == 0) {
        System.out.println(array[i] + " par");
      } else {
        System.out.println(array[i] + " impar");
      }
    }
  }
}
