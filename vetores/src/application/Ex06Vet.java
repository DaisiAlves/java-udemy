package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex06Vet {


    //Números pares 
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos números você vai digitar ?");
        int n = sc.nextInt();
        int [] vect = new int[n];

        for (int i =0; i<vect.length; i++) {
            System.out.print("Digite um número:");
            vect [i] = sc.nextInt();
        }

        System.out.println("\nNúmeros pares: ");
        for (int i=0; i<vect.length; i++) {
            if (vect [i] % 2 == 0) {
                System.out.print(vect[i] + " ");
            }
        }

        int count = 0;
        for (int i =0; i<vect.length; i++){
            if (vect [i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("\nQuantidade de pares: " + count);
        
        sc.close();
    }
}
