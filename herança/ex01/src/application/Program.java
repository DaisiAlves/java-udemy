package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {
        

    Account acc = new Account(1001, "Alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 500.0, 0.0);

    //UPCASTING

    Account acc1 = bacc;
    //Uma Business account também é uma conta, então eu também consigo atribuir um objeto 
    Account acc2 = new BusinessAccount(1003, "Bob", 0.00, 200.00);
    Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.1);

    //DOWNCASTING
    //Converter da subclasse para superclasse
    BusinessAccount acc4 = (BusinessAccount) acc2; //Não posso converter de account para BusinessAccount, preciso avisar o compilador que vou converter de Account para Businnes acount, fazer um casting manual colocando entre parenteses o tipo da subclasse
    acc4.loan(100.00); //operação de empréstimo que está na Businnes Account
    
    //BusinessAccount acc5 = (BusinessAccount) acc3;
    
    //A acc3 foi instanciada por uma SavingsAccount, então ela não é BusinessAccount, então quando executarmos o compilador vai identificar um erro
    //Para evitar esse tipo de erro temos que testar primeiro se o objeto é do tipo BusinessAccount, para isso usamos o instanceof:

    if(acc3 instanceof BusinessAccount) {
        BusinessAccount acc5 = (BusinessAccount) acc3;
        acc5.loan(200.00);
        System.out.println("Loan!");
    }

    if(acc3 instanceof SavingsAccount) {
        SavingsAccount acc5 = (SavingsAccount)acc3;
        acc5.updateBalance();
        System.out.println("Update!");
    }


    }
}
