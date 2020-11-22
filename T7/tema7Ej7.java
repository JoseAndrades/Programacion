/*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por
pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a
continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista
generada anteriormente. Los números que se han cambiado deben aparecer entrecomillados.*/

import java.util.Scanner;

public class tema7Ej7 {
  public static void main(String[]args){
  Scanner leer = new Scanner(System.in);
    int[] array = new int[100];
    int num1;
    int num2;
    String verde = "\033[32m";
    String blanco = "\033[37m";
    
    // Rellena el array con números aleatorios
      for (int i = 0; i < 100; i++) {
        array[i] = (int)(Math.random() * 21);
        System.out.print(array[i] + " ");
      }
      System.out.print("\nIntroduzca un número de los que se han mostrado: ");
        num1 = leer.nextInt();
      System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
        num2 = leer.nextInt();
        
      System.out.println();

      for (int i = 0; i < 100; i++) {
        if (array[i] == num1) {
          array[i] = num2;
          System.out.print(verde + "\"" + array[i] + "\" ");
        } else {
        System.out.print(blanco + array[i] + " ");
        }
      }
System.out.println();
  }
}
