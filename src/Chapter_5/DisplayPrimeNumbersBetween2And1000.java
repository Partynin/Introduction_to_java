package Chapter_5;

/**
 * Created by Kos on 12.07.2017.
 */
public class DisplayPrimeNumbersBetween2And1000 {
    public static void main(String[] args) {
        int count = 0; // Count the number of prime numbers

        for (int i = 2; i <= 1000; i++){
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            // Test whether number is prime
            for (int divisor = 2; divisor <= i / 2; divisor++) {
                if (i % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }
            if (isPrime) {
                System.out.printf("%4d", i);
                count++;
            }
            if (count % 10 == 0 && count != 0) {
                System.out.println();
                count = 0;
            }
        }
    }
}