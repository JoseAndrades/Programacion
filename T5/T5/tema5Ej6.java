/*Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while.*/

public class tema5Ej6 {
  public static void main (String[]args) {
   System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás");
   int i=320;
   
    do{
    System.out.println(i);
    i -=20;
    }while(i>=160);
  
  }
}
