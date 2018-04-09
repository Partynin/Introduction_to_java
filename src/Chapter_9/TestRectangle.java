package Chapter_9;

public class TestRectangle {
    /** Main method */
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        printRectangle(rectangle1);
        printRectangle(rectangle2);
    }

    /** Display the width, height, area, and perimeter of each rectangle in this order. */
    public static void printRectangle(Rectangle rectangle) {
        System.out.println("Width = " + rectangle.width + "\nheight = " +
                rectangle.height + "\narea = " + rectangle.getArea()
        + "\nperimeter = " + rectangle.getPerimetr());
        System.out.println();
    }
}
