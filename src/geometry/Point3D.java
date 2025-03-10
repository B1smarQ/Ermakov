package geometry;

import generics.ActuallyCloneable;

public class Point3D extends Point2D  {
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

    public double getLength(Point3D point3D) {
        return Math.sqrt(Math.pow(point3D.x-x,2) + Math.pow(point3D.y - y, 2) + Math.pow(point3D.z - z,2));
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public Point3D clone() {
        return new Point3D(this);
    }
}
