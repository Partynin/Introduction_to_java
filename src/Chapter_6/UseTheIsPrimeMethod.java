package Chapter_6;

public class UseTheIsPrimeMethod {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("The prime number less than 10000 is: ");

        int count = 0;
        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i)) {
                System.out.printf("%4d ", i);
                count++;
            }
            if (count % 10 == 0 && count != 0) {
                System.out.println();
                count = 0;
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
