package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 05.07.2017.
 */
public class TestDoWhile {
    public static void main(String[] args) {
        int data, sum = 0;

        Scanner input = new Scanner(System.in);

        // Keep reading data until the input is 0
        do {
            // Read the next data
            System.out.print("Enter an integer (the input " +
                    "end if it is 0): ");
            data = input.nextInt();

            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);
    }
}
