//Muestra la tabla de multiplicar de un número introducido por teclado.

import java.util.Scanner;

public class tema5Ej8 {
  public static void main (String[]args) {
  Scanner leer=new Scanner(System.in);
  System.out.print("Introduce el numero del que deseas la tabla de multiplicar: ");
    int num=leer.nextInt();
    
    //en este programa usamos un bucle for usando las vueltas(i) para multiplicar por el valor elegido
    for(int i=0; i<=10; i++ ){
    System.out.println(i + "x" + num + " = " + (i*num));
    } 
   
  
  }
}
