package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 17.06.2017.
 */
public class GeometryPointsInTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);

        System.out.println("The point " + (x > intersectx || y > intersecty ? "is not" : "is") + " in the triangle." );
    }
}
