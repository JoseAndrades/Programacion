/*Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.*/

import java.util.Scanner;

public class tema7Ej6 {
  public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
    int[]array=new int[15];
    int aux;
    
      System.out.println("Escribe 15 enteros: ");
      
      for(int i=0; i<15; i++){
        array[i]=Integer.parseInt(System.console().readLine());
      }
      System.out.println();
      
    // Muestra el array original 
      System.out.println("Array original:");
      
      for (int i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      
      System.out.println("|");
      for (int i = 0; i < 75; i++) {
        System.out.print("█");
      }
      
      System.out.println("█");
      for (int i = 0; i < 15; i++) {
        System.out.printf("|%3d ", array[i]);
      }
      System.out.println("|");
      
    // rota una posición a la derecha 
      aux = array[14];
    
      for (int i = 14; i > 0; i--) {
        array[i] = array[i-1];
      }
      array[0] = aux;
    
    // Muestra el array rotado
    System.out.println("\nArray rotado a la derecha una posición:");
    
    for (int i = 0; i < 15; i++) {
      System.out.printf("|%3d ",i);
    }
    
    System.out.println("|");
    for (int i = 0; i < 75; i++) {
      System.out.print("█");
    }
    
    System.out.println("█");
    for (int i = 0; i < 15; i++) {
      System.out.printf("|%3d ", array[i]);
    }
    System.out.println("|");
      

  }
}
