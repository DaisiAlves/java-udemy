package application;

import java.util.Locale;
import java.util.Scanner;

//Soma Vetor
public class Ex04Vet {
    
    public static void main(String[] args) {
        
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner (System.in);

            System.out.print("Quantos números você vai digitar? ");
            int n = sc.nextInt();
            double [] vect = new double [n];

           
            for (int i=0; i<vect.length; i++) {
                System.out.print("Digite um número: ");
                vect [i] = sc.nextInt();
               
            }

            double sum = 0;
            for (int i=0; i<vect.length; i++) {
                sum +=  vect[i];
            }

            double  media = sum/vect.length;

            System.out.print("VALORES: ");

            for (int i =0;i<vect.length; i++) {

                System.out.printf("%.1f " , vect[i]);

            }
          

            System.out.println("\nSoma: " + sum + " \nMédia: " + media);

            sc.close();

    }

}
