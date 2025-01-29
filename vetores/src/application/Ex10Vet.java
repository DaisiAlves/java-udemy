package application;

import java.util.Scanner;

import entities.ProductEx10;

public class Ex10Vet {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
    
        ProductEx10[] room = new ProductEx10[10];

        System.out.print("Quantos quartos você vai alugar ?");
        int quant = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<quant; i++) {
            System.out.println("Aluguel #" + (i+1) + ":");
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto:");
            sc.nextLine();
            int quarto = sc.nextInt();
            sc.nextLine();

            room [quarto] = new ProductEx10(name, email);// O objeto está sendo instanciado na posição informada 

        }

        System.out.println("Quartos ocupados: ");

        for (int i=0; i<10; i++){
            if (room [i] != null){
                System.out.println(i + ": " + room[i].getName() + " , " + room[i].getEmail());
            }
        }



        sc.close();


    }
}
