import java.util.Scanner;

public class While {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um valor:");

        int x = sc.nextInt();

        int soma = 0;

        while (x != 0) { // enquanto x for diferente de 0, x coninuará lendo o que for digitado
            soma += x; // utilizamos o operador de atribuição cumulativa soma = soma + x
            System.out.println("Digite um valor:");
            x = sc.nextInt();
        }

        System.out.println("Soma:" + soma);

        sc.close();
    }
}
