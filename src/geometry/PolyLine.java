package geometry;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PolyLine implements Measurable {
    List<Point2D> points = new ArrayList<>();


    public PolyLine(@NotNull List<Point2D> points) {
        this.points.addAll(points);
    }

    public PolyLine(@NotNull Point2D... points) {
        this(Arrays.asList(points));
    }

    public PolyLine() {
    }

    public void addPoint(Point2D... point2D){
        addPoint(Arrays.asList(point2D));
    }

    public List<Point2D> getPolyLine(){
        return new ArrayList<>(points);
    }

    public void addPoint(List<Point2D> points){
        this.points.addAll(points);
    }

    @Override
    public double getLength() {
        double res = 0;
        for (int i = 0; i < points.size()-1; i++) res += new Line(points.get(i), points.get(i + 1)).getLength();
        return res;

    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PolyLine polyLine)) return false;
        if(this.getClass() == o.getClass())
            return Objects.equals(points,polyLine.points);
        List<Point2D> curr = new ArrayList<>(points);
        List<Point2D> other = new ArrayList<>(polyLine.points);
        if(this.getClass() == ClosedLine.class)
            curr.add(points.getFirst());
        if(polyLine.getClass() ==  ClosedLine.class)
            other.add(polyLine.points.getFirst());
        return Objects.equals(curr,other);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(points);
    }
}
