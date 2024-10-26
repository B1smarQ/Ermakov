package Inheritance;


public class Line implements Measurable{
    private final Point2D startPoint;
    private final Point2D endPoint;

    public Line(Point2D startPoint, Point2D endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public double getLength() {
        return(Math.sqrt(Math.pow((endPoint.getX()-startPoint.getX()),2)+Math.pow(endPoint.getY()-startPoint.getY(),2)));
    }
}
