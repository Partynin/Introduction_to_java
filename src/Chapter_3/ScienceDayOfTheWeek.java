package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 14.06.2017.
 */
public class ScienceDayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: (e.g, 2012): ");
        int year = scanner.nextInt();
        System.out.print("Enter month: 1-12: ");
        int m = scanner.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int q = scanner.nextInt();

        if (m == 1) {
            m = 13;
            year -= 1;
        }
        if (m == 2) {
            m = 14;
            year -= 1;
        }
        int h = (q +((26 * (m + 1)) / 10) + (year % 100) + ((year % 100) / 4)
                + ((year / 100) / 4) + (5 * (year / 100))) % 7;

        switch (h){
            case 0 : System.out.println("Day of the week is Saturday");break;
            case 1 : System.out.println("Day of the week is Sunday");break;
            case 2 : System.out.println("Day of the week is Monday");break;
            case 3 : System.out.println("Day of the week is Tuesday");break;
            case 4 : System.out.println("Day of the week is Wednesday");break;
            case 5 : System.out.println("Day of the week is Thursday");break;
            case 6 : System.out.println("Day of the week is Friday");
        }
    }
}
