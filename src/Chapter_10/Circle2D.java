package Chapter_10;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D(double x, double y, double radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle2D() {
        this(0, 0, 1);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));

        if (distance <= radius)
            return true;
        else return false;
    }

    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
        if (distance <= Math.abs(radius - circle.getRadius()))
            return true;
        else return false;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public boolean opverlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
        if (distance <= radius + circle.getRadius())
            return true;
        else return false;
    }
}
