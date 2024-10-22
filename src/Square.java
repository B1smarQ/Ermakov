public class Square {
    private Point2D topLeftPoint;
    private int sideLength;

    public Square(Point2D topLeftPoint, int sideLength) {
        checkValidity(sideLength);
        this.topLeftPoint = topLeftPoint;
        this.sideLength = sideLength;
    }

    public void setTopLeftPoint(Point2D topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public Square (int x, int y, int sideLength){
        this(new Point2D(x,y),sideLength);
    }
    private void checkValidity(int len){
        if(len<=0) throw new Stone("Side must be larger than 0");
    }

    public void setSideLength(int sideLength) {
        checkValidity(sideLength);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
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
