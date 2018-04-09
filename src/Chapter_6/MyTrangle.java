package Chapter_6;

import java.util.Scanner;

public class MyTrangle {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        /**double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double side1 = Math.pow((Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1),2)),0.5);
        double side2 = Math.pow((Math.pow((x3 - x2),2)) + (Math.pow((y3 - y2),2)),0.5);
        double side3 = Math.pow((Math.pow((x3 - x1),2)) + (Math.pow((y3 - y1),2)),0.5);*/
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        if (isValid(side1, side2, side3))
        System.out.printf("The area of the triangle is %.1f", area(side1, side2, side3));
        else System.out.println("Invalid input!");
    }

    /** Return true if the sum of any two sides is
     *  greater than the third side.*/
    public static boolean isValid(double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
        return true;
        else return false;
    }

    /** Return the area of  the triangle. */
    public static double area(double side1, double side2, double side3) {
        double S = (side1 + side2 + side3) / 2;
        double area = Math.pow((S * ((S - side1) * (S - side2) * (S -side3))),0.5);

        return area;
    }
}
