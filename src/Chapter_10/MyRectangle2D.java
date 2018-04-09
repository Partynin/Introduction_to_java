package Chapter_10;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1,1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return width * 2 + height * 2;
    }

    /** Returns true if the specified point (x, y) is inside this rectangle */
    public boolean contains(double x, double y) {
        // Coordinats are left top vertex the rectangle
        double x1 = this.x - width / 2;
        double y1 = this.y + height / 2;

        // Coordinats are the right low vertex the rectangle
        double x2 = this.x + width / 2;
        double y2 = this.y - height / 2;

        // Check point is inside this rectangle
        if (x1 < x && x < x2 && y1 < y && y < y2)
            return true;
        else return false;
    }

    /** returns true if the specified rectangle is inside this rectangle */
    public boolean contains(MyRectangle2D r) {
        double r1x = x;
        double r1y = y;
        double r1Width = width;
        double r1Height = height;

        double r2x = r.getX();
        double r2y = r.getY();
        double r2Width = r.getWidth();
        double r2Height = r.getHeight();

        // Determine whether the second rectangle is inside the first
        if	((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Height / 2 <= r1Height / 2) &&
                (Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Width / 2 <= r1Width / 2) &&
                (r1Height / 2 + r2Height / 2 <= r1Height) &&
                (r1Width / 2 + r2Width / 2 <= r1Width))
            return true;
        else if ((r1x + r1Width / 2 > r2x - r2Width) ||
                (r1y + r1Height / 2 > r2y - r2Height))
            return false;
        else
            return false;
    }

    /** returns true if the specified rectangle overlaps with this rectangle */
    public boolean overlaps(MyRectangle2D r) {
        double r1x = x;
        double r1y = y;
        double r1Width = width;
        double r1Height = height;

        double r2x = r.getX();
        double r2y = r.getY();
        double r2Width = r.getWidth();
        double r2Height = r.getHeight();

        // Determine whether the second rectangle is inside the first
        if	((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Height / 2 <= r1Height / 2) &&
                (Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Width / 2 <= r1Width / 2) &&
                (r1Height / 2 + r2Height / 2 <= r1Height) &&
                (r1Width / 2 + r2Width / 2 <= r1Width))
            return false;
        else if ((r1x + r1Width / 2 > r2x - r2Width) ||
                (r1y + r1Height / 2 > r2y - r2Height))
            return true;
        else
            return false;
    }
}
