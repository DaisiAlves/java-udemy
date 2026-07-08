package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

    public static void main(String[] args) throws ParseException {

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Room number: ");
    int number = sc.nextInt();
    System.out.print("Check-in date (dd/MM/yyyy): ");
    Date checkIn = sdf.parse(sc.next());//Uma chamada que pode gerar uma exceção, então precisamos colocar o throws ParseException no método main.
    System.out.print("Check-out date (dd/MM/yyyy): ");
    Date checkOut = sdf.parse(sc.next());


    if (!checkOut.after(checkIn)) {
        System.out.println("Error in reservation: Check-out date must be after check-in date");
    } 
    else {
        Reservation reservation = new Reservation(number, checkIn, checkOut);
        System.out.println("Reservation: " + reservation);

        System.out.println();
        System.out.println("Enter data to update the reservation:");
        System.out.print("Check-in date (dd/MM/yyyy): ");
        checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        checkOut = sdf.parse(sc.next());

        Date now = new Date(); //Criamos uma nova data, que vai ser a data atual do sistema, para comparar com as datas de check-in e check-out.
        if (checkIn.before(now) || checkOut.before(now)) { //Se a data de check-in ou a data de check-out for antes da data atual, então vamos imprimir uma mensagem de erro.
            System.out.println("Error in reservation: Reservation dates for update must be future dates");
        } 
        else if (!checkOut.after(checkIn)) { //Se a data de check-out não for depois da data de check-in, então vamos imprimir uma mensagem de erro.
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } 
        else {

        reservation.updateDates(checkIn, checkOut); //Esse metodo é chamado para atualizar as datas da reserva, passando as novas datas de check-in e check-out como argumentos.

    }
        
    }



    sc.close();



    }

    //Soluçao considerada muito ruim, pois a logica esta no programa principal. 
    
}
