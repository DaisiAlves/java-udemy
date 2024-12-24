package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Product product = new Product();
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Gross salary: ");
        product.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        product.tax = sc.nextDouble();



        System.out.println("Employee: " + product);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        product.increaseSalary(percentage);

        System.out.println("Update data: " + product) ;

        sc.close();

    }

}
