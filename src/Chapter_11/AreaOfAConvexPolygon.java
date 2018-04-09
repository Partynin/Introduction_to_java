package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class AreaOfAConvexPolygon {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> listPoints = new ArrayList<>();
        System.out.print("Enter the number of the points: ");
        int numberOfPoints = scanner.nextInt() + 1;
        System.out.print("Enter the coordinates of the points: ");
        for (int i = 0; i < numberOfPoints; i++) {
            listPoints.add(scanner.nextDouble());
            listPoints.add(scanner.nextDouble());
        }

        System.out.println("The total area is " + getArea(listPoints));
    }

    /** Get area of convex polygon
     * http://www.mathwords.com/a/area_convex_polygon.htm*/
    public static double getArea(ArrayList<Double> listPoints) {
        double areaSum1 = 0;
        double areaSum2 = 0;
        for (int i = 0; i < listPoints.size() - 3; i = i + 2) {
           areaSum1 = areaSum1 + listPoints.get(i) * listPoints.get(i + 3);
        }

        for (int i = 1; i < listPoints.size() - 1; i = i + 2) {
            areaSum2 = areaSum2 + listPoints.get(i) * listPoints.get(i + 1);
        }

        return 0.5 * (Math.abs(areaSum1 - areaSum2));
    }
}
