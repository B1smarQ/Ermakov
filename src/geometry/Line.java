package geometry;


import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Line implements Measurable {
    private Point2D startPoint;
    private Point2D endPoint;

    public Line(@NotNull Point2D startPoint, @NotNull Point2D endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public void setStartPoint(@NotNull Point2D startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(@NotNull Point2D endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public double getLength() {
        return(Math.sqrt(Math.pow((endPoint.getX()-startPoint.getX()),2)+Math.pow(endPoint.getY()-startPoint.getY(),2)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return startPoint.equals(line.startPoint)&& endPoint.equals(line.endPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPoint, endPoint);
    }
}
