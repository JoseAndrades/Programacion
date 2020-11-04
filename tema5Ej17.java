/* Realiza un programa que sume los 100 números siguientes a un número entero y positivo
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es
un número positivo).*/

import java.util.Scanner;

public class tema5Ej17 {
  public static void main(String[]args) {
    Scanner leer = new Scanner(System.in);
    System.out.print("Dame un número positivo y te sumare los 100 siguientes: ");
      int num=leer.nextInt();
      int aux=0;
      
      if(num>0){
        for(int i=num; i<(num+100); i++){
        aux+=i;
        System.out.println(aux);
        }
        System.out.println("La suma de los 100 consecutivos a "+num+" da "+aux);
        
      }else {
      System.out.println("TE DIJE POSITIVO");
      System.exit(0);
      }
  }
}
