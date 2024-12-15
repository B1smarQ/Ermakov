package geometry;


import generics.ActuallyCloneable;
import legacy.Stone;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Line<T extends Point2D & Cloneable> implements Measurable, Cloneable {
    private T startPoint;
    private T endPoint;

    @SuppressWarnings("unchecked")
    public void setStartPoint(T startPoint) {
        this.startPoint = (T) startPoint.clone();
    }

    @SuppressWarnings("unchecked")

    public void setEndPoint(T endPoint) {
        this.endPoint = (T) endPoint.clone();
    }

    @SuppressWarnings("unchecked")
    public Line(T startPoint, T endPoint) {
        if (startPoint.getClass() != endPoint.getClass()) throw new Stone();
        this.startPoint = (T) startPoint.clone();
        this.endPoint = (T) endPoint.clone();
    }

    public static <Q extends Point2D & Cloneable> @NotNull Line<Q> of(Q point1, Q point2) {
        return new Line<Q>(point1, point2);
    }

    public static Line<Point3D> of(int x1, int y1, int z1, int x2, int y2, int z2) {
        return new Line<>(new Point3D(x1, y1, z1), new Point3D(x2, y2, z2));
    }

    @Override
    @SuppressWarnings("unchecked")
    public Line<T> clone() {
        Line<T> l = null;
        try {
            l = (Line<T>) super.clone();
            l.setEndPoint((T) endPoint.clone());
            l.setStartPoint((T) startPoint.clone());
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

    public void moveX() {
        if (startPoint.getX() > 0) {
            startPoint.setX(startPoint.x + 10);
            return;
        }
        startPoint.setX(startPoint.x - 10);
    }

    @Override
    public double getLength() {
        return startPoint.getLength(endPoint);
    }
}
