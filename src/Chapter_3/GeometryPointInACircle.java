package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 14.06.2017.
 */
public class GeometryPointInACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));

        if (distance <= 10){
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        }
        else System.out.println("Point (" + x + ", " + y + ") is not the circle");
    }
}
