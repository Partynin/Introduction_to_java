package Chapter_8;

import java.util.Scanner;

public class GeometrySameLine {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter five points: ");
        double[][] pints = new double[5][2];

        for (int i = 0; i < pints.length; i++) {
            for (int j = 0; j < pints[i].length; j++) {
                pints[i][j] = scanner.nextDouble();
            }
        }

        if (sameLine(pints))
            System.out.println("The five points are on the same line");
        else System.out.println("The five points are not the same line");
    }

    /** Return true if point (x2, y2) is on the same
     * line from (x0, y0) to (x1, y1) */
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0)
            return true;
        else
            return false;
    }

    /** Points on the same line */
    public static boolean sameLine(double[][] points) {
        boolean flag = false;

        if ((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]) == 0)
            flag = true;

        return flag;
    }
}
