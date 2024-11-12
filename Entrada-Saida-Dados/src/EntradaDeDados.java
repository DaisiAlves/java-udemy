import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x; 
        int y;
        double z;
        char k;

        //o programa vai iniciar esperando a entrada de um dado, pois foi assim que inciamos
        x = sc.next();
        System.out.println("Você digitou: " + x);

        y = sc.nextInt();
        System.out.println("Você digitou:" + y);

        z = sc.nextDouble();
        System.out.printf("Você digitou: %.2f%n", z);
        
        k = sc.next().charAt(0);
        System.out.println("Você digitou:" + k);

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);

        sc.close();
    }
}
