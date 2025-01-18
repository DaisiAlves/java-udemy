package application;
import java.util.Locale;
import java.util.Scanner;

public class Ex01Vet {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //ler a variável n

        double [] vect = new double [n]; //[] declara que é um vetor, com nome da variável vect, e a seguir é instanciado o vetor com o seu número de elementos, que no caso será n

        for (int i = 0; i<n; i++ ) { //variavel i começando com 0, o for vai repetir enquanto i for menor do que n, e cada vez que voltar nesse laço incremendo a variável i.
            vect[i] = sc.nextDouble(); // o vect na posição do i, recebendo o que o usuário digitar

        }

        double sum= 0.0;
        for (int i=0; i<n; i++) { //para somar e calcular a média depois
            sum += vect[i];
        }

        double media = sum / n;

        System.out.printf("Média das alturas: %.2f%n", media);
 
        sc.close();
    }
}
