package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

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
    catch( IllegalArgumentException e) { //Essa exceçao já é pronta do JAVA, então não precisamos criar uma classe para ela. Ela é lançada quando o argumento passado para um método é inválido.
        System.out.println("Error in reservation: " + e.getMessage());
    }

    sc.close();

    }

  //SOLUÇAO BOA, COM EXCEÇAO PRONTA DO JAVA, MAS NAO É A MELHOR SOLUÇAO, POIS O USUARIO NAO CONSEGUE ENTENDER O ERRO. ENTÃO VAMOS CRIAR UMA EXCEÇAO PERSONALIZADA, PARA QUE O USUARIO CONSIGA ENTENDER O ERRO.
    
}
