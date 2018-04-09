package Chapter_7;

public class ReviseListing515PrimeNumber {

    /**
     * Main method
     */
    public static void main(String[] args) {
        int[] list = new int[50];
        int count = 0;

        for (int i = 2; count < 50; i++) {
            if (isPrime(i)) {
                list[count] = i;
                count++;
            }
        }

        printArray(list, 10);
    }

    /**
     * Check whether number is prime
     */
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }

    /** Print number */
    public static void printArray(int[] array, int numberPerLine) {

        for (int i = 0; i < array.length; i++) {

            System.out.printf("%10d ", array[i]);
            if ((i + 1) % numberPerLine == 0) System.out.println("");
        }
    }
}
