/* Realiza un programa que muestre al azar el nombre de una carta de la baraja
española(Oro, espadas, copa, basto ,10 cartas en cada una).
Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as. */

import java.util.Scanner;

public class tema6Ej3 {
  public static void main(String[]args) {
    Scanner leer=new Scanner(System.in);
    String clase=" ";
    String valor=" ";
    
    int aleatorio1=0;
    int aleatorio2=0;
    
    System.out.print("Dime cuantas cartas quieres que saque de la baraja: ");
      int cantidad=leer.nextInt();
      
      for(int i=1; i<=cantidad; i++){
    
          aleatorio1=(int)(Math.random()*10+1);
          
            switch (aleatorio1){
              case 1:
                valor=("as");
                break;
              case 8:
                valor=("sota");
                break;
              case 9:
                valor=("caballo");
                break;
              case 10:
                valor=("rey");
                break;
              default:
                valor=String.valueOf(aleatorio1);
                break;
            }
            
          
          
        
          aleatorio2=(int)(Math.random()*4);
          
          switch(aleatorio2){
            case 0:
              clase=("oro");
              break;
            case 1:
              clase=("espadas");
              break;
            case 2:
              clase=("copas");
              break;
            case 3:
              clase=("bastos");
              break;
          }
        
        System.out.println(i+"º Carta: "+valor+(" de ")+clase);
      }
      
  }
}
