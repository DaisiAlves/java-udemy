package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }


    public Integer getRoomNumber() {
        return roomNumber;
    }


    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }


    public Date getCheckIn() {
        return checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }


    public long duration() { // A duraçao vai retornar um método longo, pois o que vamos usar para calcular a diferença entre as datas retorna um dado longo.
        long diff = checkOut.getTime() - checkIn.getTime(); // O método getTime retorna a data em milisegundos, então vamos subtrair a data de checkOut com a data de checkIn. 
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // O método convert vai converter a diferença de milisegundos para dias. O timeUnit.DAYS é a unidade de tempo que queremos converter, e o TimeUnit.MILLISECONDS é a unidade de tempo que estamos convertendo.

    }

    public void updateDates(Date checkIn, Date checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override //O to String é um sobreposiçao, entao precisamos do Overrise.
    public String toString() {
        return "Reservation: Room "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }

    //Não temos o SetCheckout, nem o SetCheckIn, pois não queremos que o usuário altere essas datas diretamente, mas sim através do método updateDates.
  

    

    

}
