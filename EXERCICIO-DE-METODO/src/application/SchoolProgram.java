package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class SchoolProgram {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Students students = new Students();

        System.out.print("Name: ");
        students.name = sc.nextLine();
        System.out.print("Grade1: ");
        students.grade1 = sc.nextDouble();
        System.out.print("Grade 2: ");
        students.grade2 = sc.nextDouble();
        System.out.print("Grade 3: ");
        students.grade3 = sc.nextDouble();

        System.out.println(students.compareGrades());

        

        sc.close();
    }
}
