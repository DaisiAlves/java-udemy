package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {
    
    public static void main(String[] args) throws ParseException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (dd/MM/yyyy): ");
        LocalDate birthDate = LocalDate.parse(sc.next() , dtf);
    
        Client client = new Client (name, email, birthDate); // Feita a leitura eu instancio um cliente 

        System.out.println("Enter order data:");
		System.out.print("Status: "); // o status é um tipo enumerado, mas o usuário vai digitar uma String
		OrderStatus status = OrderStatus.valueOf(sc.next()); //o valueOf (valor correspondente a uma String) vai converter a String para OrderStatus

        Order order = new Order(LocalDateTime.now(), status, client);

        System.out.print("How many items to this order? ");
		int N = sc.nextInt();
        for (int i=0; i<N; i++){
            System.out.println("Enter #" + (i+1) + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
