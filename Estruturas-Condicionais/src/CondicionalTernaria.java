import java.util.Locale;
import java.util.Scanner;

public class CondicionalTernaria {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);


        System.out.println("Digite o preço: ");
        double preco = sc.nextDouble();

        // if (preco < 20.0) {
        //     desconto = preco * 0.1;
        // }
        // else {
        //     desconto = preco *0.05;
        // }

        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.printf("Desconto: R$ %.2f%n", desconto );

        sc.close();
    }
}
