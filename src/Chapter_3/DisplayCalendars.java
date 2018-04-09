package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 13.07.2017.
 */
public class DisplayCalendars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.println("Enter the first day of year: ");
        int day = scanner.nextInt();

        int month = 1;
        int daysMonth = 31;
        do {
            System.out.printf("              %d %d               \n" +
                    "-------------------------------------\n" +
                    "  Sun  Mon  Tue  Wed  The  Fri  Sat\n  ", month, year);
            int count = 0;
            for (int i = 1; i < day; i++) {
                System.out.print("    ");
                count++;
            }

            if (month == 2) {
                daysMonth = 28;
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysMonth = 30;
            }
            else daysMonth = 31;

            for (int j = 1; j <= daysMonth; j++) {
                count++;
                System.out.printf("%4d ", j);
                if (count == 7) {
                    System.out.println();
                    count = 0;
                }
            }
            System.out.println();
            System.out.println();
            month++;
        } while (month <= 12);
    }
}
