package Chapter_6;

import java.util.Scanner;

public class ConvertMillisecondsToHoursMinutesAndSeconds {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long millis = scanner.nextLong();

        System.out.println(convertMillis(millis));
    }

    /** Converts milliseconds */
    public static String convertMillis(long millis) {
        String str = "";
        long totalSeconds = millis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        str = totalHours + " : " + minutes + " : " + seconds;

        return str;
    }
}
