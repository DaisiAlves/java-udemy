package entities;

public class Circle extends shape {

    private Double radius;

    public Circle() {
        super();
    }

    

    public Circle(enums.Color color, Double radius) {
        super(color);
        this.radius = radius;
    }



    @Override
    public double area() {
        return Math.PI * radius * radius; // Implementação do método area() para a classe Circle. Aqui você pode colocar a lógica específica para calcular a área de um círculo.
    }



    public Double getRadius() {
        return radius;
    }



    public void setRadius(Double radius) {
        this.radius = radius;
    }

    
}

