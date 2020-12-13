/*Escribe un programa que rellene un array de 100 elementos con números enteros
aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.*/

import java.util.Scanner;

public class tema7Ej13 {
  public static void main (String[]args) {
    Scanner leer = new Scanner(System.in);
    
    int [] arrayOriginal = new int[100];
    int mayor=0;
    int menor=500;
    
    //Almacenamos los num aleatorios en el array
      for(int i=0; i<100; i++){
        arrayOriginal[i] =(int)(Math.random()*500);
      }
    
    //Mostramos el array original
    System.out.println("Array original:");
    System.out.print("[");
      for(int i=0; i<100; i++){
        System.out.print(" "+arrayOriginal[i]);
      }
    System.out.println("]");
    System.out.println();
  
    //Elección usuario
    System.out.print("¿Deseas resaltar el 'menor' o el 'mayor'?: ");
      String opcion = leer.nextLine();
      
      if(opcion.equalsIgnoreCase("mayor")) {
        System.out.println("Has elegido resaltar el mayor:");
        for(int i=0; i<100; i++){
          if(arrayOriginal[i] > mayor){
            mayor=arrayOriginal[i];
          }
        }
      } 
      
      if(opcion.equalsIgnoreCase("menor")) {
        System.out.println("Has elegido resaltar el menor:");
        for(int i=0; i<100; i++){
          if(arrayOriginal[i] < menor){
            menor=arrayOriginal[i];
          }
        }
      } 
    
    //Mostramos la matriz con los numeros resaltados
    System.out.print("[");
      for(int i=0; i<100; i++){
        if(arrayOriginal[i]==mayor){
          System.out.print("\033[35m"+" "+mayor+"\033[0m");
        }
        
        if(arrayOriginal[i]==menor){
          System.out.print("\033[35m"+" "+menor+"\033[0m");
        }
        
        if(arrayOriginal[i]!=mayor && arrayOriginal[i]!=menor )
          System.out.print(" "+arrayOriginal[i]);
        
      }
    System.out.println("]");
    System.out.println();
      
  }
}
