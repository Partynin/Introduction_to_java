package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 29.06.2017.
 */
public class GeometryAreaOfAPentagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double length = scanner.nextDouble();

        double s = 2 * length * (Math.sin(Math.PI / 5));
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %.2f", area);
    }
}
