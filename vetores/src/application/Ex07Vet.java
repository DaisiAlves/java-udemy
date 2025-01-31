package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex07Vet {
    
    //maior posição
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos números você vai digitar ? ");
        int n = sc.nextInt();
        int [] vect = new int [n];

        for (int i =0; i<vect.length; i++) {
            System.out.print("Digite um número: ");
            vect [i] = sc.nextInt(); 
        }
        int maior= 0;
        int position = 0;
        for (int i=0; i<vect.length; i++) {
            if (vect [i] > maior) {
                maior = vect[i];
                position = i;
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.print("Posição do maior: " + position);


        sc.close();

    }
}
