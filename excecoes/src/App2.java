import java.util.InputMismatchException;
import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        method1();
    }

    

    public static void method1(){
        System.out.println("***METHOD 1 START***");
        method2();
        System.out.println("***METHOD 1 END***");
    }
    
    
    public static void method2() {

        System.out.println("***METHOD 2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String [] vect = sc.nextLine().split(" "); // Criei um vetor de String e peguei os valores que o usuário digitou, separando-os por espaço, se tiver o espaço ele vai colocar uma letra em cada posição do vetor.
            int position = sc.nextInt(); // Peguei a posição que o usuário quer acessar.
            System.out.println(vect[position]); // Imprimi a posição que o usuário quer acessar.

        }

        catch (ArrayIndexOutOfBoundsException e) { // Criei um catch para tratar a exceção de ArrayIndexOutOfBoundsException, esse tipo de exceção é lançada quando o usuário tenta acessar uma posição inválida do vetor.
            System.out.println("Invalid position!"); // Imprimi uma mensagem de erro caso o usuário tente acessar uma posição inválida.
            e.printStackTrace(); // Imprimi o rastreamento da pilha de exceções, isso é útil para depuração, pois mostra onde a exceção ocorreu no código. Vai mostrar a pilha de chamadas de métodos que levaram à exceção, incluindo o nome do arquivo e o número da linha onde a exceção foi lançada, antes de encerrar o programa.
        }

        catch(InputMismatchException e) { //Essa outra exceção é lançada quando o usuário digita um valor que não é um número inteiro, por exemplo, se ele digitar uma letra ou um número decimal.
        System.out.println("Input error");
        e.printStackTrace();
        }

        System.out.println("End of program!"); // Imprimi uma mensagem de fim de programa.

        sc.close();
    }
    
}
