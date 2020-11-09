/*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
por espacios.*/

public class tema6Ej4 {
  public static void main(String[]args) {
    int aleatorio1=0;
    
    System.out.println("Muestra 20 números separados por espacios:");
    System.out.println();
    
      for(int i=1; i<=20; i++){
        aleatorio1=(int)(Math.random()*11);
        System.out.print(aleatorio1+(" "));
      }
  
  
  }
}
