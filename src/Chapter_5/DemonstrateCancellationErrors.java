package Chapter_5;

/**
 * Created by Kos on 12.07.2017.
 */
public class DemonstrateCancellationErrors {
    public static void main(String[] args) {
        double series1 = 0;
        double series2 = 0;
        for (int i = 1; i <= 50000; i++) {
            series1 = series1 + 1.0 / i;
        }
        System.out.println(series1);

        for (int j = 50000; j >= 1;j--) {
            series2 = series2 + 1.0 / j;
        }
        System.out.println(series2);

        if (series1 > series2)
            System.out.println("Series1 = " + series1 + " more then " + series2);
        else System.out.println("Series2 = " + series2 + " more then " + series1);
    }
}
