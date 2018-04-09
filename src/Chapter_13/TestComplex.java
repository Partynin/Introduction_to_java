package Chapter_13;

import java.util.Scanner;

public class TestComplex {
    /** Main method */
    public static void main(String[] args) {
        System.out.print("Enter first complex number: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        Complex complex1 = new Complex(a, b);
        System.out.print("Enter the second complex number: ");
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        Complex complex2 = new Complex(c, d);

        System.out.println("(" + a + " + " + b + "i) + (" + c + " + " + d + "i) = " +
                complex1.add(complex2));
        System.out.println("(" + a + " + " + b + "i) - (" + c + " + " + d + "i) = " +
                complex1.subtract(complex2));
        System.out.println("(" + a + " + " + b + "i) * (" + c + " + " + d + "i) = " +
                complex1.multiply(complex2));
        System.out.println("(" + a + " + " + b + "i) / (" + c + " + " + d + "i) = " +
                complex1.divide(complex2));
        System.out.println("|(" + a + " + " + b + "i)| = " + complex1.abs());
    }
}
