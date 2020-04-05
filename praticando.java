import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     
     double A, P;
     double IMC;
     
     Scanner sc = new Scanner(System.in);
     
     
     System.out.println("Digite sua Altura: ");
     A = sc.nextDouble();
     
     System.out.println("Digite seu Peso: ");
     P = sc.nextDouble();
     
     IMC = (P)/(A*A);
     
     System.out.println("Seu IMC é: " + IMC);
     
