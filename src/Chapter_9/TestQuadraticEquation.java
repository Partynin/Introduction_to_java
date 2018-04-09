package Chapter_9;

import java.util.Scanner;

public class TestQuadraticEquation {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0)
            System.out.println("Root 1 = " + quadraticEquation.getRoot1() + " and root 2 = " +
            quadraticEquation.getRoot2());
        else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Roots 1, 2 = " + quadraticEquation.getRoot1());
        } else System.out.println("The equation has no roots.");

    }
}
