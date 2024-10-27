package legacy;

public class Line {
    private Point2D point1,point2;

    public Line(Point2D point1, Point2D point2) {
        if(point1 == point2) throw new Stone();
        this.point1 = new Point2D(point1);
        this.point2 = new Point2D(point2);
    }

    public Point2D getPoint1() {
        return point1;
    }

    public void setPoint1(Point2D point1) {
        if(point1 == this.point2) throw new Stone();
        this.point1.x = point1.x;
        this.point1.y = point1.y;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint2(Point2D point2) {
        if(point2 == this.point1) throw new Stone();
        this.point2.x = point2.x;
        this.point2.y = point2.y;
    }

    public Line(int x1, int x2, int y1, int y2){
        this(new Point2D(x1,y1), new Point2D(x2,y2));
    }

    public double getLength(){
        return Math.sqrt(Math.pow((point2.x- point1.x)+(point2.y)- point1.y, 2));
    }

    @Override
    public String toString() {
        return String.format("legacy.Line from %s to %s", point1,point2);
    }
}
