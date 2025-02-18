//Exercíco 1 de enumerações

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;


public class Program {
    public static void main(String[] args) throws ParseException {


      Locale.setDefault(Locale.US);  
      Scanner sc = new Scanner (System.in);
      DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      System.out.println("Enter department's name: ");
      String departmentName = sc.nextLine();
      System.out.println("Enter worker data:");
      System.out.println("Name: ");
      String workerName = sc.nextLine();
      System.out.println("Level: ");
      String workerLevel = sc.nextLine();
      System.out.println("Base salary: ");
      double baseSalary = sc.nextDouble();
      Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName) );


      System.out.println("How many contracts to this worker? ");
      int n = sc.nextInt();

      for (int i =1; i<=n; i++){
        System.out.println("Enter contract #" + i + "data: ");
        System.out.print("Date (DD/MM/YYYY): ");
        LocalDate contractDate = LocalDate.parse(sc.next(),fmt); 
        System.out.print("Value per hour: ");
        double valuePerHour = sc.nextDouble();
        System.out.print("Duration (hours): ");
        int hours = sc.nextInt();
        HourContract contract = new HourContract(contractDate, valuePerHour, hours);
        worker.addContract(contract); //Isso faz com que meu contrato seja associado a um trabalhador 
      }
      
      System.out.println();
      System.out.print("Enter month and year to calculate income (MM/YYYY): ");
      String monthAndYear = sc.next();
      int month = Integer.parseInt(monthAndYear.substring(0,2));//Recorta a string e gera a substring com dos dígitos, que sao transformados em inteiro 
      int year = Integer.parseInt(monthAndYear.substring(3));
      System.out.println("Name: " + worker.getName());
      System.out.println("Department: " + worker.getDepartment().getName());
      System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
    }
}
