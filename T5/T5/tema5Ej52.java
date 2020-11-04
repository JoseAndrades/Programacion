/*Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
queda igual.*/

import java.util.Scanner;

public class tema5Ej52 {
  
  public static void main (String[]args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce un núemero: ");
    long num = Long.parseLong(s.nextLine());
    
    long copia = num;
    int  largo = 0;
    
    while (copia>0){
      copia /= 10;
      longitud ++;
    }
    
    int primero = (int)(num / Math.pow(10, longitud - 1));
    long aux = (long)(primero * Math.pow(10, longitud - 1));
    long resultado = (num - aux) * 10 + primero;
    System.out.println("El número resultado es " + resultado);
    
  }
}
