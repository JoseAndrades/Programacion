import java.util.Scanner;

public class ejClase5 {
  public static void main(String[]args) {
  Scanner leer = new Scanner(System.in);
  int n=0;
  
    System.out.println ("Dame un numero y te hare una linea hasta llegar al numero");
    n= leer.nextInt();
    
    for(int i=1; i<=n; i++) {
    System.out.print(i+" ");
    }
  }
}
