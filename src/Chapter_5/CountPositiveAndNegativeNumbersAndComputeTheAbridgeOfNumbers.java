package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 09.07.2017.
 */
public class CountPositiveAndNegativeNumbersAndComputeTheAbridgeOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0:" );
        int number;
        int countPositive = 0;
        int countNegative = 0;
        double total = 0;
        int iteration = 0;

         do {
            number = scanner.nextInt();
            if (number == 0) break;

            if (number > 0)
                countPositive++;
            else countNegative++;

            total += number;
            iteration++;
        } while (number != 0);

         if (iteration == 0) System.out.println("No numbers are entered except 0");
         else
        System.out.printf("The number of positives is %d\nThe number of " +
                "negatives is %d\nThe total is %.1f\nThe average is %.2f",
                countPositive, countNegative, total,(total / iteration));
    }
}
