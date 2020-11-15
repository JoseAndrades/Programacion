/*Escribe un programa que lea 10 números por teclado y que luego
los muestre en orden inverso, es decir, el primero que se
introduce es el último en mostrarse y viceversa.*/

import java.util.Scanner;

public class tema7Ej3 {
  public static void main(String[]args) {
    Scanner leer = new Scanner(System.in);
    int[]array=new int[10];
      
      System.out.println("Escribe 10 enteros y te los mostrare invertidos");
      
      for(int i=0; i<10; i++){
        array[i]=Integer.parseInt(leer.nextLine());
      }
      System.out.println("Los número alreves son:");
      for(int j=9; j>=0; j--){
        System.out.println(j+"º posición= " + array[j]);
      }
    
  }
}
