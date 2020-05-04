
package funcaodemo;

import java.util.Scanner;


public class FuncaoDemo {

    public static void main(String[] args) {
        int A, B;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();
        
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();
        
        System.out.println(imprime() + x(A, B));
    }
    public static int x(int A, int B){
        return A + B;
    
    }

    public static String imprime() {
        return "x = ";
        
    }
    
