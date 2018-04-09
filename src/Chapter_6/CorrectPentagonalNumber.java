package Chapter_6;

public class CorrectPentagonalNumber {
    public static void main(String[] args) {
        System.out.println("The first 100 pentagonal numbers, ten per line: ");
        for (int n = 1; n <= 100; n++) {
            if (n % 10 == 0)
                System.out.printf("%7d\n", getPentagonalNumber(n));
            else
                System.out.printf("%7d", getPentagonalNumber(n));
        }
    }
    /** Returns the pentagonal number for n */
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}

