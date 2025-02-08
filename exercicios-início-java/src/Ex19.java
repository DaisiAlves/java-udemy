import java.util.Scanner;
//Inicio dos exercícios de FOR
public class Ex19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite um valor para x:");
        int x = sc.nextInt();

        for (int i = 1; i < x; i++) {
            
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
