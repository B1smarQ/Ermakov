public class Square {
    private final Point2D topLeftPoint;
    private final int sideLength;

    public Square(Point2D topLeftPoint, int sideLength) {
        if(sideLength<=0) throw new IllegalArgumentException("Side must be larger than 0");
        this.topLeftPoint = topLeftPoint;
        this.sideLength = sideLength;


    }

    public PolyLine getSquare(){
        Point2D topRight = new Point2D(topLeftPoint.x+sideLength, topLeftPoint.y );
        Point2D bottomRight = new Point2D(topRight.x, topRight.y-sideLength);
        Point2D bottomLeft = new Point2D(topLeftPoint.x, bottomRight.y);

        return new PolyLine(topLeftPoint,topRight,bottomRight,bottomLeft);
    }

    @Override
    public String toString() {
        return "Square{" +
                "topLeftPoint=" + topLeftPoint +
                ", sideLength=" + sideLength +
                '}';
    }
}
