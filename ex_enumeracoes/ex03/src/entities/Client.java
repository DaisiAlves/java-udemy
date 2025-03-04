package entities;

import java.time.LocalDate;

public class Client {

    private String name;
    private String email;
    private LocalDate Date;


    
    public Client() {
    }



    public Client(String name, String email, LocalDate date) {
        this.name = name;
        this.email = email;
        Date = date;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public LocalDate getDate() {
        return Date;
    }



    public void setDate(LocalDate date) {
        Date = date;
    }

}
