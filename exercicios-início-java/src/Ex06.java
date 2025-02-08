import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Número do produto: ");
        int produto1 = sc.nextInt();

        System.out.println("Quantidade: ");
        int quantidade1 = sc.nextInt();

        System.out.println("Preço: ");
        double preco1 = sc.nextDouble();

        System.out.println("Número do produto: ");
        int produto2 = sc.nextInt();

        System.out.println("Quantidade: ");
        int quantidade2 = sc.nextInt();

        System.out.println("Preço: ");
        double preco2 = sc.nextDouble();

        double soma = preco1 * quantidade1 + preco2 * quantidade2;

        System.out.printf("Total a pagar pelo produto " + produto1 + " e o produto " + produto2 + " é : R$ %.2f", soma);

        sc.close();

    }
}
