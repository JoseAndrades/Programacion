import java.util.Scanner;
public class mediaPiramideInversa {
  public static void main(String[]args) {
    
    System.out.println("Introduce el número de filas con las que desea empezar");
    Scanner leer=new Scanner(System.in);
    int f=0;
    f=leer.nextInt();
  
    for (int j=1; j<=f; j--) {
      for (int i=1; i<=j; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
