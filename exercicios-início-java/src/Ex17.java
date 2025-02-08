import java.util.Scanner;

public class Ex17 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite dois pontos:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
           
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            
            System.out.println("Digite dois pontos:");
             x = sc.nextInt();
             y = sc.nextInt();
            
        }
        
        sc.close();
    }
}
