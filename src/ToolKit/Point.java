package ToolKit;

public class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (x > o.getX())
            return 1;
        else if (x < o.getX())
            return -1;
        else if (y > o.getY())
            return 1;
        else if (y < o.getY())
            return -1;
        else return 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + "; y = " + y;
    }
}
