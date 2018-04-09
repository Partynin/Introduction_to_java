package Chapter_13;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise13_19 {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String numberStr = scanner.nextLine();

        String numerator = numberStr.replace(".", "");

        String[] token = numberStr.split("[.]");
        String denominator = "1";
        for (int i = 0; i < token[1].length(); i++) {
            denominator += "0";
        }

        System.out.println("The fraction number is "
                + new BigIntegerRational(new BigInteger(numerator), new BigInteger(denominator)));
    }
}
