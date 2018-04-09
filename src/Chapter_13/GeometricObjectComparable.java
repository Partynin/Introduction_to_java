package Chapter_13;


import java.util.Date;

public abstract class GeometricObjectComparable implements Comparable<GeometricObjectComparable>{
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObjectComparable() {
        this.dateCreated = new Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObjectComparable(String color, boolean filled, Date dateCreated) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();

    /** finding the larger of two GeometricObject objects */
    public static GeometricObjectComparable max(GeometricObjectComparable o1,
                                                GeometricObjectComparable o2) {
        if (o1.getArea() > o2.getArea()) {
            return o1;
        } else if (o2.getArea() > o1.getArea()) {
            return o2;
        } else return o1;
    }
}
