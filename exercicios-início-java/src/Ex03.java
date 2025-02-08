import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("%.4f%n", area);

        sc.close();

    }
}
