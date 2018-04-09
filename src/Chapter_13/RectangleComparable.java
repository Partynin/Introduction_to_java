package Chapter_13;


public class RectangleComparable extends GeometricObjectComparable {
    private double width;
    private double height;

    public RectangleComparable() {
    }

    public RectangleComparable(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** Return width */
    public double getWidth() {
        return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Return height */
    public double getHeight() {
        return height;
    }

    /** Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override /** Return area */
    public double getArea() {
        return width * height;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Width: " + getWidth() + " Height: " + getHeight();
    }

    @Override
    public int compareTo(GeometricObjectComparable o) {
        if (getArea() > o.getArea())
             return 1;
         else if (getArea() < o.getArea())
             return -1;
         else
         return 0;
    }
}