// Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.

import java.util.Scanner;

public class tema5Ej20 {
  public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
      int alturaIntroducida = leer.nextInt();
      
    System.out.print("Introduzca el carácter de relleno: ");
      char caracter = leer.next().charAt(0);
      
      int altura = 1;
      int i = 0;
      int espaciosPorDelante = alturaIntroducida - 1;
      int espaciosInternos = 0;
      
        while (altura < alturaIntroducida) {
        // inserta espacios delante
          for (i = 1; i <= espaciosPorDelante; i++) {
            System.out.print(" ");
          }
        // pinta la línea
          System.out.print(caracter);
          for (i = 1; i < espaciosInternos; i++) {
            System.out.print(" ");
          }
          if (altura>1) {
            System.out.print(caracter);
          }
          
          System.out.println();
          altura++;
          espaciosPorDelante--;
          espaciosInternos += 2;
          } // while /////////
         
          // base de la pirámide
          for (i = 1; i < altura*2; i++) {
          System.out.print(caracter);
          }
  }
}
