package application;
import java.util.Locale;
import java.util.Scanner;

import entities.ProductEx2;

public class Ex02Vet {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        ProductEx2 [] vect = new ProductEx2 [n]; // por pdrão o vetor de um objeto está nulo, entao temos que instanciar um produto, porque casa quadradinho do vetor é só uma referência

        for (int i =0; i<vect.length; i++) { // nesse caso a variável n pode ser substituída por vect.length, que significa a quantidade de vetores, fica de forma mais coesa.
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductEx2(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i<vect.length; i++) {
            sum += vect[i].getPrice();

        }

        double avg = sum/vect.length;

        System.out.printf("Media dos preços = %.2f%n", avg);

        sc.close();
        
    }
}
