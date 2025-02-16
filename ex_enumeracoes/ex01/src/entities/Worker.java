package entities;

import java.util.ArrayList;
import java.util.List;

import enums.WorkerLevel;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;


    private Department department;//A classe work está associada a um departamento
    private List <HourContract> contracts = new ArrayList(); // E está associada a vários contratos, que deve ser representado como ums lista

    public Worker () {

    }


    //Os construtores são gerados sem a lista, porque ela tem que ser instanciada 

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public WorkerLevel getLevel() {
        return level;
    }


    public void setLevel(WorkerLevel level) {
        this.level = level;
    }


    public Double getBaseSalary() {
        return baseSalary;
    }


    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }


    public Department getDepartment() {
        return department;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }


    public List<HourContract> getContracts() {
        return contracts;
    }

    /*public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    } EU tenho metodos para adicionar e remover contratos, mas de forma alguma eu posso deixar minha lista ser trocada, então esse método set que recebe uma lista atribuindo outra deve ser apagado.*/

    public void addContract(HourContract contract){
        contracts.add(contract);
    }//método que vai pegar a lista de contratos e adicionar o contrato que veio como argumento 

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }//Esse método remove o contrato da lista de contratos do trabalhador 

    public double income(int year, int month) {
        double sum = baseSalary;

        for (HourContract c : contracts) {
			
			int c_year = c.getDate().getYear();
			int c_month = c.getDate().getMonthValue();
			
				if (year == c_year && month == c_month) {
				sum += c.totalValue();
			    }
    
        }
        return sum;
    }
}
