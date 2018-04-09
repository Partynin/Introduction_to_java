package Chapter_11;

public class GeometricObject {
    private String color;
    private boolean felled;

    public GeometricObject() {
        color = "white";
    }

    public GeometricObject(String color, boolean felled) {
        this.color = color;
        this.felled = felled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return felled;
    }

    public void setFilled(boolean felled) {
        this.felled = felled;
    }
}
