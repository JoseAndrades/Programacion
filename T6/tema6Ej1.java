/*Escribe un programa que muestre la tirada de tres dados. 
 * Se debe mostrar también la suma total (los puntos que suman entre los tres dados) */
 
public class tema6Ej1 {
  public static void main(String[]args) {
    int aux=0;
    System.out.println("Tirada de tres dados");
    
    for(int i=1; i<=3; i++){
        int dado=(int)(Math.random()*6+1);
          System.out.print(i+"º Tirada: "+dado);
           aux=dado+aux;
          System.out.println();
    }
    
    System.out.print("La suma de las tres tiradas es: "+aux);
    
    
  }
}
