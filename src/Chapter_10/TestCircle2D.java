package Chapter_10;

public class TestCircle2D {
    /** Main method */
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 2.5);
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());
        System.out.println("c1.contains(3, 3) is " + c1.contains(3, 3));
        System.out.println("c1.contains(new Circle2D(43, 5, 0.5)) is "
                + c1.contains(new Circle2D(43, 5, 10.5)));
        System.out.println("c1.overlaps(new Circle2D(33, 5, 2.3)) is "
                + c1.opverlaps(new Circle2D(33, 5, 2.3)));
    }
}
