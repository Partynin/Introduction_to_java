package Chapter_6;

import java.util.Scanner;

public class PrintCalendar2 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter year
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        // Prompt the user to enter mouth
        System.out.print("Enter mouth as a number between 1 and 12: ");
        int month = input.nextInt();

        // Print calendar for the month of year
        if (month >=1 && month <= 12)
            printMonth(year, month);
        else System.out.println("No valid input!");
    }

    /** Print the calendar for a month in year */
    public static void  printMonth(int year, int month) {
        printMonthTitle(year, month);

        printMonthBody(year,month);
    }

    /** Print month title, e.g., March 2012 */
    public static void printMonthTitle(int year, int month) {
        System.out.println("        " + getMonthName(month) +
                " " + year);
        System.out.println("______________________________");
        System.out.println(" Sun Mon Tue Wed  Thu Fri Sat");
    }

    /** Print month body */
    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);

        int numberOfDaysInMonth = getNumberOfDayInMonth(year, month);

        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");
        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    /** Get the English name for the month */
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January";break;
            case 2: monthName = "February";break;
            case 3: monthName = "March";break;
            case 4: monthName = "April";break;
            case 5: monthName = "May";break;
            case 6: monthName = "June";break;
            case 7: monthName = "July";break;
            case 8: monthName = "August";break;
            case 9: monthName = "September";break;
            case 10: monthName = "October";break;
            case 11: monthName = "November";break;
            case 12: monthName = "December";
        }
        return monthName;
    }

    /** Get start day of month */
    public static int getStartDay(int year, int month) {
        if (month == 1) {
            month = 13;
            year -= 1;
        }
        if (month == 2) {
            month = 14;
            year -= 1;
        }
        int h = (1 +((26 * (month + 1)) / 10) + (year % 100) + ((year % 100) / 4)
                + ((year / 100) / 4) + (5 * (year / 100))) % 7;


        return h + 5;
    }
    /** Get the number of days in a month */
    public static int getNumberOfDayInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0; // If month is incorrect
    }

    /** Determine if is a leap year */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
