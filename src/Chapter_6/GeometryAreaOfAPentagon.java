package Chapter_6;

import java.util.Scanner;

public class GeometryAreaOfAPentagon {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();

        System.out.println("The area of the pentagon is " +
        area(side));
    }

    /** Method returns area of pentagon */
    public static double area(double side) {
        double areaOfAPentagon = (5 * side * side) / (4 * Math.tan(Math.PI / 5));

        return areaOfAPentagon;
    }
}
