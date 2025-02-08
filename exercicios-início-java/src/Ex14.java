import java.util.Locale;
import java.util.Scanner;

public class Ex14 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double x;
        double y;

        System.out.println("Digite dois números:");
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0 && y ==0) {
            System.out.println("ORIGEM");
        }
        else if (x > 0 && y > 0) { 
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        sc.close();
    }    
}

