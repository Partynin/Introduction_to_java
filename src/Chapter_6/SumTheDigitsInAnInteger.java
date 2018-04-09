package Chapter_6;

import java.util.Scanner;

public class SumTheDigitsInAnInteger {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = scanner.nextLong();

        System.out.println("Sum digits of " + n + " = " + sumDigits(n));
    }

    /** That method computes the sum of digits in an integer */
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (int)(n % 10);
            n = n / 10;
        }

        return  sum;
    }
}
