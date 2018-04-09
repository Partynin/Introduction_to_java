package Chapter_5;

/**
 * Created by Kos on 09.07.2017.
 */
public class ConversionFromKilogramsToPounds {
    public static void main(String[] args) {
        System.out.println("Kilograms   Pounds");
        for (int i = 1; i <= 199; i++) {
            if (i < 10)
                System.out.printf("%d  %15.1f\n", i, (i * 2.2));
            else if (i < 100)
                System.out.printf("%d %15.1f\n", i, (i * 2.2));
            else System.out.printf("%d%15.1f\n", i, (i * 2.2));
        }
    }
}
