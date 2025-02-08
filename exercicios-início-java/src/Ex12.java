import java.util.Scanner;

public class Ex12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int codigo; 
        int quant; 
        double total = 0;

        System.out.println("Digite o número do produto e a quantidade:");
        codigo = sc.nextInt();
        quant = sc.nextInt();

        if (codigo < 3 ) {
            total = 4.50 * quant;
        } 
        else if (codigo == 3) {
            total = 5 * quant;
        } 
        else if (codigo == 4) {
            total = 2 * quant;
        }
        else if (codigo == 5) {
            total = 1.50 * quant;
        }
        
        else {
            System.out.println("O código não está registrado");
        }

        System.out.printf("Total: R$ %.2f%n", total);
          
        sc.close();
    }
}
