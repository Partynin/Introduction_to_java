package Chapter_8;

import java.util.Scanner;

public class GeometryInterestingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = new double[4][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }
        if (getIntersectingPoint(points) == null)
            System.out.println("The two lines are parallel");
        else {
            double[] solve = getIntersectingPoint(points);
            System.out.println("x is " + solve[0] + " and y is " + solve[1]);
        }
    }

    /** Returns the intersecting point pf two lines */
    public static double[] getIntersectingPoint(double[][] points) {
        double[] solve = new double[2];

        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];

        double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        if (a * d - b * c == 0){
            return null;
        }
        else {
            solve[0] = (e * d - b * f) / (a * d - b * c);
            solve[1] = (a * f - e * c) / (a * d - b * c);

        }

        return solve;
    }
}
