public class PRUEBA {
  public static void main(String[]args) {
    int num1=0;
    int num2=0;
    int num3=0;
    int aleatorio=0;
    int contador1=0;
    int contador2=0;
    int contador3=0;
    int contador4=0;
    int contador5=0;
    int contador6=0;
  
    for(int i=0; i<=1000; i++){
      
      do{
      num1=(int)(Math.random()*6+1);
      num2=(int)(Math.random()*6+1);
      num3=(int)(Math.random()*6+1);
      }while(!(num1==num2 && num2==num3 && num1==num3));
      
      
      if(num1==1 || num2==1 || num3==1){
        contador1+=3;
      }
      if(num1==2 || num2==2 || num3==2){
        contador2+=3;
      }
      if(num1==3 || num2==3 || num3==3){
        contador3+=3;
      }
      if(num1==4 || num2==4 || num3==4){
        contador4+=3;
      }
      if(num1==5 || num2==5 || num3==5){
        contador5+=3;
      }
      if(num1==6|| num2==6 || num3==6){
        contador6+=3;
      }
        
      
    }
      System.out.println("Han salido "+contador1+" números 1");
      System.out.println("Han salido "+contador2+" números 2");
      System.out.println("Han salido "+contador3+" números 3");
      System.out.println("Han salido "+contador4+" números 4");
      System.out.println("Han salido "+contador5+" números 5");
      System.out.println("Han salido "+contador6+" números 6");
  }
}
