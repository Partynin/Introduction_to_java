package Chapter_13;

import java.util.Date;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        super();
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, new Date());
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
