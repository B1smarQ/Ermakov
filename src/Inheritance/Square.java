package Inheritance;

import java.awt.geom.Point2D;

public class Square extends Shape{
    private Point2D topLeft;
    private double side;

    public Square(Point2D topLeft, double side) {
        if(side<=0) throw new Stone("Side must be greater than 0");
        this.topLeft = topLeft;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
