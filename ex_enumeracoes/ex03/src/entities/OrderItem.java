package entities;


//Essa ordem contém uma composição com um produto 
public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    } //contém um produto, o nome dele tem que ser o mesmo que estiver no diagrama

    public double subTotal() {
        return price * quantity;
    } // metodo que calcula o subtotal 

    @Override
    public String toString() {
        return getProduct().getName()
        + ", $"
        + String.format("%.2f", price)
        + ", Quantity: "
        + quantity
        + ", Subtotal: $"
        + String.format("%.2f", subTotal());
        
    }
}
