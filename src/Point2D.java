import java.awt.*;
import java.sql.Time;

public class Point2D extends Point1D {
    int y;

    public Point2D(Color color, Time time, int x, int y) {
        super(color, time, x);
        this.y = y;
    }

    public Point2D(Color color, int x, int y) {
        super(color, x);
        this.y = y;
    }
    public Point2D(Point2D point2D){
        this(point2D.x,point2D.y);
    }
    public Point2D(Time time, int x, int y) {
        this(null,time,x,y);
    }

    public Point2D(int x, int y) {
        this(null,null,x,y);
    }
}
