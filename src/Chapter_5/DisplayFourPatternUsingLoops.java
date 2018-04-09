package Chapter_5;

/**
 * Created by Kos on 11.07.2017.
 */
public class DisplayFourPatternUsingLoops {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");

            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern B");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");

            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++)
                System.out.print("  ");
            for (int k = i; k >= 1; k--)
                System.out.print(k + " ");

            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern D");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 - i; j++)
                System.out.print(j + " ");
            for (int k = 1; k < 1 + i; k++)
                System.out.print("  ");

            System.out.println();
        }

    }
}
