package Chapter_8;

import java.util.Scanner;

public class CentralCity {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfPoints = scanner.nextInt();

        // Create an array to store points
        double[][] points = new double[numberOfPoints][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = scanner.nextDouble();
            points[i][1] = scanner.nextDouble();
        }

        // p1 and p2 are the indices in the points' array
        int p1 = 0, p2 = 1; // Initial two points
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1]); // Initialize shortestDistance

        // Compute distance for every two points
        double shortDis = 0;
        double distance;
        int centralCity = 0;

        for (int j = 1; j < points.length; j++)
            shortDis = shortDis + distance(points[0][0], points[0][1],
                    points[j][0], points[j][1]);

        for (int i = 0; i < points.length; i++) {
            distance = 0;
            for (int j = i + 1; j < points.length; j++) {
                distance = distance + distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]); // Find distance
            }

            if (distance < shortDis) {
                shortDis = distance;
                centralCity = i;
            }
        }

        System.out.println("The central city is at (" + points[centralCity][0] +
        ", " + points[centralCity][1] + ")");

    }

    /** Compute the distance between two points (x1, y2) and (x2, y2) */
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}