package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.println("Enter product data:b");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        product.setName("Computador");
        System.out.println("Update name " + product.getName());

        System.out.println("Product data:" + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);//isso faz a atualização da quantidade dentro do objeto product

        System.out.println("Update data:" + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Update data:" + product);

        sc.close();
    }
}
