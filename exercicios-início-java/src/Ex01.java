import java.util.Locale;
import java.util.Scanner;
// Exercicios de entrada e saída
public class Ex01 {
  
    public static void main(String[] args) {

        double x;
        double y; 
        double P;
        double A;
        double T;
        
        Scanner sc = new Scanner (System.in);


        System.out.println("Digite a altura do terreno: ");
        x = sc.nextDouble();

        System.out.println("Digite a largura do terreno: ");
        y = sc.nextDouble();

        System.out.println("Qual o valor do metro quadrado do terreno? ");
        P = sc.nextDouble();

        A = x * y;
        T = A * P;

        Locale.setDefault (Locale.US);
        System.out.print("ÁREA: ");
        System.out.printf("%.2f%n", A);
        System.out.print("PREÇO: ");
        System.out.printf("%.2f%n", T);
        
        sc.close();
    }

}
