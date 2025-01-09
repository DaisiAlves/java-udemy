package entities;

public class Product {

    public String name;
    public double price;
    public int quantity; 

    public Product() {
        // construtor padrão, por hábito é bom utilizar para que nao dê nenhum problema na instanciação.
    }

    public Product(String name, double price, int quantity) { // Isso é um construtor, pode ser parecido com um método, mas ele não tem um retorno e sua regra é ser executado no momento da instanciação do objeto. No caso desse construtor ele vai nos obrigar a fornecer um nome, preço e quantidade. 
        this.name = name; // a palavra this significa referência para o próprio objeto
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) { // Sobrecarga: Posso usar o mesmo contrutor com parâmetros diferentes
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts (int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts (int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
        +", $ " 
        + String.format("%.2f", price)
        +", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock()); 
    }
}
