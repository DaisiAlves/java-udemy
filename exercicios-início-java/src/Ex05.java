import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Número do Funcionário:" );
        int numFunc = sc.nextInt();

        System.out.println("Horas Trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();
        
        System.out.println("Valor da hora: ");
        double valorHora = sc.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("Funcionário: " + numFunc);
        System.out.printf("Ele vai receber: $%.2f", salario );

        sc.close();
        
    }

}
