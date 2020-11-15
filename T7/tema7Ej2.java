/*Define un array de 10 simboloes con nombre “simbolo” y asigna
valores a los elementos según la siguiente tabla:*/

public class tema7Ej2 {
  public static void main(String[]args) {
    char[]simbolo=new char[10];
      simbolo[0]='a';
      simbolo[1]='x';
      simbolo[4]='@';
      simbolo[6]=' ';
      simbolo[7]='+';
      simbolo[8]='Q';
      
      for(int i=1; i<10; i++){
        System.out.println(i+"º posición= " + simbolo[i]);
      }
  }
}
