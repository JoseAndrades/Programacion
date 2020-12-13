/*Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla.*/

import java.util.Scanner;

public class tema7Ej17 {
  public static void main(String[]args){
    Scanner leer= new Scanner(System.in);
    
    int array[] = new int [10];
    int arrayaux[] = new int [10];
    int num=0;
    int act=0;
    int aux=0;
    int posc=0;
    
    
    //Cargamos el array con nº aleatorios
    for(int i=0; i<array.length; i++){
      array[i]=(int)(Math.random()*101);
    }
    
    //Pedimos el nº
    do{
      System.out.print("Dime un número(0-100): ");
        num=leer.nextInt();
      
      //Comprobamos si el nº esta en el array
      for(int i=0; i<array.length; i++){
        if(num==array[i]){
          act++;
          System.out.println("______________________________________");
          System.out.println("El nº "+num+" se encuentra en la lista");
        }
      }
      
    }while(act!=1);
    
    //calculamos la posición del nº
    for(int i=0; i<10; i++){
      if(array[i]==num){
      posc=i;
      arrayaux[0]=num;
      aux++;
      }
    }
    //Alamacenamos los nº
    for(int i=posc+1; i<10; i++){ 
      if(array[i]!=num){
        arrayaux[aux]=array[i];
        aux++;
      }
    }
    for(int i=0; i<posc; i++){
      arrayaux[aux]=array[i];
      aux++;
    }
    
    //Mostramos el modificado
    System.out.println();
    System.out.println("Array modificado:");
    for(int i=0; i<10; i++){ 
      System.out.printf("%4d", arrayaux[i]);
    }
    System.out.println();
    
    //Mostramos el array original
    System.out.println();
    System.out.println("Array original:");
    for(int i=0; i<10; i++){ 
      System.out.printf("%4d", array[i]);
    }
      
  }
}
