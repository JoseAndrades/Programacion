import java.util.Scanner;

public class tema5Ej41 {
  public static void main(String[]args){
  Scanner s= new Scanner (System.in);
    System.out.println("Dame un numero entero y te dire por cuantos pares e impares esta compuesto");
    System.out.println("__________________________________________________________________________");
    System.out.print("Número entero: ");
    long numeroIntroducido=s.nextInt();
    long n = numeroIntroducido;
    int cuentaPares = 0;
    int cuentaImpares = 0;
    
    while (n > 0) {
      if ((n % 10) % 2 == 0) {
          cuentaPares++;
      }else {
          cuentaImpares++;
      }
          n /= 10;
    }
  System.out.print("El "+numeroIntroducido+" contiene "+cuentaPares+" dígitos pares\ 
  "y "+cuentaImpares+" dígitos impares.");

  }
}
