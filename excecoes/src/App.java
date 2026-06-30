import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String [] vect = sc.nextLine().split(" "); // Criei um vetor de String e peguei os valores que o usuário digitou, separando-os por espaço, se tiver o espaço ele vai colocar uma letra em cada posição do vetor.
            int position = sc.nextInt(); // Peguei a posição que o usuário quer acessar.
            System.out.println(vect[position]); // Imprimi a posição que o usuário quer acessar.

        }

        catch (ArrayIndexOutOfBoundsException e) { // Criei um catch para tratar a exceção de ArrayIndexOutOfBoundsException, esse tipo de exceção é lançada quando o usuário tenta acessar uma posição inválida do vetor.
            System.out.println("Invalid position!"); // Imprimi uma mensagem de erro caso o usuário tente acessar uma posição inválida.
        }

        System.out.println("End of program!"); // Imprimi uma mensagem de fim de programa.

        sc.close();
        

    }
}
