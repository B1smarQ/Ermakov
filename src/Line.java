public class Line {
    Point2D point1,point2;

    public Line(Point2D point1, Point2D point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public Line(int x1,int x2, int y1, int y2){
        this.point1 = new Point2D(x1,y1);
        this.point2 = new Point2D(x2,y2);
    }

    @Override
    public String toString() {
        return String.format("Line from %s to %s", point1,point2);
    }
}
