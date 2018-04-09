package Chapter_13;

public class SumTheAreaOfGeometricObjects {
    /** Main method */
    public static void main(String[] args) {
        GeometricObject[] array = new GeometricObject[4];
        array[0] = new Circle(3);
        array[1] = new Circle(4);
        array[2] = new Rectangle(4, 2);
        array[3] = new Rectangle(5,3);

        System.out.println("Total area is " + sumArea(array));
    }

    /** The method that sums the areas of all the geometric objects in an array. */
    public static double sumArea(GeometricObject[] a) {
        double area = 0;

        for (int i = 0; i < a.length; i++) {
            area += a[i].getArea();
        }

        return area;
    }
}
