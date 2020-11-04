/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/

import java.util.Scanner;

public class tema5Ej19 {
  public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
    int h = 0;
    char caracter;
    
    System.out.print("¿Qué altura desea que tenga la piramide?: ");
    h=leer.nextInt();
    System.out.print("¿Con que caracter quieres construir la piramide?: ");
    caracter = leer.next().charAt(0);
    
    for (int j=0; j<=(h-1); j++) {
      
      for (int k=h; k>=j; k--) {
        System.out.print(" ");
      }
      
      for(int m=0; m<=(j*2); m++) {
        System.out.print(caracter);
      }  
        System.out.println();
      
    }
    
  }
}
