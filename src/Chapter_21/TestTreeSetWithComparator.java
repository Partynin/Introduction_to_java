package Chapter_21;

import Chapter_13.Circle;
import Chapter_13.GeometricObject;
import Chapter_13.Rectangle;

import java.util.HashSet;
import java.util.Set;

public class TestTreeSetWithComparator {
    public static void main(String[] args) {
        // Create a tree set for geometric objects using a comparator
        //Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
        Set<GeometricObject> set = new HashSet<>();
        set.add(new Rectangle(4, 5));
        set.add(new Circle(40));
        set.add(new Circle(40));
        set.add(new Rectangle(4, 1));

        // Display geometric objects in the tree set
        System.out.println("A sorted set of geometric objects");
        for (GeometricObject element: set)
            System.out.println("area = " + element.getArea());
    }
}
