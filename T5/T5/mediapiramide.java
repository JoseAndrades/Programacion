import java.util.Scanner;
public class mediapiramide {
  public static void main(String[]args) {
    
    System.out.print("Introduce el número de filas deseadas: ");
    Scanner leer=new Scanner(System.in);
    int f=0;
    
    f=leer.nextInt();
    for (int j=1; j<=f; j++) {
      for (int i=1; i<=j; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
