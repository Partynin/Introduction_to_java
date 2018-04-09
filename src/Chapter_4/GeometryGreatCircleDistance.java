package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 29.06.2017.
 */
public class GeometryGreatCircleDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude)" +
                " in degrees: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude)" +
                " in degrees: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double y = ((Math.sin(Math.toRadians(x1))) * (Math.sin(Math.toRadians(x2)))) +
                ((Math.cos(Math.toRadians(x1))) * (Math.cos(Math.toRadians(x2))) *
                        (Math.cos((Math.toRadians(y1)) - (Math.toRadians(y2)))));
        double d = 6371.01 * (Math.acos(y));

        System.out.println("The distans between the two points is" +
                " " + d + " km");
    }
}
