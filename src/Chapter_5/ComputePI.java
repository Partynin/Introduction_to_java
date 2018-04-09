package Chapter_5;

/**
 * Created by Kos on 12.07.2017.
 */
public class ComputePI {
    public static void main(String[] args) {
        double n = 0;

        for (int j = 10000; j <= 100000; j = j + 10000) {
        for (int i = 1; i <= j; i++) {
            n = n + (Math.pow(-1, i + 1)) / (2 * i - 1);
        }

        double PI = 4 * n;
        System.out.println("PI " + j + " = " + PI);
        n = 0;
        }
    }
}
