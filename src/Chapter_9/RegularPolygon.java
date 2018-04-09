package Chapter_9;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    RegularPolygon(int n, double side) {
        this(n, side, 0, 0);
    }

    RegularPolygon() {
        this(3, 1, 0,0);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimetr() {
        double perimeter = side * n;

        return perimeter;
    }

    public double getArea() {
        double areaOfAPolygon = (n * side * side) / (4 * Math.tan(Math.PI / n));

        return areaOfAPolygon;
    }
}
