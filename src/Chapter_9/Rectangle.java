package Chapter_9;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(1.0, 1.0);
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimetr() {
        return width * 2 + height * 2;
    }
}
