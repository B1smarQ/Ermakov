package geometry;

public class Point2D {
    int x,y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point2D (Point2D point2D){
        this.x = point2D.getX();
        this.y = point2D.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("{%d %d}",x,y);
    }
}
