package entities;

public class Product {

    private String name;
    private double price;
    private int quantity; 

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

    public String getName() { //Encapsulamento: No encapsulamento nós mudamos as variáveis para privado, para evitar que sejam feitas alterações indevidas. Então para que eu consiga acessar a váriavel e retorna-la eu preciso usar o get. E para que eu consiga alterar a variável eu preciso usar o set. 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity(){ // Como a quantidade só pode ser alterada através da regra de negócio que é a retirada ou inserção de produto no estoque, entao eu nao vou deixar o acesso livre pelo set para alteração. Somente o get para retornar a quantidade. 
        return quantity;
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
