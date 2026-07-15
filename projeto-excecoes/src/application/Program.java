package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

    public static void main(String[] args)  {

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    try {
        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());//Uma chamada que pode gerar uma exceção, então precisamos colocar o throws ParseException no método main.
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());


        Reservation reservation = new Reservation(number, checkIn, checkOut);
        System.out.println("Reservation: " + reservation);

        System.out.println();
        System.out.println("Enter data to update thereservation:");
        System.out.print("Check-in date (dd/MM/yyyy): ");
        checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        checkOut = sdf.parse(sc.next());

        reservation.updateDates(checkIn, checkOut); //Esse metodo é chamado para atualizar as datas da reserva, passando as novas datas de check-in e check-out como argumentos.
        System.out.println("Reservation: " + reservation);
    }
    catch (ParseException e) {
        System.out.println("Invalid date format");
    }
    catch( DomainException e) { 
        System.out.println("Error in reservation: " + e.getMessage());
    }
    catch (RuntimeException e) { //RuntimeException é a classe mãe de todas as exceções que podem ser lançadas em tempo de execução, então podemos capturar qualquer exceção que seja lançada em tempo de execução.
        System.out.println("Unexpected error");
    }

    sc.close();

    }

  //SOLUÇAO BOA com uma exceçao personalizada, que é a DomainException, que é uma exceçao que criamos para tratar os erros de negocio da nossa aplicaçao.
}
