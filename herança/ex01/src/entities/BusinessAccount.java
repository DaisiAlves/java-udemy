package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //para que eu nao precise repetir o this dos argumentos da superclasse
        this.loanLimit = loanLimit;
    }

   

}
