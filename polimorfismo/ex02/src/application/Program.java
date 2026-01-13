package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
    public static void main(String[] args)  throws ParseException {
       
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();
       

        System.out.println( " Enter the number of products : ");
        int n = sc.nextInt();

        for (int i = 1; i<= n; i++){
        System.out.println("Product # " + i + "data: ");    
        System.out.println( " Common, used or imported (c/u/i)? ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the name de product: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Price: ");
        Double price = sc.nextDouble();

        if ( ch == 'i') {
            System.out.println(" Customs fee: ");
            Double customsFee = sc.nextDouble();
            list.add(new ImportedProduct(name, price, customsFee));
        }

        if (ch == 'u') { // Aspas simples aqui!
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        Date manufatureDate = sdf.parse(sc.next()); 
        list.add(new UsedProduct(name, price, manufatureDate));
        }
        else {
            list.add (new Product (name, price));
        }
}
        System.out.println();
        System.out.println("PRICE TAGS:");
            for (Product prod : list) {
            // Basta chamar o método! Ele já traz o nome, preço e detalhes formatados.
            System.out.println(prod.priceTag());
}
        sc.close();

        }

    }

