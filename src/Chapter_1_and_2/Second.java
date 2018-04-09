package Chapter_1_and_2;

/**
 * Created by Kos on 30.04.2017.
 */
public class Second {
    public static void main(String[] args) {

        double miles = 100;
        final double KILOMETERS_PER_MILE = 1.609;

        double kilometrs = miles * KILOMETERS_PER_MILE;

        System.out.println("100 mils per kilometers = " + kilometrs);
    }
}
