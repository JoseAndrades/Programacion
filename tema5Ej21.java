/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.*/

import java.util.Scanner;

public class tema5Ej21 {
  public static void main(String[]args) {
    Scanner leer=new Scanner(System.in);
    
    System.out.println("Introduce tantos enteros como quieras, introduce un valor negativo para parar: ");
      
      int num=0;
      int parmayor=0;
      int sumaimpar=0;
      int contadorimpar=0;
      int contador=0;
      
      do{
        num=leer.nextInt();
        contador++;
        
          if((num%2)==0){
            }if(parmayor<=num){
             parmayor=num;
             
          }else
           sumaimpar=sumaimpar+num;
           contadorimpar=contadorimpar+1;
           
      }while(num>=0);
      
    System.out.println("Se ha introducido " + (contador-1) + " números");
    System.out.println("El par mas grande introducido es el "+ parmayor );
    System.out.println("La media de los impares introducidos "+ sumaimpar/contadorimpar);
  }
}
