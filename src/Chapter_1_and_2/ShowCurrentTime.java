package Chapter_1_and_2;

/**
 * Created by Kos on 09.05.2017.
 */
public class ShowCurrentTime {
    public static void main(String[] args) {
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
}
