package Chapter_22;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** **22.8 (All prime numbers up to 10,000,000,000) Write a program that finds
 all prime numbers up to 10,000,000,000. There are approximately
 455,052,511 such prime numbers. Your program should meet the following
 requirements:
 ■ Your program should store the prime numbers in a binary data file, named
 PrimeNumbers.dat. When a new prime number is found, the number is
 appended to the file.
 ■ To find whether a new number is prime, your program should load the
 prime numbers from the file to an array of the long type of size 10000.
 If no number in the array is a divisor for the new number, continue to read
 the next 10000 prime numbers from the data file, until a divisor is found
 or all numbers in the file are read. If no divisor is found, the new number
 is prime.
 ■ Since this program takes a long time to finish, you should run it as a batch
 job from a UNIX machine. If the machine is shut down and rebooted, your
 program should resume by using the prime numbers stored in the binary data
 file rather than start over from scratch. */

public class AllPrimeNumbersUpTO10_000_000_000_Exe22_8 {
    final static long NUMBERS_UP_TO_10_000_000_000 = 10_000_000_000L;
    private static long[] primeNumbersForDivisor = new long[10_000];

    /** Main method */
    public static void main(String[] args) throws IOException {
        // A list to hold prime numbers

        long count = 0;
        long number = 2;
        long squareRoot = 1;
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream("PrimeNumbers.dat")
        ));

        // Repeatedly find prime numbers
        while (number <= NUMBERS_UP_TO_10_000_000_000) {
            boolean isPrime = true;

            if (squareRoot * squareRoot < number) squareRoot++;

            // Test whether number is prime
            for (int k = 0;
                 k < primeNumbersForDivisor.length && primeNumbersForDivisor[k] <= squareRoot;
                 k++) {
                if (number % primeNumbersForDivisor[k] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                output.writeLong(number);
            }
            number++;
        }
    }
}
