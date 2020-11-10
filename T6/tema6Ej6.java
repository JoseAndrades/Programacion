/*Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto.*/

import java.util.Scanner;

public class tema6Ej6 {
  public static void main(String[]args) {
    Scanner leer=new Scanner(System.in);
      int num=0;
      int aleatorio=0;
      int intentos=5;
      
      System.out.println("Voy a pensar un número entre 0 y 100, conseguiras aivinarlo en 5 intentos?");
      System.out.println("__________________________________________________________________________");
      System.out.println();
      System.out.println();
      
      
      aleatorio=(int)(Math.random()*101);
      System.out.println(aleatorio);       //HACK para mostrar cual es el numero(borrar //)
      
    do{
      intentos--;
      
      System.out.print("¿En que número estoy pensando?: ");
        num=leer.nextInt();
          System.out.println();
        
      System.out.println("-Digo el "+num);
          System.out.println();
          
        if(aleatorio==num){
          System.out.println("¡Acertastes!");
          System.out.println(" Era el "+aleatorio);
            System.exit(0);
        }
        
        if(intentos<0){
          System.out.println("Gastastes todos los intentos, el número era el "+aleatorio);
            System.exit(0);
        }  
        
        if(num>aleatorio){
            System.out.println("    El número que he pensado es mas pequeño que ese, te quedan "+intentos+" intentos");
              System.out.println();
              
        }else
            System.out.println("    El número que he pensado es mas grande que ese, te quedan "+intentos+" intentos");
              System.out.println();
              
    }while(intentos>0);
    
    
  }
}
