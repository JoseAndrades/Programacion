/*Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.*/

import java.util.Scanner;

public class tema7Ej14 {
  public static void main (String[]args) {
    Scanner leer = new Scanner(System.in);
    
    String [] arrayColoresIniciales = new String [9];
    String [] arrayInicial = new String [8];
    String [] arrayColores = new String [8];
    String [] arrayNoColores = new String [8];
    String [] arrayModificado = new String [8];
    
    int contColores=0;
    int contNoColores=0;
    int posicion=0;
    

    //Introducimos los colores que conoce el programa en un array
      arrayColoresIniciales[0]="verde";
      arrayColoresIniciales[1]="rojo";
      arrayColoresIniciales[2]="azul";
      arrayColoresIniciales[3]="amarillo";
      arrayColoresIniciales[4]="naranja";
      arrayColoresIniciales[5]="rosa";
      arrayColoresIniciales[6]="negro";
      arrayColoresIniciales[7]="blanco";
      arrayColoresIniciales[8]="negro";
      
    
    //Alamacenamos las palabras que introduzca el usuario
      System.out.println("Introduce palabras para almacenarlas");
        for(int i=0; i<arrayInicial.length; i++){
          arrayInicial[i]=leer.nextLine();
        }
        System.out.println();
        
    
    //Comparamos las palabras con los colores y las almacenamos
        for(int i=0; i<arrayInicial.length; i++){
          boolean esta = false;
          for(int j=0; j <arrayColoresIniciales.length ; j++){
            if (arrayInicial[i]==arrayColoresIniciales[j]){
              esta = true;
            }
            if (esta = true){
              arrayColores[contColores] = arrayInicial[i];
              contColores++;
              
            }else
              arrayNoColores[contNoColores] = arrayInicial[i];
              contNoColores++;
          }
        }
        
    //Mostramos la lista ordenada
      System.out.println("Lista ordenada:");
        for(int i=0; i<arrayColores.length; i++){
          System.out.println("Posición "+(i+1)+"="+arrayColores[i]);
            posicion++;
        }
        for(int i=0; i<arrayNoColores.length; i++){
          System.out.println("Posición "+(posicion+1)+"="+arrayColores[i]);
        }
        System.out.println();
        
    
  }
}
