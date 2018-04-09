package Chapter_13;

import java.util.Scanner;

public class Exercise13_20 {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0){
            double r1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            double r2 = (-b - Math.sqrt(discriminant)) / 2 * a;
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
        else if (discriminant == 0){
            double r1 = -b / (2 * a);
            System.out.println("The equation has one root " + r1);
        }
        else {
            System.out.println("The equation has no real roots.");
            Complex r1 = new Complex(-b / (2 * a), Math.pow(-discriminant, 0.5) / (2 * a));
            Complex r2 = new Complex(-b / (2 * a), -Math.pow(-discriminant, 0.5) / (2 * a));
            System.out.println("The roots are " + r1 + " and " + r2);
        }

    }
}
