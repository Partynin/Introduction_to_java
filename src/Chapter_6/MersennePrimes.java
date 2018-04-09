package Chapter_6;

public class MersennePrimes {
    /** Main method */
    public static void main(String[] args) {
        int i = 1;
        System.out.println("p                 2^p-1");
        System.out.println("____________________________");
        while (i <= 31) {
            i++;
            if (isPrime(i)) {
                System.out.printf("%d%25d\n", i, ((long) (Math.pow(2, i))) - 1);
            }
        }
    }

    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }
}
