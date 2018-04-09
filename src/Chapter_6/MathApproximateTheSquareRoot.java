package Chapter_6;

public class MathApproximateTheSquareRoot {
    /** Main method */
    public static void main(String[] args) {
        System.out.println(sqrt(3));
        System.out.println(Math.sqrt(3));
    }

    /** Return the square root */
    public static double sqrt(long n) {
        double nextGuess = 0;
        double lastGuess = n;
        double x = 0;

        do {
            if (x == 1)
            lastGuess = nextGuess;

            nextGuess = (lastGuess + n / lastGuess) / 2.0;
            x = 1;
        } while (lastGuess - nextGuess > 0.0001);

        return nextGuess;
    }
}
