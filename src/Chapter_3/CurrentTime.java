package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 18.06.2017.
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

        String AMPM = "";

        if (currentHour <= 12){
            AMPM = " AM";
        }
        else {
            currentHour -= 12;
            AMPM = " PM";
        }

        System.out.println("Current time is " + currentHour + ":" +
                + currentMinute + ":" + currentSecond + AMPM);
    }
}
