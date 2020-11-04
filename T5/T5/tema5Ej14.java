/*Escribe un programa que pida una base y un exponente (entero positivo)
 y que calcule la potencia.*/
 
import java.util.Scanner;

public class tema5Ej14 {
  public static void main (String[]args){
    Scanner leer=new Scanner(System.in);
    
    int base;
    int exponente;
    int potencia=1;
    
    System.out.print("Introduce un entero como base: ");
     base=leer.nextInt();
    System.out.print("Introduce un entero como exponente: ");
     exponente=leer.nextInt();
    
      
    for(int i=1; i <=exponente; i++){
      potencia=base*potencia;
      System.out.println(base +"^"+ i + "=" + potencia);
     
    }
  }
}
