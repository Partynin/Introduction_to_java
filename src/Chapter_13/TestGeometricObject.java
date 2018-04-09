package Chapter_13;

public class TestGeometricObject {
    /** Main method */
    public static void main(String[] args) {
        // Create two geometric object
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);

        System.out.println("The two object have the same area? " +
                equalArea(geoObject1, geoObject2));

        // Display circle
        displayGeometricObject(geoObject1);

        // Display rectangle
        displayGeometricObject(geoObject2);
    }

    /** A method for comparing the areas of two geometric objects
     * Note that you could not define the equalArea method for comparing whether two geometric
     objects have the same area if the getArea method were not defined in GeometricObject*/
    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    /** A method for displaying a geometric object */
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
