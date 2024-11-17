package legacy;

import geometry.PolyLineBasic;
import geometry.Point2D;

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

    public PolyLineBasic getSquare(){
        Point2D topRight = new Point2D(topLeftPoint.getX() +sideLength, topLeftPoint.getY());
        Point2D bottomRight = new Point2D(topRight.getX(), topRight.getY() -sideLength);
        Point2D bottomLeft = new Point2D(topLeftPoint.getX(), bottomRight.getY());

        return new PolyLineBasic(topLeftPoint,topRight,bottomRight,bottomLeft);
    }

    @Override
    public String toString() {
        return "ru.makeev.legacy.Square{" +
                "topLeftPoint=" + topLeftPoint +
                ", sideLength=" + sideLength +
                '}';
    }
}
