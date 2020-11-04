/*Escribe un programa que obtenga los números enteros comprendidos entre dos números
introducidos por teclado y validados como distintos, el programa debe empezar por
el menor de los enteros introducidos e ir incrementando de 7 en 7.*/

import java.util.Scanner;

public class tema5Ej18 {
  public static void main(String[]args) {
    Scanner leer = new Scanner(System.in);
      int num1=0;
      int num2=0;
  
    System.out.print("Introduce un número entero: ");
      num1=leer.nextInt();
    System.out.print("Introduce otro número entero: ");
      num2=leer.nextInt();
  
    if(num1<num2){
      
      for(int i=num1; i<=num2; i+=7 ){
        System.out.print(i);
        System.out.print(" ");  
      }
    
    }else{
      
      for(int i=num2; i<=num1; i+=7 ){
        System.out.print(i);
        System.out.print(" ");  
      }
     
     } 
  
  
  
  }
}
 
