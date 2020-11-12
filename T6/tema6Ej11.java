/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.*/

public class tema6Ej11 {
  public static void main(String[]args) {
    int aleatorio=0;
    int suspenso=0;
    int suficiente=0;
    int bien=0;
    int notable=0;
    int sobresaliente=0;
    
    for(int i=1; i<=20; i++){
      aleatorio=(int)(Math.random()*11);
      System.out.print(aleatorio+" ");
        switch(aleatorio){
          case 0:
           suspenso++;
           break;
          case 1:
           suspenso++;
           break;
          case 2:
           suspenso++;
           break;
          case 3:
           suspenso++;
           break;
          case 4:
           suspenso++;
           break;
          case 5:
           suficiente++;
           break;
          case 6:
           bien++;
           break;
          case 7:
           notable++;
           break;
          case 8:
           notable++;
           break;
          case 9:
           sobresaliente++;
           break;
          case 10:
           sobresaliente++;
           break;
        }
    }
      System.out.println();
      System.out.println("El número de suspensos es "+suspenso);
      System.out.println("El número de suficientes es "+suficiente);
      System.out.println("El número de bien es "+bien);
      System.out.println("El número de notables es "+notable);
      System.out.println("El número de sobresalientes es "+sobresaliente);
    
  }
}
