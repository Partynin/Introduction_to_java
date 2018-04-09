package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 20.06.2017.
 */
public class GeometryPointOnLineSegment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1 and p2: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if ((x - x1) * (y2 - y1) == (y - y1) * (x2 - x1)){
            System.out.println("(" + x + ", " + y + ") is on the line segment" +
                    " from (" + x1 + ", " + y1 + ")"
                    + " to (" + x2 + ", " + y2 + ")");
        }
        else{
            System.out.println("(" + x + ", " + y + ") is not on the line" +
                    "segment from  (" + x1 + ", " + y1 + ")"
                    + " to (" + x2 + ", " + y2 + ")");
        }
    }
}
