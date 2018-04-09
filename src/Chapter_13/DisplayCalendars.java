package Chapter_13;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayCalendars {
    /** Main method */
    public static void main(String[] args) {
        if (args.length == 0) {
//            If you run the program without specifying a month and a year, the month is
//            the current month
            Calendar calendar1 = new GregorianCalendar();
            Calendar calendar = new GregorianCalendar(calendar1.get(Calendar.YEAR),
                    calendar1.get(Calendar.MONTH), 1);
            printMonthTitle(calendar);
            printMonthBody(calendar);
        } else if (args.length == 1 ) {
//            You also can run the program without the year. In this case, the year is the current
//            year.
            Calendar calendar1 = new GregorianCalendar();
            Calendar calendar = new GregorianCalendar(calendar1.get(Calendar.YEAR),
                    Integer.parseInt(args[0]) - 1, 1);
            printMonthTitle(calendar);
            printMonthBody(calendar);
        } else if (args.length == 2) {
            int year = Integer.parseInt(args[1]);

            int month = Integer.parseInt(args[0]) - 1;

            Calendar calendar = new GregorianCalendar(year, month, 1);
            printMonthTitle(calendar);
            printMonthBody(calendar);
        } else System.out.println("Invalid input!");
    }

    /** Print month title, e.g., March 2012 */
    public static void printMonthTitle(Calendar calendar) {
        System.out.println("        " + getMonthName(calendar.get(Calendar.MONTH)) +
                " " + calendar.get(Calendar.YEAR));
        System.out.println("______________________________");
        System.out.println(" Sun Mon Tue Wed  Thu Fri Sat");
    }

    /** Print month body */
    public static void printMonthBody(Calendar calendar) {
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

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
            case 0: monthName = "January";break;
            case 1: monthName = "February";break;
            case 2: monthName = "March";break;
            case 3: monthName = "April";break;
            case 4: monthName = "May";break;
            case 5: monthName = "June";break;
            case 6: monthName = "July";break;
            case 7: monthName = "August";break;
            case 8: monthName = "September";break;
            case 9: monthName = "October";break;
            case 10: monthName = "November";break;
            case 11: monthName = "December";
        }
        return monthName;
    }
}
