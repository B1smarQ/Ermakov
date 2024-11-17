package legacy;

import java.awt.*;
import java.sql.Time;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point3D point3D)) return false;
        return z == point3D.z && x == point3D.x && y == point3D.y;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(z);
    }
}
