package Chapter_6;

import java.util.Scanner;

public class DisplayCurrentDateAndTime {
    /** Main method */
    public static void main(String[] args) {
        getTime();
        System.out.println(getDays(System.currentTimeMillis()));
        System.out.println(getMouth(getDays(System.currentTimeMillis())));
    }

    /**  */
    public static void getTime() {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current seconds in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        //Compute the current minute in hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Display thr results
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT(Greenwich Mean Time)");
    }

    public static long getDays(long millisecond) {
        long hours = 0;
        hours = millisecond / 1000 / 60 / 60 / 24;

        return hours;
    }

    public static int getMouth(long days) {
        int mouth = 0;
        mouth = (int)days % 12;

        return mouth;
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

    /** Get the start day of month/1/year */
    public static  int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        // Get total number of days from 1/1/1800 to month/1/year
        int totalNumberOfDays = getNumberOfDays(year, month);

        // Return the start day for month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    /** Get the number of days since January 1, 1800 */
    public static int getNumberOfDays(int year, int month) {
        int total = 0;

        // Get the total days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;

        // Add days from Jan to the month prior to the calendar month
        for (int i  = 1; i < month; i++)
            total = total + getNumberOfDayInMonth(year, i);

        return total;
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


