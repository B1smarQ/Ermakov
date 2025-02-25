package geometry;

import generics.ActuallyCloneable;

import java.util.Objects;

public class Point2D implements Comparable<Point2D>, Cloneable {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D point2D) {
        this.x = point2D.getX();
        this.y = point2D.getY();
    }

    public  int getX() {
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
    public Point2D clone() {
        try {
            return (Point2D) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public double getLength(Point2D point2D) {
        return Math.sqrt(Math.pow(point2D.x - x, 2) + Math.pow(point2D.y - y, 2));
    }

    @Override
    public String toString() {
        return String.format("{%d %d}", x, y);
    }

    @Override
    public int compareTo(Point2D o) {
        if (o.getX() == this.getX())
            return this.getY() - o.getY();
        return this.getX() - o.getX();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point2D = (Point2D) o;
        return x == point2D.x && y == point2D.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
