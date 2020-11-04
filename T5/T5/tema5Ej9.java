/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).*/

import java.util.Scanner;

public class tema5Ej9 {
  public static void main (String[]args) {
    Scanner leer=new Scanner(System.in);
    int numDigitos=1;

    System.out.print("Introduce un número entero y te dire cuantos dígitos tiene: ");
    long numIntroducido=leer.nextInt();
    long n=numIntroducido;
      while(n > 10){
        n /=10;
        numDigitos=(numDigitos+1);
      }
      
      System.out.println(numIntroducido + " tiene " +numDigitos+ " dígito/s.");
  }
}
