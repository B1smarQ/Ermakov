import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    List<Point2D> points = new ArrayList<>();

    public PolyLine(Point2D... points) {
        this.points = List.of(points);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Poly line through: ");
        for(Point2D point :points){
            output.append(point);
        }
        return output.toString();

    }
}
