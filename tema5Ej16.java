/*Escribe un programa que diga si un número introducido por teclado
es o no primo. Un número primo es aquel que sólo es divisible entre
él mismo y la unidad.*/

import java.util.Scanner;

public class tema5Ej16 {
  public static void main (String[]args) {
  
    System.out.print("Introduzca un número entero y le diré si es primo: ");
    Scanner leer = new Scanner(System.in);
    int num = leer.nextInt();
    boolean primo= true;
  
    for(int i=2; i < num; i++){
      if((num%i)==0){
        primo=false;
      }
    }
  
    if(primo){
      System.out.println("El número introducido es primo");
      
    }else{
      System.out.println("El número introducido no es primo");
    
    }
  }
}
