/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.*/

public class tema6Ej5{
  public static void main(String[]args) {
  int aleatorio=0;
  int contador=0;
  
    for(int i=0; i<=50; i++){
      aleatorio=(int)(Math.random()*200);
      contador++;
      
      if(contador==10){
        contador-=10;
        System.out.println();
      }
      System.out.print(aleatorio+(" "));  
      
    }
  
  
  }
}
