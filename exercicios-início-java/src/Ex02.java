import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o primeiro número: " );
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número : ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println(" A soma é: " + soma);

        sc.close();
    }
}
