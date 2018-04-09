package Chapter_13;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise13_21 {
    private static double r1;
    private static double r2;
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0){
            r1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            r2 = (-b - Math.sqrt(discriminant)) / 2 * a;
        }
        else if (discriminant == 0){
            double r1 = -b / (2 * a);
        }
        else {
            Complex r1 = new Complex(-b / (2 * a), Math.pow(-discriminant, 0.5) / (2 * a));
            Complex r2 = new Complex(-b / (2 * a), -Math.pow(-discriminant, 0.5) / (2 * a));
        }
        double h = (-b) / 2 * a;
        double k = (a * Math.pow(r1, 2)) - (b * Math.pow(r1, 2)) + c;

        System.out.println("h is " + rational(h) + " k is " + rational(k));
    }

    public static BigIntegerRational rational(double number) {
        String numberStr = Double.toString(number);

        String numerator = numberStr.replace(".", "");

        String[] token = numberStr.split("[.]");
        String denominator = "1";
        for (int i = 0; i < token[1].length(); i++) {
            denominator += "0";
        }

        return new BigIntegerRational(new BigInteger(numerator), new BigInteger(denominator));
    }
}
