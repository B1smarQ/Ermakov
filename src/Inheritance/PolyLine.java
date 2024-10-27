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


    @Override
    public double getLength() {
        double res = 0;
        for (int i = 0; i < points.size()-1; i++) res += new Line(points.get(i), points.get(i + 1)).getLength();
        return res;

    }
}
