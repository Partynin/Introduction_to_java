package Chapter_22;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Find all prime numbers <= n, enter n: ");
        int n = input.nextInt();

        final int NUMBER_PER_LINE = 10;
        int count = 0;
        int number = 2; // A number to be tested for primeness

        System.out.println("The prime number are:");

        int squareRoot = 1;

        // Repeatedly find prime numbers
        while (number <= n) {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            if(squareRoot * squareRoot < number) squareRoot++;

            // Test if number is prime
            for (int divisor = 2; divisor <= squareRoot; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false;
                    break;
                }
            }

            // Print the prime number and increase the count
            if (isPrime) {
                count++; // Increase the count

                if (count % NUMBER_PER_LINE == 0) {
                    // Print the number and advance to the new line
                    System.out.printf("%7d\n", number);
                }
                else
                    System.out.printf("%7d", number);
            }

            // Check if the next number is prime
            number++;
        }

        System.out.println("\n" + count + " prime(s) less than or equal to " + n);
    }
}
