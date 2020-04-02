import java.util.Scanner;

public class MyClass {
    
    public static void main(String args[]) {
      
      int numero1;
      int numero2;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Digite o valor de A: " );
      numero1 = sc.nextInt();
      
      System.out.println("Digite o valor de B: " );
      numero2 = sc.nextInt();
      
      System.out.println("X =  " + (numero1 + numero2));
    }
}
