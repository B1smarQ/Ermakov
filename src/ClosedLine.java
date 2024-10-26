import java.util.List;

public class ClosedLine extends PolyLineBasic {
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
