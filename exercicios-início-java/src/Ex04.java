import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite quatro números: ");
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int diferenca = A*B - C*D;

        System.out.println(diferenca);

        sc.close();
    }
}
