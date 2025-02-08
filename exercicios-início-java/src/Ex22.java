import java.util.Scanner;

public class Ex22 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            double res = (double) x/y;
            
            if (y == 0) {
                System.out.println("divisão impossível");
            }
            else{
                System.out.println(res);
            }
        }
        
        sc.close();
    }
}

