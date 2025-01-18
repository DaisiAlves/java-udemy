package entities;

public class ProductEx5 {
    
    private String nome;
    private int idade;
    private double altura;

    public ProductEx5 (String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura; 
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

   


}
