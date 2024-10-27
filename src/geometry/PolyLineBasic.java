package geometry;

import java.util.Arrays;
import java.util.List;

public class PolyLineBasic {
    List<Point2D> points;

    public PolyLineBasic(List<Point2D> points) {
        this.points = points;
    }

    public PolyLineBasic(Point2D... points) {
        this(Arrays.asList(points));
    }

    public double getLength(){
        double res = 0;
        for (int i = 0; i < points.size()-1; i++) {
            res+= new Line(points.get(i),points.get(i+1)).getLength();
        }
        return res;
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
