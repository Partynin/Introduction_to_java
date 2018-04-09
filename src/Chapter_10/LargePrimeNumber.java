package Chapter_10;

import java.math.BigDecimal;

public class LargePrimeNumber {
    /** Main method */
    public static void main(String[] args) {
        int count = 1;
        long primeNumber = 2;
        System.out.println(" p     2^p - 1");
        while (count <= 100) {
            if (isPrime(primeNumber)) {
                System.out.println(" " + primeNumber + "     " + getMersennePrime(primeNumber));
                count++;
                primeNumber++;
            }
            primeNumber++;
        }
    }

    /** Check whether the number a prime */
    public static boolean isPrime(long number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
           if (number % divisor == 0) { // If true, number is not prime
              return false; // Number is not a prime
           }
       }

       return true; // Number is prime
    }

    /** Return Mersenne prime number */
    public static BigDecimal getMersennePrime(long prime) {
        BigDecimal mersennePrime = new BigDecimal((Math.pow(2, prime) - 1) + "");

        return mersennePrime;
    }
}
