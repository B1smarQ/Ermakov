package Inheritance;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolyLine implements Measurable {
    List<Point2D> points = new ArrayList<>();


    public PolyLine(List<Point2D> points) {
        this.points.addAll(points);
    }

    public PolyLine(Point2D... points) {
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
}
