package entities;

public class Dados {
    
    private int conta;
    private String name;
    private double saldo;

    public Dados(){

    }

    public Dados(int conta, String name) {
        this.conta = conta;
        this.name = name;
    }
    
    public Dados(int conta, String name, double depositoInicial) {
        this.conta = conta;
        this.name = name;
        addSaldo(depositoInicial); //foi chamda a operação depósito para caso ocorra alguma alteração no depósito, eu nao precise mudar meu construtor
    }

    public int getConta() {
        return this.conta;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double saldoTotal(double saldo) {
        return this.saldo = saldo;
    }

    public void addSaldo (double montante) {
        saldo += montante;
    }

    public void subtraiSaldo (double montante) {
        saldo -= montante + 5.00;
    }

    public String toString() {
        return "Conta: "
        + conta
        +", usuário: "
        + name
        + ", saldo total: $ "
        + String.format("%.2f", saldo); 
    }

}
