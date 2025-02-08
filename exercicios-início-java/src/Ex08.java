import java.util.Scanner;
// Inicio dos execícios de estrutura condicional If
public class Ex08 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int numero; 

        System.out.println("Digite um número positivo ou negativo:");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } 
        else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();

    }
}
