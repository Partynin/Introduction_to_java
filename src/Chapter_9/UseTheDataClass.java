package Chapter_9;

import java.util.Date;

public class UseTheDataClass {
    /** Main method */
    public static void main(String[] args) {
        Date date = new Date();


        long time = 10000;
        for (int i = 1; i <= 8; i++) {
            date = new Date(time);
            System.out.println(date.toString());
            time *= 10;
        }
    }
}
