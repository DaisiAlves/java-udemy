package entities;

public class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    //SOBRESCREVENDO O METODO DA CLASSE ACCOUNT PARA QUE NAO SEJA DESCONTADO 5 REAIS CASO O SAQUE SEJA DA CONTA POUPANÇA 

    @Override //INDICA QUE É UMA SOPREPOSIÇÃO DE MÉTODO, assim caso você erre em alguma informação do método o compilador vai identificar após procurar o método da superclasse e ver que está errado.
    public void withdraw(double amount) {
        balance -= amount;
    }
}
