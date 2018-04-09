package Chapter_13;

import java.util.Date;

public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{
    private double side;

    public Octagon() {
        super();
    }

    public Octagon(double side) {
        super();
        this.side = side;
    }

    public Octagon(double side, String color, boolean filled) {
        super(color, filled, new Date());
    }

    @Override
    public double getArea() {
        double area = (2 + (4/(Math.sqrt(2)))) * side * side;
        return area;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
