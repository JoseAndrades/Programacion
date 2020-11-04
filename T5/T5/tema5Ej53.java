import java.util.Scanner;
 public class tema5Ej53 {
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.print("Introduce el numero de filas que desee: ");
    int h=s.nextInt();
    
    for(int i=0; i<h; i++){
      for(int j=0; j<(h-i); j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
