package Chapter_11;

import java.util.Date;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    /** Construct a default geometric object */
    public SimpleGeometricObject() {
        dateCreated = new Date();
    }

    /** Construct a geometric object with the specified color
     * and filled value */
    public SimpleGeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     its getter method is named isFilled */
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

    /** Return a string representation of this object */
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}
