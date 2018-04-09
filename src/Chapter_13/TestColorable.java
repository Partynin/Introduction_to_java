package Chapter_13;

/**
 * Write a test program that creates an array of five GeometricObjects. For each
 object in the array, display its area and invoke its howToColor method if it is
 colorable
 */

public class TestColorable {
    /** Main method */
    public static void main(String[] args) {
        GeometricObject[] array = new GeometricObject[5];
        array[0] = new Rectangle(3,4);
        array[1] = new Circle(5);
        array[2] = new Rectangle(3, 5);
        array[3] = new ComparableCircle(7);
        array[4] = new Square(5);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Area of geometricObject " + i + " is " + array[i].getArea());
            if (array[i] instanceof Colorable) {
                Colorable sq = (Colorable) array[i];
                sq.howToColor();
            }
        }
    }
}
