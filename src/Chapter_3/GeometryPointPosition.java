package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 19.06.2017.
 */
public class GeometryPointPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1 and p2: ");
        double p0x = scanner.nextDouble();
        double p0y = scanner.nextDouble();
        double p1x = scanner.nextDouble();
        double p1y = scanner.nextDouble();
        double p2x = scanner.nextDouble();
        double p2y = scanner.nextDouble();

        if ((p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y)
                > 0){
            System.out.println("(" + p2x + ", " + p2y + ") is on the left" +
                    "side of the line from (" + p0x + ", " + p0y + ")"
            + " to (" + p1x + ", " + p1y + ")");
        }
        else if ((p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y)
                == 0){
            System.out.println("(" + p2x + ", " + p2y + ") is on the line" +
                    " from (" + p0x + ", " + p0y + ")"
                    + " to (" + p1x + ", " + p1y + ")");
        }
        else{
            System.out.println("(" + p2x + ", " + p2y + ") is on the right" +
                    "side of the line from (" + p0x + ", " + p0y + ")"
                    + " to (" + p1x + ", " + p1y + ")");
        }
    }
}
