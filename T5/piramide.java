import java.util.Scanner;
public class piramide {
  public static void main (String[]args) {
    int h=0;
  
  System.out.print("¿Cuanta altura quieres que tenga la piramide?: ");
    Scanner leer=new Scanner(System.in);
    h=leer.nextInt();
    
    for (int j=0; j<=h; j++) {
      
      for (int k=h; k>=j; k--) {
        System.out.print(" ");
      }
      for (int m=0; m<=(j*2); m++) {
        System.out.print("*");
      }  
        System.out.println();
      
    }
    
    
    
  }
}
    
  
