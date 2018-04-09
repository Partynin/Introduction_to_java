package Chapter_6;

public class NumberOFDaysInAYear {
    /** Main method */
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("Year %d has %d days\n", i, numberOfDaysInAYear(i));
        }

    }

    /** Method return number of days in a year */
    public static int numberOfDaysInAYear(int year) {
        int days = 0;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            days = 366;
        else days = 365;

        return days;
    }
}
