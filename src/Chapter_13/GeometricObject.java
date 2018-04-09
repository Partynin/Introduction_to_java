package Chapter_13;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        this.dateCreated = new Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled, Date dateCreated) {
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
        return "area = " + getArea();
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}
