package entities;

import enums.Color;

public abstract class shape {
    private Color color;

    public shape(){

    }

    public shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area(); //classe abstrata, porque ela tem esse método abstrato, que não tem implementação. As subclasses devem implementar esse método.
}
