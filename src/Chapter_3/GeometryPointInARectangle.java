package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 14.06.2017.
 */
public class GeometryPointInARectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x <= 5 && x >= -5 && y >= -2.5 && y <= 2.5){
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        }
        else System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");

    }
}
