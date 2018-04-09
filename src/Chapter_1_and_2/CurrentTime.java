package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 27.05.2017.
 */
public class CurrentTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        long offset = scanner.nextLong();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24 - offset;

        System.out.println("Current time is " + currentHour + ":" +
        + currentMinute + ":" + currentSecond);
    }
}
