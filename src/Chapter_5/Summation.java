package Chapter_5;

/**
 * Created by Kos on 14.07.2017.
 */
public class Summation {
    public static void main(String[] args) {
        double d = 0;
        for (int i = 0; i <= 624; i++) {
            d += d + (1 / ((Math.sqrt(1 + i)) + (Math.sqrt(2 + i))));
        }
        System.out.println(d);
    }
}
