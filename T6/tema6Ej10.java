/*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres.*/

public class tema6Ej10 {
  public static void main(String[]args) {
    int aleatorio1=0;
    int aleatorio2=0;
    int contador=0;
    String caracter=" ";
    
    
    for(int i=1; i<=10; i++){   //for para n lineas
        aleatorio1=(int)(Math.random()*40+1);  //aleatorio para (aleatorio1)letras en cada linea
        
      for(int j=0; j<=aleatorio1; j++){       //for para elegir (aleatorio1)caracteres
          aleatorio2=(int)(Math.random()*5);  //aleatorio para elegir el caracter
          
          switch (aleatorio2){   
            case 0:
              caracter=("*");
              break;
            case 1:
              caracter=("-");
              break;
            case 2:
              caracter=("=");
              break;
            case 3:
              caracter=(".");
              break;
            case 4:
              caracter=("|");
              break;
            case 5:
              caracter=("@");
              break;
          }
        
        System.out.print(caracter); 
                
      }
      System.out.println();    //siguiente linea
    }
           
  }
}
