package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 12.06.2017.
 */
public class FindFutureDates {
    public static String d;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int todayDay = scanner.nextInt();

        switch (todayDay){
            case 0 : d = "Sunday";break;
            case 1 : d = "Monday";break;
            case 2 : d = "Tuesday";break;
            case 3 : d = "Wednesday";break;
            case 4 : d = "Thursday";break;
            case 5 : d = "Friday";break;
            case 6 : d = "Saturday";
        }

        System.out.print("Enter the number of day elapsed since today: ");
        int elapse = scanner.nextInt();

        int todayFuture;
        if (todayDay + elapse < 7){
            todayFuture = todayDay + elapse;
        }else {
        todayFuture = (todayDay + elapse) % 7;
        }
        switch (todayFuture){
            case 0 : System.out.println("Today is " + d + " and the future day is Sunday");break;
            case 1 : System.out.println("Today is " + d + " and the future day is Monday");break;
            case 2 : System.out.println("Today is " + d + " and the future day is Tuesday");break;
            case 3 : System.out.println("Today is " + d + " and the future day is Wednesday");break;
            case 4 : System.out.println("Today is " + d + " and the future day is Thursday");break;
            case 5 : System.out.println("Today is " + d + " and the future day is Friday");break;
            case 6 : System.out.println("Today is " + d + " and the future day is Saturday");break;
        }

    }
}
