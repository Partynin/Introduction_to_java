package Chapter_9;

import java.util.GregorianCalendar;

public class UseTheGregorianCalendar {
    /** Main method */
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();

        System.out.println("Current year: " + date.get(GregorianCalendar.YEAR));
        System.out.println("Current month: " + date.get(GregorianCalendar.MONTH));
        System.out.println("Current day: " + date.get(GregorianCalendar.DAY_OF_MONTH));

        date.setTimeInMillis(1234567898765L);
        System.out.println("Elapsed year: " + date.get(GregorianCalendar.YEAR));
        System.out.println("Elapsed month: " + date.get(GregorianCalendar.MONTH));
        System.out.println("Elapsed day: " + date.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
