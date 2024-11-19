package geometry;


import generics.ActuallyCloneable;

public final class Line<T extends Point2D> implements Measurable, Cloneable {
    private T startPoint;
    private T endPoint;

    public void setStartPoint(T startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(T endPoint) {
        this.endPoint = endPoint;
    }

    public Line(T startPoint, T endPoint) {
        this.startPoint = (T) startPoint.clone();
        this.endPoint = (T) endPoint.clone();
    }

    @Override
    public Line<T> clone()  {
        Line<T> l = null;
        try {
            l = (Line<T>) super.clone();
            l.setEndPoint((T)endPoint.clone());
            l.setStartPoint((T)startPoint.clone());
            return l;
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
