package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 17.06.2017.
 */
public class GeometryTwoRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1CenterX = scanner.nextDouble();
        double r1CenterY = scanner.nextDouble();
        double r1Width = scanner.nextDouble();
        double r1Height = scanner.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2CenterX = scanner.nextDouble();
        double r2CenterY = scanner.nextDouble();
        double r2Width = scanner.nextDouble();
        double r2Height = scanner.nextDouble();

        double distX1andX2 = Math.abs(r1CenterX - r2CenterX);
        double distY1andY2 = Math.abs(r1CenterY - r2CenterY);

        double distWidth = r1Width / 2 + r2Width / 2;
        double distHeight = r1Height / 2 + r2Height / 2;

        if (distX1andX2 > distWidth && distY1andY2 > distHeight)
            System.out.println("r2 does not overlap r1");
        else if (distX1andX2 < distWidth && distY1andY2 < distHeight)
            System.out.println("r2 is inside r1");
        else System.out.println("r2 overlaps r1");
    }
}
