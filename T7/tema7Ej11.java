/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante.*/

import java.util.Scanner;

public class tema7Ej11 {
  public static void main (String[]args) {
    Scanner leer = new Scanner(System.in);
    
    int array[] = new int [10];
    int arrayaux[] = new int [10];
    int num=0;
    int cont=0;
    
    //Recogemos datos y almacenamos en un array
    System.out.println("Introduce 10 números enteros: ");
    for(int i=0; i<10; i++){
      array[i]=leer.nextInt();
    }   
       
    //Mostramos el array original
    System.out.println("Array original:");
    for(int i=0; i<10; i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
    System.out.println("________________________________");
    
    //Guardamos los primos
    for(int i=0; i<10; i++){
      if(){
        arrayaux[cont]=array[i];
        cont++;
      }
    } 
    
    //Mostramos el array modificado
    System.out.println("Array modificado:");
    for(int i=0; i<10; i++){
      System.out.print(arrayaux[i]+" ");
    }
    
 }
}
