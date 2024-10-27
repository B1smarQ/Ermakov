package Inheritance;

import java.util.List;

public class ClosedLine extends PolyLine {
    public ClosedLine(List<Point2D> points) {
        super(points);
    }

    public ClosedLine(Point2D... points) {
        super(points);
    }

    @Override
    public double getLength() {
        return super.getLength()+
                new Line(points.getFirst(),points.getLast())
                .getLength();
    }
}
