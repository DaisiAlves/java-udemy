package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();


        System.out.println("How many employees will be registred?");
        int N = sc.nextInt();

        for (int i = 0; i<N; i++) {

            System.out.println();
            System.out.println("Employee " + (i+1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary); //primeiro instancia e depois adiciona na lista

            list.add(emp); //inserindo na minha lista o objeto emp que foi instanciado acima 
        }

        System.out.println("Enter the emplyee id that will have salary increase : ");
        int idsalary = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			//list.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee e : list) {
			System.out.println(e);
		}		

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
    }
}
