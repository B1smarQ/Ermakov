package geometry;


public class Line<T extends Point2D> implements Measurable {
    private final T startPoint;
    private final T endPoint;

    public Line(T startPoint, T endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }


    @Override
    protected Object clone()  {
        return new Line<>(this.startPoint.clone(),this.endPoint.clone());
    }

    @Override
    public double getLength() {
        return(Math.sqrt(Math.pow((endPoint.getX()-startPoint.getX()),2)+Math.pow(endPoint.getY()-startPoint.getY(),2)));
    }
}
