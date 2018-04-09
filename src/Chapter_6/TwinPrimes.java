package Chapter_6;

public class TwinPrimes {
    /** Main method */
    public static void main(String[] args) {
        int i = 1;

        while (i < 1000) {
            i++;
            if (MersennePrimes.isPrime(i) && isHasPair(i)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    /** find twin primes */
    public static boolean isHasPair(int number) {
        if (MersennePrimes.isPrime(number + 2))
            return true;
        else return false;
    }
}
