import java.awt.*;
import java.sql.Time;

public class Point3D extends Point2D{
    int z;

    public Point3D(Color color, Time time, int x, int y, int z) {
        super(color, time, x, y);
        this.z = z;
    }

    public Point3D(Color color, int x, int y, int z) {
        this(color,null,x,y,z);
    }

    public Point3D(Time time, int x, int y, int z) {
        this(null,time,x,y,z);
    }

    public Point3D(int x, int y, int z) {
        this(null,null,x,y,z);
    }
}
