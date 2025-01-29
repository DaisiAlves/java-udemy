package application;

import java.util.Locale;
import java.util.Scanner;

//Abaixo da média
public class Ex09Vet {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos elementos o vetor vai ter? ");
        int n = sc.nextInt();
        double vect[] = new double [n];

        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite um número: ");
            vect [i] = sc.nextDouble();
        }

        double soma =0;
        for (int i=0; i< n; i++) {
            soma += vect[i];
        }
        
        double media = soma/n; 

        System.out.printf("Media do vetor: %.3f", media);

        System.out.println("\nElementos abaixo da média: ");
        for (int i=0; i<vect.length; i++) {
            if (vect[i] < media) {
                System.out.println(vect[i]);
            }
        }
        
        sc.close();
    }
}
