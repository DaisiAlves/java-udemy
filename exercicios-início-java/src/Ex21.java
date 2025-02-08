import java.util.Locale;
import java.util.Scanner;

public class Ex21 {
    
    public static void main(String[] args) {
        
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        double valor1;
        double valor2;
        double valor3;

        double media1 = 0;
        double media2 = 0;
        double media3= 0;

        for (int i = 0;i < N; i++) {
            valor1 = sc.nextDouble() * 2;
            valor2 = sc.nextDouble() * 3;
            valor3 = sc.nextDouble() * 5;
            
            if(i == 0){
                media1 = (valor1 + valor2 + valor3)/10;
            }
            else if (i == 1) {
                media2 = (valor1 + valor2 + valor3)/10;
            }
            else {
                media3 = (valor1 + valor2 + valor3)/10;
            }
        }

        System.out.printf ("%.1f%n", media1);
        System.out.printf ("%.1f%n", media2);
        System.out.printf ("%.1f%n", media3);
        
        sc.close();


    }
}
