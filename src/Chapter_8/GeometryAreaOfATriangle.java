package Chapter_8;

import java.util.Scanner;

public class GeometryAreaOfATriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] points = new double[3][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        if (getTriangleArea(points) == 0)
            System.out.println("The three points are on the same line");
        else
        System.out.println("The area of the triangle is " + getTriangleArea(points));
    }

    public static double getTriangleArea(double[][] points) {
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
            return 0;

        double side1 = Math.pow((Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1),2)),0.5);
        double side2 = Math.pow((Math.pow((x3 - x2),2)) + (Math.pow((y3 - y2),2)),0.5);
        double side3 = Math.pow((Math.pow((x3 - x1),2)) + (Math.pow((y3 - y1),2)),0.5);

        double S = (side1 + side2 + side3) / 2;

        double area = Math.pow((S * ((S - side1) * (S - side2) * (S -side3))),0.5);
        return area;
    }
}
