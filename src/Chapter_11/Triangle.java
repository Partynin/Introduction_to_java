package Chapter_11;

import Chapter_12.IllegalTiangleException;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTiangleException {
        this(1, 1, 1);
    }

    /** Construct a triangle with the specified sides */
    public Triangle(double side1, double side2, double side3) throws IllegalTiangleException {
        if (side1 + side2 < side3)
            throw new IllegalTiangleException(side3);
        if (side2 + side3 < side1)
            throw new IllegalTiangleException(side1);
        if (side3 + side1 < side2)
            throw new IllegalTiangleException(side2);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled)
    throws IllegalTiangleException{
        super(color, filled);
        if (side1 + side2 < side3)
            throw new IllegalTiangleException(side3);
        if (side2 + side3 < side1)
            throw new IllegalTiangleException(side1);
        if (side3 + side1 < side2)
            throw new IllegalTiangleException(side2);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double S = (side1 + side2 + side3) / 2;
        double area = Math.pow((S * ((S - side1) * (S - side2) * (S -side3))),0.5);
        return area;
    }

    @Override
    public String toString() {
        return "Triangle: side1 + " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
