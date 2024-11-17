package geometry;

import java.util.Comparator;

public class PointComparator implements Comparator<Point2D> {


    public int compare(Point2D o1, Point2D o2) {
        if(o1.getX() == o2.getX())
            return o1.getY()-o2.getY();
        return o1.getX()-o2.getX();
    }

}
