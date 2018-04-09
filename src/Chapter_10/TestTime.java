package Chapter_10;

public class TestTime {
    /** Main method */
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);

        System.out.println("Time1 = " + time1.getHour() + ":" + time1.getMinute()
                + ":" + time1.getSecond());
        System.out.println("Time2 = " + time2.getHour() + ":" + time2.getMinute()
                + ":" + time2.getSecond());
    }
}
