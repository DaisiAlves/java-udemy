package entities;

public class Students {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;


    public double sumGrades() {
        return grade1 + grade2 + grade3;
    }

    public double subtractGrades() {
        return 60.0 - sumGrades();
    }

    public String compareGrades() {

        if (sumGrades() > 60) {
          return ("FINAL GRADE: " + sumGrades() + "\nPASS");
        } 
        else {
            return ("FINAL GRADE: " + sumGrades() + "\nFAILED\nMISSING: " + subtractGrades());
        
        }
        
    }
}
