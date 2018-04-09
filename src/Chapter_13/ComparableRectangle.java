package Chapter_13;


public class ComparableRectangle extends Rectangle implements Comparable<Rectangle> {
    /** Construct a ComparableRectangle with specified properties */
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

     // Implement the compareTo method defined in Comparable


    @Override // Implement toString method in GeometricObject
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }
}
