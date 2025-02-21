package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");

        LocalDate moment = LocalDate.parse("21/06/2018 13:05:44", dtf);
        Post p1 = new Post(moment, "Traveling to New Zealand", "I'm going to visit this wonderfil country!", 12);
        
        p1.addComment(c1);
        p1.addComment(c2);
    }
    
}
