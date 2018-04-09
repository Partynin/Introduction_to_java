package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 09.06.2017.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        // Display the result
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
