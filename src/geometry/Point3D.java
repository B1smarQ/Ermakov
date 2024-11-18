package geometry;

public class Point3D extends Point2D implements Cloneable{
    int z = 0;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(Point2D point2D) {
        super(point2D);
        this.z = 0;
    }

    public Point3D(Point3D point3D){
        this(point3D.x,point3D.y,point3D.z);
    }

    @Override
    public Point3D clone() {
        try {
            return (Point3D) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
