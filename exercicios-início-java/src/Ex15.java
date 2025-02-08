import java.util.Locale;
import java.util.Scanner;

public class Ex15 {
    
    public static void main(String[] args) {
        


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        double salario;
        double imposto = 0;
    

        System.out.println("Digite seu salário:");
        salario = sc.nextDouble();

       

        if (salario > 0.00 && salario < 2000.00 ) {
            System.out.println("Isento");
        }
        else if (salario > 2000.01 && salario <= 3000.00) {
            imposto = (salario - 2000.00)*8/100;
            System.out.printf("R$ %.2f%n" , imposto);
        }
        else if (salario > 3000.01 && salario <= 45000.00) {
            imposto = (salario - 3000.00)*18/100 + 1000.00*8/100; 
            System.out.printf("R$ %.2f%n", imposto );
        }
        else {
           imposto = (salario - 4500.00) * 28/100 + 3500*18/100;
           System.out.printf("R$ %.2f%n" , imposto);
        }

        

        sc.close();
    }
}
