package Chapter_10;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
         // Obtain the total milliseconds since midnight, Jan 1, 1970
         long totalMilliseconds = System.currentTimeMillis();

         // Obtain the total seconds since midnight, Jan 1, 1970
         long totalSeconds = totalMilliseconds / 1000;

         // Compute the current second in the minute in the hour
         second = totalSeconds % 60;

         // Obtain the total minutes
         long totalMinutes = totalSeconds / 60;

         // Compute the current minute in the hour
         minute = totalMinutes % 60;

         // Obtain the total hours
         long totalHours = totalMinutes / 60;

         // Compute the current hour
         hour = totalHours % 24;
    }

    public Time(long elapseTime) {
        long totalSeconds = elapseTime / 1000;

        second = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        minute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        hour = totalHours % 24;
    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;

        second = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        minute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        hour = totalHours % 24;
    }
}
