package Chapter_10;

import java.math.BigDecimal;

/**
 * Write a program that finds five prime numbers larger than Long.MAX_VALUE.
 * натуральное (целое положительное) число, имеющее ровно два различных
 * натуральных делителя — единицу и самого себя
 */

public class LargePrimeNumbers {
    /**
     * Main method
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        BigDecimal number = new BigDecimal(10 + "");
        int count = 1;
        while (count != 6) {
            if (isPrime(number)) {
                System.out.println("The " + count + " prime number after Long.MAX_VALUE is "
                        + number);
                count++;
            }
            number = number.add(BigDecimal.ONE);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Job time is: " + (endTime - startTime));
    }

    /**
     * Check whether number is prime
     */
    public static boolean isPrime(BigDecimal number) {
        BigDecimal numberDiv2 = number.divide(new BigDecimal("2"));
        BigDecimal numberDivisor = new BigDecimal("2");

        while (numberDiv2.compareTo(numberDivisor) >= 0) {
            if (number.remainder(numberDivisor).compareTo(BigDecimal.ZERO) == 0)
                return false; // Number is not a prime
            numberDivisor = numberDivisor.add(BigDecimal.ONE);
        }

        return true; // Number is prime
    }

    // /** Check whether number is prime */
    //public static boolean isPrime(int number) {
    //    for (int divisor = 2; divisor <= number / 2; divisor++) {
    //        if (number % divisor == 0) { // If true, number is not prime
    //           return false; // Number is not a prime
    //       }
    //    }

    //   return true; // Number is prime
    //}
}
