package application;

import java.util.Locale;
import java.util.Scanner;

//soma_vetores
public class Ex08Vet {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos valores vai ter cada vetor ? ");
        int n = sc.nextInt();
        int [] vectA = new int [n];
        int [] vectB = new int [n];
        

        System.out.println("Digite os valores do vetor A :");
        for (int i=0; i<n; i++) {
            vectA[i] = sc.nextInt();
        } 
        
        System.out.println("Digite os valores do vetor B :");
        for (int i=0; i<n; i++) {
            vectB[i] = sc.nextInt();
        } 

        System.out.println("Vetor resultante: ");
        int [] vectC = new int [n];
        for (int i=0; i<n; i++) {
            vectC [i] = vectA[i] + vectB [i];
            System.out.println(vectC[i]);
        }

        sc.close();
    }
}
