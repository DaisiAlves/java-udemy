package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductEx5;

public class Ex05Vet {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

       

        System.out.print("Quantas pessoas você irá digitar? ");
        int n = sc.nextInt();
        ProductEx5 [] vect = new ProductEx5 [n];

        for (int i = 0; i<vect.length; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new ProductEx5(nome, idade, altura);
        }

        double soma = 0;
        for (int i =0; i<vect.length; i++) {
            soma += vect[i].getAltura(); 
        }

        double media = soma / vect.length;
        System.out.printf("Altura média: %.2f%n" , media);

        System.out.print("Pessoas com menos de 16 anos: ");

        double porcentagem = 0.00;
        int menores = 0;
        for (int i = 0; i<vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                menores++;
            }
        }
        
        porcentagem = ((double)menores/n) * 100;

        System.out.printf("%.2f%%", porcentagem);

        for (int i = 0; i<vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.printf("%n%s" , vect[i].getNome());
            }
        }

        sc.close();

    }
}
