/*Escribe un programa que muestre los n primeros términos de la
 serie de C. El primer término de la serie de Fibonacci
 es 0, el segundo es 1 y el resto se calcula sumando los dos
 anteriores, por lo que tendríamos que los términos son 0, 1, 1,
 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
 introducir por teclado. */
 
import java.util.Scanner;

public class tema5Ej12 {
  public static void main (String[]args) {
   
    System.out.print("Introduce el num que quieres que te muestre de la sucesión de Fibonacci: ");
    Scanner leer = new Scanner(System.in);
      int num=leer.nextInt();
    
    switch (num){
      case 1:
      System.out.println("0");
      break;
      
      case 2:
      System.out.print("0 1");
      break;
      
      default:
        System.out.print("0 1");
          int f1 = 0;
          int f2 = 1;
          int aux;
          while(num > 2) {
            aux = f1;
            f1 = f2;
            f2 = aux + f2;
            System.out.print(" " + f2);
            num--;
          }
    }
    System.out.println();
  }
}
