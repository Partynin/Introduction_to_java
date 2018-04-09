package Chapter_5;

/**
 * Created by Kos on 09.07.2017.
 */
public class ConversionFromKilogramsToPoundsAndPoundsToKilogram {
    public static void main(String[] args) {
        System.out.println("Kilograms   Pounds   |   Pounds   Kilograms");
        int number = 20;
        for (int i = 1; i <= 199; i++) {
            if (i > 1) number = number + 5;
            if (i < 10)
                System.out.printf("%d  %15.1f   |   %d          %6.2f\n", i, (i * 2.2),
                        number, (number / 2.2));
            else if (i < 17)
                System.out.printf("%d %15.1f   |   %d          %6.2f\n", i, (i * 2.2),
                        number, (number / 2.2));

            else if (i < 100)
                System.out.printf("%d %15.1f   |   %d         %6.2f\n", i, (i * 2.2),
                        number, (number / 2.2));
            else if (i < 197)
                System.out.printf("%d%15.1f   |   %d         %6.2f\n", i, (i * 2.2),
                        number, (number / 2.2));
            else  System.out.printf("%d%15.1f   |   %d        %6.2f\n", i, (i * 2.2),
                        number, (number / 2.2));
        }
    }
}
