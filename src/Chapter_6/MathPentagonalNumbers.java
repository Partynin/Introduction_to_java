package Chapter_6;

public class MathPentagonalNumbers {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("This program display first 100 pentagonal number.");

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0)
            System.out.printf("%7d\n", getPentagonalNumber(i));
            else System.out.printf("%7d", getPentagonalNumber(i));
        }
    }

    /** Return a pentagonal number */
    public static int getPentagonalNumber(int n) {
        n = n * (3 * n - 1) / 2;
        return n;
    }
}
