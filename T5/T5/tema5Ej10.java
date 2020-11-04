/*Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.*/

import java.util.Scanner;

public class tema5Ej10 {
  public static void main (String[]args) {
    Scanner leer=new Scanner(System.in);
    double num=0;
    double suma=0;
    double contador=0;

    System.out.println("Introduce tantos numeros enteros como quieras y te haré la media, para finalizar introduce -1");
      
      while(num>=0){
        num=leer.nextInt();
        contador++;
        suma=(suma+num);
      }  
        System.out.println("La media de los números introducidos es " + (suma - num) / (contador-1));
    
     
        
        
  
  }
}
