public class Point2D {
    int x,y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format(" {%d;%d} ",x,y);
    }
}