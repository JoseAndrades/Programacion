/*Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.*/

import java.util.Scanner;

public class tema5Ej7 {
  public static void main (String[]args) {
  int clave=4321;
  int intentos=4;
  int numIntroducido=0;
  
  //usamos un bucle do-while ya que no sabemos el n exacto de vueltas que debe dar el bucle
  
    do{
      System.out.print("Introduce la contraseña: ");
      Scanner leer=new Scanner(System.in);
      numIntroducido=leer.nextInt();
        
        //validamos si el numero introducido es correcto, si lo es el programa finaliza
        if(numIntroducido == clave ){
          System.out.println("La caja fuerte se ha abierto satisfactoriamente");
          System.exit(0);
        
        //si no lo es anuciamos por pantalla los intentos y volvemos a preguntar
        }else
          System.out.println("Lo siento, esa no es la combinación");
          intentos = (intentos-1);
          System.out.println("Quedan "+ intentos +" intentos");
        
        //si el n de intentos llega a 0 el programa finaliza simulando el bloqueo de la caja fuerte
          if(intentos==0){
          System.out.println("Se ha bloqueado la caja fuerte");
          System.exit(0);
          }
    }while(numIntroducido != clave);
        
  }
}
