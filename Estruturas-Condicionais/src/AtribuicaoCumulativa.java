import java.util.Scanner;

public class AtribuicaoCumulativa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int minutos;
        double conta = 50.0;
         
        System.out.println("Quantos minutos foram utilizados?");
        minutos = sc.nextInt();

        if (minutos > 100) {
            conta += (minutos -100) * 2.0;
        }// Esse +-, diz respeito a conta recebe conta + alguma coisa: conta = conta + (minutos - 100) * 2.0

        System.out.printf("Valor da conta : R$ %.2f%n", conta);

        sc.close();
    }
}
