package Chapter_11;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject() {
    }

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
        " and the radius is " + radius);
    }

    // Override the toString method defined in the superclass
    @Override
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }

    // compare whether two circles are equal based on their radius
    @Override
    public boolean equals(Object o) {
        if (o instanceof CircleFromSimpleGeometricObject)
            return radius == ((CircleFromSimpleGeometricObject)o).getRadius();
        else
            return this == o;
    }
}
