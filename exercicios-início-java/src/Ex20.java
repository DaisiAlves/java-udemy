import java.util.Scanner;

public class Ex20 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();
        int soma = 0;
        int soma2 = 0;

        for (int i = 0; i < N; i++) {
          int x = sc.nextInt();
                        
            if (x >= 10 && x <= 20) {
                soma += 1;
            }
            else {
                soma2 += 1; 
            }
        }

        System.out.println(soma + " in");
        System.out.println(soma2 + " out");
        sc.close();
    }
}
