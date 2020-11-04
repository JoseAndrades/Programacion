/*Escribe un programa que muestre en tres columnas, el cuadrado y
el cubo de los 5 primeros números enteros a partir de uno que se
introduce por teclado.*/

import java.util.Scanner;

public class tema5Ej11 {
  public static void main(String[]args) {
      
  
    System.out.print("Introduce un entero: ");
      Scanner leer = new Scanner(System.in);
      int num=leer.nextInt();
    
    for(int i=num; i<=(num+5); i++){
      System.out.printf("%4d %6d %8d\n", i, i*i , i*i*i);
    }
    
  }
}
