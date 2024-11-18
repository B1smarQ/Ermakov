package geometry;


import generics.ActuallyCloneable;

public class Line<T extends Point2D> implements Measurable, ActuallyCloneable<Line> {
    private final T startPoint;
    private final T endPoint;

    public Line(T startPoint, T endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }



    @Override
    public Line<T> clone() throws CloneNotSupportedException {
        try {
            return new Line<T>((T) this.startPoint.clone(), (T) this.endPoint.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Line{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }

    @Override
    public double getLength() {
        return(Math.sqrt(Math.pow((endPoint.getX()-startPoint.getX()),2)+Math.pow(endPoint.getY()-startPoint.getY(),2)));
    }
}
