package geometry;

import inheritance.Stone;

public class Square extends Shape{
    private Point2D topLeft;
    private int side;

    public Square(Point2D topLeft, int side) {
        if(side<=0) throw new Stone("Side must be greater than 0");
        this.topLeft = new Point2D(topLeft);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    public PolyLine getPolyLine(){
        return new ClosedLine(
                new Point2D(topLeft.getX(),topLeft.getY()),
                new Point2D(topLeft.getX()+side, topLeft.getY()),
                new Point2D(topLeft.getX()+side, topLeft.getY()-side),
                new Point2D(topLeft.getX(), topLeft.getY()-side)
        );
    }

    @Override
    public String toString() {
        return "" + getPolyLine();
    }
}
