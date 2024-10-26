package Inheritance;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        if (radius<=0) throw new Stone("Radius must be greater than 0");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius;
    }
}
