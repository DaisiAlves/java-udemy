package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {

        if (!checkOut.after(checkIn)) { 
           throw new DomainException("Check-out date must be after check-in date");
        } //tratar a exceçao no comecinho do método, é uma boa ptrática, pois evita que o objeto seja criado com dados inválidos.
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


    public long duration() { 
        long diff = checkOut.getTime() - checkIn.getTime(); 
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); 

    }

    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date(); 
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates for update must be future dates");
        } 
        if (!checkOut.after(checkIn)) { 
           throw new DomainException("Check-out date must be after check-in date");
        } 
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
