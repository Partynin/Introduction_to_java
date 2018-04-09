package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 15.07.2017.
 */
public class OccurrenceOfMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int i = 0;
        int max = 0;
        int count = 0;
        do {
            i = scanner.nextInt();
            if (i > max) {
                max = i;
                count = 0;
            }
            if (i == max) count++;
        } while (i != 0);

        System.out.printf("The largest number is %d\n", max);
        System.out.printf("The occurrence countPosition of the largest number is %d", count);
    }
}
