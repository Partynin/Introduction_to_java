package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 10.07.2017.
 */
public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = scanner.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= (15 - i); j++) {
                System.out.print("    ");
            }
                System.out.print(i);

                if (i == 1) System.out.println();

            for (int z = i; z > 1; z--) {
                if (z > 9 && z < 16)
                    System.out.print("  " + (z - 1));
                else
                    System.out.print("   " + (z - 1));
        }

            for (int c = 2; c <= i; c++) {
                if (c == 2)
                    System.out.print("   ");

                if (c > 8 && c < 16)
                    System.out.print(c + "  ");
                else
                    System.out.print(c + "   ");

                if (c == i) System.out.println();
            }
        }
    }
}
