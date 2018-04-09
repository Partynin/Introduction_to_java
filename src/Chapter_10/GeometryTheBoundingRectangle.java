package Chapter_10;

import java.util.Scanner;

public class GeometryTheBoundingRectangle {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter five points: ");
        double[][] points = new double[5][2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        MyRectangle2D rectangle2D = getRectangle(points);

        System.out.println("The bounding rectangle's center (" + rectangle2D.getX() + ", " +
        rectangle2D.getY() + "), width " + rectangle2D.getWidth() + ", height " +
        rectangle2D.getHeight());
    }

    /** Returns a bounding rectangle for a set of points in a two-dimensional plane */
    public static MyRectangle2D getRectangle(double[][] points) {
        // Find max and min coordinates for points
        double minX = points[0][0];
        double maxX = points[0][0];
        double minY = points[0][1];
        double maxY = points[0][1];

        for (int i = 0; i < 5; i++) {
            if (minX > points[i][0])
                minX = points[i][0];
            if (maxX < points[i][0])
                maxX = points[i][0];
            if (minY > points[i][1])
                minY = points[i][1];
            if (maxY < points[i][1])
                maxY = points[i][1];
        }

        MyRectangle2D myRectangle2D = new MyRectangle2D();
        // Find width and height of the rectangle
        myRectangle2D.setWidth(maxX - minX);
        myRectangle2D.setHeight(maxY - minY);
        // Find coordinates the center of rectangle
        myRectangle2D.setX(myRectangle2D.getWidth() / 2 + minX);
        myRectangle2D.setY(myRectangle2D.getHeight() / 2 + minY);

        return myRectangle2D;
    }
}
