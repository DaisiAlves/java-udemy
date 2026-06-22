package entities;

public class Rectangle extends shape {


    private double width;
    private double height;

    public Rectangle() {
        super();
    }   


    public Rectangle(enums.Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }



    @Override
    public double area() {
       return width * height; // Implementação do método area() para a classe Rectangle. Aqui você pode colocar a lógica específica para calcular a área de um retângulo.
    }


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }
    
    
} // Como essa classe nao é abstrata, ela é obrigada a sobrescrever o método abstrato da superclasse shape, que é o método area(). Se não sobrescrever, vai dar erro de compilação.
