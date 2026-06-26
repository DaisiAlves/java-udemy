package exfixacao.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;


    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    
    @Override // serve para sobrescrever a regra de um método que vem da classe mãe. 

    public Double tax() {
        if (getAnualIncome() < 20000) {
            return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
        }
        else {
            return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
    }
}
