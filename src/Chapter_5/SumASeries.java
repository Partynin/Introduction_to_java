package Chapter_5;

/**
 * Created by Kos on 12.07.2017.
 */
public class SumASeries {
    public static void main(String[] args) {
        double x = 1.0;
        double y = 3.0;
        double sum = 0;
        for (int i = 1; i <= 97; i = i + 2) {
            sum = sum + ((x + 2) / (y + 2));
        }
        System.out.println("Sum = " + sum);
    }
}
