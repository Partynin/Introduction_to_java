package Chapter_13;


import java.util.Scanner;

public class TestTriangleClass {
    /** Main method */
    public static void main(String[] args) {
        System.out.print("Enter three sides of a triangle: ");
        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        System.out.print("The triangle is filled? Enter 1 - yes or 0 - not: ");
        int fill = scanner.nextInt();
        boolean filled = false;
        if (fill == 1)
            filled = true;

        System.out.print("Enter a color for the triangle: ");
        Scanner scanner1 = new Scanner(System.in);
        String color = scanner1.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println("The area of the triangle is: " + triangle.getArea());
        System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter());
        System.out.println("Color is " + triangle.getColor());
        System.out.println("Triangle filled is " + triangle.isFilled());
    }
}
