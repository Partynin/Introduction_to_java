package Chapter_13;

import java.util.Date;

/** Triangle with three constructors extends GeometricObject */

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(1, 1, 1, "white", false);
    }

    public Triangle(double side1, double side2, double side3) {
        this(side1, side2, side3, "white", false);
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled, new Date());
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

    @Override
    public double getArea() {
        double S = (side1 + side2 + side3) / 2;
        double area = Math.pow((S * ((S - side1) * (S - side2) * (S -side3))),0.5);
        return area;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "This triangle: " + super.toString();
    }
}
