package Chapter_13;

public class TestGeometricObjectComparable {
    /** Main method */
    public static void main(String[] args) {
        GeometricObjectComparable circle1 = new CircleComparable(5);
        GeometricObjectComparable circle2 = new CircleComparable(7);
        GeometricObjectComparable maxCircle = GeometricObjectComparable.max(circle1, circle2);
        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Max circle is: " + maxCircle);

        System.out.println();

        GeometricObjectComparable rectangle1 = new RectangleComparable(3, 8);
        GeometricObjectComparable rectangle2 = new RectangleComparable(2, 4);
        GeometricObjectComparable maxRectangle = GeometricObjectComparable.max(rectangle1,
                rectangle2);
        System.out.println("Rectangle1: " + rectangle1);
        System.out.println("Rectangle2: " + rectangle2);
        System.out.println("Max rectangle is: " + maxRectangle);
    }

}
