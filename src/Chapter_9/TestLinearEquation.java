package Chapter_9;

import java.util.Scanner;

public class TestLinearEquation {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

        if (!linearEquation.isSolvable()){
            System.out.println("The equation has not solution");
        }
        else {
            System.out.println("x is " + linearEquation.getX() + " and y is " + linearEquation.getY());
        }
    }
}
