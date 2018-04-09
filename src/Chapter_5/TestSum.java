package Chapter_5;

/**
 * Created by Kos on 07.07.2017.
 */
public class TestSum {
    public static void main(String[] args) {
        double currentValue = 1.0;
        double sum = 0;
        for (int count = 0; count < 100; count++) {
            sum += currentValue;
            currentValue -= 0.01;
        }
        System.out.println(sum);
    }
}
