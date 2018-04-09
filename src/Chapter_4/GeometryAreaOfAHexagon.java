package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 29.06.2017.
 */
public class GeometryAreaOfAHexagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = scanner.nextDouble();

        double area = 6 * s * s / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is %.2f", area);
    }
}
