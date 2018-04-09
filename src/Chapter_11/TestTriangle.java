package Chapter_11;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter three side of the triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.print("Enter a color of the triangle: ");
        String color = scanner1.nextLine();

        System.out.print("Enter the triangle is filled Y or N: ");
        String yesOrNo = scanner1.nextLine();
        boolean filled = false;
        if (yesOrNo.equals("Y"))
            filled = true;

        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("Area of the triangle: " + triangle.getArea() +
        "\nPerimeter is: " + triangle.getPerimeter() + "\nColor is: " + triangle.getColor() +
        "\nIs the triangle filled: " + triangle.isFilled());
    }
}
