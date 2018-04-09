package Chapter_6;

import java.util.Scanner;

public class GeometryAreaOfARegularPolygon {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sids: ");
        int n = scanner.nextInt();
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();

        System.out.println("The area of the polygon is " +
        area(n, side));
    }

    /** Method return the area of a regular polygon */
    public static double area(int n, double side) {
        double areaOfAPolygon = (n * side * side) / (4 * Math.tan(Math.PI / n));

        return areaOfAPolygon;
    }
}
