package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 28.05.2017.
 */
public class GeometryAreaOFATriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double side1 = Math.pow((Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1),2)),0.5);
        double side2 = Math.pow((Math.pow((x3 - x2),2)) + (Math.pow((y3 - y2),2)),0.5);
        double side3 = Math.pow((Math.pow((x3 - x1),2)) + (Math.pow((y3 - y1),2)),0.5);

        double S = (side1 + side2 + side3) / 2;

        double area = Math.pow((S * ((S - side1) * (S - side2) * (S -side3))),0.5);

        System.out.println("The area of the triangle is " + area);
    }
}
