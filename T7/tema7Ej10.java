/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario.*/

public class tema7Ej10 {
  public static void main(String[]args){
    
    int array[] = new int [20];
    int arrayaux[] = new int [20];
    int cont=0;
    
    //Llenamos el array de nºaleatorios
    for(int i=0; i<array.length; i++){
      array[i]=(int)(Math.random()*100);
    }
    
    //Mostramos el array original
    System.out.println("Array original:");
    for(int i=0; i<20; i++){
      System.out.print(array[i]+" ");
    }
      System.out.println();
      System.out.println("_____________________________________________________________");
       
    //Guardamos los pares
    for(int i=0; i<20; i++){
      if(array[i]%2==0){
        arrayaux[cont]=array[i];
        cont++;
      }
    }
    
    //Guardamos los impares
    for(int i=0; i<20; i++){
      if(array[i]%2!=0){
        arrayaux[cont]=array[i];
        cont++;
      }
    }
    
    //Mostramos el array modificado
    System.out.println("Array modificado:");
    for(int i=0; i<20; i++){
      System.out.print(arrayaux[i]+" ");
    }
      System.out.println();
    
  }
}



