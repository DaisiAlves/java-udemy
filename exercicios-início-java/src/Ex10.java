import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int A;
        int B;

        System.out.println("Digite dois números:");
        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos");
            //Utilizamos o ou para o caso dos números serem escritos em ordem decrescente. 
        }
        else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
        
    }
}
