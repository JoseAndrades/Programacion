import java.util.Scanner;

public class tema4Ej29 {
  public static void main(String[]args){
   Scanner s = new Scanner(System.in); 
  
    String pitufo = "";
    String resultadocomida = "";
    String resultadobebida = "";
    double preciocomida = 0.00;
    double preciobebida = 0.00;
    
    System.out.print("¿Qué has comido? (donut, palmera o pitufo): " );
    String comida = s.nextLine();
      
      if(comida.equalsIgnoreCase("pitufo")) {
        System.out.print("¿Con que se ha tomado el pitufo?(aceite o tortilla): ");
        pitufo = s.nextLine();
        
        if(pitufo.equalsIgnoreCase("aceite")) {
        resultadocomida = "pitufo con aceite: 1.20€";
        preciocomida = 1.20;
        
        }else if(pitufo.equalsIgnoreCase("tortilla")) {
        resultadocomida = "pitufo con tortilla: 1.60€";
        preciocomida = 1.60;
        
         }
      }
      
      if(comida.equalsIgnoreCase("donut")) {
        resultadocomida = "donut: 1€";
        preciocomida = 1.00;
      
      }else if(comida.equalsIgnoreCase("palmera")){
        resultadocomida = "palmera: 1.40€";
        preciocomida = 1.40;
       }
       
    System.out.print("¿Qué has bebido? (cafe o zumo): " );
    String bebida = s.nextLine();
        
      if(bebida.equalsIgnoreCase("cafe")) {
        resultadobebida = "cafe: 1.20€";
        preciobebida = 1.20;
      
      }else if(bebida.equalsIgnoreCase("zumo")) {
        resultadobebida = "zumo: 1.50€";
        preciobebida = 1.50;
      
       }
     
      System.out.println(resultadocomida);
      System.out.println(resultadobebida);
      System.out.print("Precio desayuno: " + (preciocomida + preciobebida) + "€");
        
  }
}
    
