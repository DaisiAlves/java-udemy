package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Converter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Locale.setDefault(Locale.US);

        System.out.println("Whats is the dollar price?");
        double dollar = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double quantity = sc.nextDouble();

        double result = CurrencyConverter.ValueInReal(dollar, quantity);

        System.out.printf("Amount to be paid in reais = %.2f%n", result );

        sc.close();
    }
}
