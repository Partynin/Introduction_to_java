package Chapter_5;

/**
 * Created by Kos on 09.07.2017.
 */
public class ConversationFromMilesToKilometers {
    public static void main(String[] args) {
        System.out.println("Miles      Kilometers");
        for (int i = 1; i <= 10; i++) {
            if (i < 10) System.out.printf("%d          %.3f\n", i, (i * 1.609));
            else System.out.printf("%d         %.3f\n", i, (i * 1.609));
        }
    }
}
