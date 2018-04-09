package Chapter_9;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speedNew) {
        switch (speedNew) {
            case SLOW: speed = SLOW; break;
            case MEDIUM: speed = MEDIUM; break;
            case FAST: speed = FAST; break;
            default: {
                System.out.println("Speed illegal");
                System.exit(1);
            }
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toSting() {
        if (on) {
            return speed + " " + color + " " + radius;
        } else return color + " " + radius + " fan is off";
    }
}
