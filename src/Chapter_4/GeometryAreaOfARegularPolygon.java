package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 29.06.2017.
 */
public class GeometryAreaOfARegularPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sids: ");
        double n = scanner.nextInt();
        System.out.print("Enter the side: ");
        double s = scanner.nextDouble();

        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));

        System.out.println("The area of the polygon is " + area);
    }
}
