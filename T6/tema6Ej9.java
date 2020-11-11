/*Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.*/

public class tema6Ej9 {
  public static void main(String[]args) {
    int aleatorio=0;
    int contador=0;
    
    do{
      
      do{
      aleatorio=(int)(Math.random()*101);
      }while((aleatorio%2)!=0);
      
        System.out.print(aleatorio+" ");
        contador++;
        
    }while(aleatorio!=24);
    
      System.out.println();
      System.out.println("Encontré el 24 en el "+contador+"º intentos");
  }
}
