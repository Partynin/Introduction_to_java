package Chapter_5;

/**
 * Created by Kos on 14.07.2017.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 100000; i++) {
            int divisor = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    divisor += j;
                }
            }
            if (i == divisor)
                System.out.println(i + " ");
        }
    }
}
