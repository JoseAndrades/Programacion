/*Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.*/

import java.util.Scanner;

public class tema7Ej16 {
  public static void main(String[]args) {
    Scanner leer= new Scanner(System.in);
    
    int[] array = new int [20];
    int num=0;
    int aux=0;
    
    //Cargamos el array con nº aleatorios
    for(int i=0; i<20; i++){
      array[i]=(int)(Math.random()*400);
    }
    
    //Mostramos el array
    for(int i=0; i<20; i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
    System.out.println("_______________________________________________________________________________");
    System.out.println();
    
    //Preguntamos que nºs quiere resaltar
    System.out.print("¿Quieres resaltar los múltiplos de '5' o de '7'?: ");
     num=leer.nextInt();
     
      for(int i=0; i<20; i++){
        if(num==5){
            if(array[i]%5==0 || array[i]%5==5 ){
              aux=array[i];
              System.out.print("["+array[i]+"]"+" ");
            }else
            System.out.print(array[i]+" ");
        }
        
        if(num==7){
            if(array[i]%7==0){
              aux=array[i];
              System.out.print("["+array[i]+"]"+" ");
            }else
            System.out.print(array[i]+" ");
        }
        
        
      }
      
  }
}
