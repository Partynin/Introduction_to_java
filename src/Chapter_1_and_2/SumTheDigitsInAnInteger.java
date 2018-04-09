package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 26.05.2017.
 */
public class SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();

        int digital = number % 10;
        number = number / 10;
        int ten = number % 10;
        number = number / 10;
        int sum = digital + ten + number;

        System.out.println("The sum of the digits is " + sum);
    }
}
