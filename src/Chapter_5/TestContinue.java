package Chapter_5;

/**
 * Created by Kos on 07.07.2017.
 */
public class TestContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11)
                continue;
            sum += number;
        }

        System.out.println("the sum is " + sum);
    }
}
