import java.util.Scanner;

public class Ex11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int inicio;
        int fim;
        int duracao;

        System.out.println("Qual o horário de inicio de jogo:");
        inicio = sc.nextInt();

        System.out.println("Qual o horário de fim do jogo:");
        fim = sc.nextInt();

        if (inicio < fim) {
            duracao = fim - inicio;
        }

        else {
            duracao = 24 - inicio + fim;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");

        sc.close();
    }
}
