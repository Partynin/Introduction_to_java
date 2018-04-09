package Chapter_5;

/**
 * Created by Kos on 09.07.2017.
 */
public class ConversationFromMilesToKilometers2 {
    public static void main(String[] args) {
        System.out.println("Miles      Kilometers   |   Kilometers      Miles");
        int count = 20;
        for (int i = 1; i <= 10; i++) {
            if (i > 1) count += 5;

            if (i <= 6) System.out.printf("%d          %.3f        |   %d              %.3f\n", i, (i * 1.609), count, (count / 1.609));
            else if (i < 10) System.out.printf("%d          %.3f       |   %d              %.3f\n", i, (i * 1.609), count, (count / 1.609));
            else System.out.printf("%d          %.3f      |   %d              %.3f\n", i, (i * 1.609), count, (count / 1.609));
        }
    }
}
