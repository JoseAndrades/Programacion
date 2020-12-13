/*Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca
siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
dos personas, se podrá colocar donde haya una o dos personas Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes.*/

import java.util.Scanner;

public class tema7Ej15 {
  public static void main (String[]args) {
    Scanner leer = new Scanner(System.in);
    
    int[] arrayMesas = new int [10];
    int ncomensales=0;
    int mesa=0;
    int contador=0;
    int contador0=0;
    
    //Cargamos aleatoriamente las mesas
      for(int i=0; i<10; i++){
        arrayMesas[i] = (int)(Math.random()*5);
      }
      
      //Mostramos mesas iniciales
      System.out.println("Mesas iniciales:");
      System.out.print("nº Mesa   ");
      for(int i=0; i<arrayMesas.length; i++){
        System.out.print(" "+(i+1)+" ");    
      }
      System.out.println();
      
      do{
        System.out.print("comensales");
        for(int i=0; i<arrayMesas.length; i++){
          System.out.print(" "+arrayMesas[i]+" ");    
        }
        System.out.println(); 
        
        //Preguntamos el número de gente que hay en el grupo
        System.out.println();
        System.out.print("¿Cuántos comensales sois en el grupo?: ");
          ncomensales=leer.nextInt();
          if(ncomensales>4){
            System.out.println("Lo sentimos no se admiten más de 4 personas por grupo");
            break;
          }
        
        //contamos cuantas mesas hay con 0 comensales
        for(int i=0; i<10; i++){
          if(arrayMesas[i]==0){
            contador++;
          }
        }
        //Buscamos el hueco para el grupo
        for(int i=0; i<10; i++){
          if(arrayMesas[i]==0){
            System.out.println("-Se les ha asignado la mesa nº"+(i+1));
            mesa=i;
            contador0++;
            break;
          }
          if(contador==contador0 && arrayMesas[i]!=0){
            if(ncomensales+arrayMesas[i]<=4){
              System.out.println("-Se les ha asignado la mesa nº"+(i+1));
              mesa=i;
              break;
            }
          }
        }
        
        System.out.println("____________________________________________");
        
        //Actualizamos las mesas
        for(int i=0; i<10; i++){
          if(i==mesa){
            switch(ncomensales){
              case 1:
                arrayMesas[i]+=1;
                break;
              case 2:
                arrayMesas[i]+=2;
                break;
              case 3:
                arrayMesas[i]+=3;
                break;
              case 4:
                arrayMesas[i]+=4;
                break;
            }
          }
        }  
        
        //Mostramos mesas actualizadas
        System.out.println("Mesas actualizadas:");
        System.out.print("nº Mesa   ");
        for(int i=0; i<arrayMesas.length; i++){
          System.out.print(" "+(i+1)+" ");    
        }
        System.out.println();
      }while(ncomensales!=-1);
    
  }
}
