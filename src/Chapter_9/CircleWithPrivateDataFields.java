package Chapter_9;

public class CircleWithPrivateDataFields {
    /** The radius of the circle */
    private double radius;

    /** The number of objects created */
    static int numberOfObjects = 0;

    /** Construct a circle with radius 1 */
    CircleWithPrivateDataFields() {
        radius = 1;
        numberOfObjects++;
    }

    /** Construct a circle with a specified radius */
    CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /** Return numberOfObjects */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }
}
