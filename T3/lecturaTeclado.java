public class lecturaTeclado {
  public static void main(String[] args) {
    int x;
    int y;
    String linea;
    
    System.out.println ("Escribe un número");
    linea = System.console().readLine();
    x= Integer.parseInt(linea);
    
    System.out.println ("Escribe otro número");
    linea = System.console().readLine();
    y= Integer.parseInt(linea);
    
    System.out.println(x + "*" + y + "=" + (x * y));
  }
}
    
