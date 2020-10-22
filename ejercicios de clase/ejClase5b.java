import java.util.Scanner;

public class ejClase5b {
  public static void main(String[]args) {
  Scanner leer = new Scanner(System.in);
  int n=0;
  int contador=0;
  
    System.out.println ("Dame un numero y te hare una piramide con esas lineas");
    n= leer.nextInt();
    
    for(int i=0; i<=n; i++) {
     for (int a=1; a<=contador;a++)
     {
    System.out.print(" "+a);
    }
    System.out.println("");
    contador=contador+1;
    }
  }
}
