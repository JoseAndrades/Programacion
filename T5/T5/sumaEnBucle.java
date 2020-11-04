public class sumaEnBucle {
  public static void main (String[] args) {
    int x;
    int y;
    String linea;
    
    for(int i = 0; i <= 100; i += 5) {
    
    System.out.println ("Escribe un número");
    linea = System.console().readLine();
    x= Integer.parseInt(linea);
    System.out.println ("Escribe otro número");
    linea = System.console().readLine();
    y= Integer.parseInt(linea);
    
    System.out.println("El resultado de la suma es " +(x+y));
  
  
    }
  }
}

  
