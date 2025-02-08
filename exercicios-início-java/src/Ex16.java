//Inicio dos exercícios While

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();
    
        
        while ( senha != 2002) {
            System.out.println("Senha inválida");
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
