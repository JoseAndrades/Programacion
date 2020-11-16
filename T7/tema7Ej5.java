/*Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.*/

import java.util.Scanner;
public class tema7Ej5 {
  public static void main(String[]args) {
    Scanner leer=new Scanner(System.in);
    
    int[]array=new int[10];
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    
    System.out.println("Escribe 10 enteros y te mostrare el máx. y el mín.");
        
    for(int i=0; i<10; i++){
        array[i]=Integer.parseInt(leer.nextLine());
        
        if(array[i]>max){
          max=array[i];
        }
        if(array[i]<min){
          min=array[i];
          
        }
    }
    
      System.out.println("________________");
    
        System.out.println(max+" es el máximo");
      
        System.out.println(min+" es el mínimo");
        
        
    
     
  }
}
