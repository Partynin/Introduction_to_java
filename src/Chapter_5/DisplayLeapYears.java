package Chapter_5;


/**
 * Created by Kos on 13.07.2017.
 */
public class DisplayLeapYears {
    public static void main(String[] args) {
        int count = 0;
        int countYears = 0;

        for (int year = 101; year <= 2100; year++) {
            // Check if the year is a leap year
            boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

            if (isLeapYear) {
                countYears++;
                count++;
                System.out.printf("%d ", year);
                if (count == 10) {
                    System.out.println();
                    count = 0;
                }
            }
        }
        System.out.print(" \nNumber of leap years is: " + countYears);
    }
}
