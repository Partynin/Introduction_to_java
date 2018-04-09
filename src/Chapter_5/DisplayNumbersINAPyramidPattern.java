package Chapter_5;

/**
 * Created by Kos on 11.07.2017.
 */
public class DisplayNumbersINAPyramidPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8 - i; j++) {
                System.out.print("    ");
            }
            for (int k = 0; k < i; k++) {
                System.out.printf("%4d", (int)(Math.pow(2, k)));
            }
            for (int l = i; l > 1; l--) {
                System.out.printf("%4d", (int)(Math.pow(2, (l - 2))));
            }
            System.out.println();
        }

    }
}
