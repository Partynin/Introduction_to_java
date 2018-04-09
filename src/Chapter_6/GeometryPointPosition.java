package Chapter_6;

import java.util.Scanner;

public class GeometryPointPosition {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1 and p2: ");
        double p0x = scanner.nextDouble();
        double p0y = scanner.nextDouble();
        double p1x = scanner.nextDouble();
        double p1y = scanner.nextDouble();
        double p2x = scanner.nextDouble();
        double p2y = scanner.nextDouble();

        if (rightOfTheLine(p0x, p0y, p1x, p1y, p2x, p2y))
            System.out.println("(" + p2x +" , " + p2x + ")is on the right side of the line" +
                    " from (" + p0x + " , "+ p0y + ") to (" + p1x + " , " + p1x + ")");
        else if (leftOfTheLine(p0x, p0y, p1x, p1y, p2x, p2y))
            System.out.println("(" + p2x +" , " + p2x + ")is on the left side of the line" +
                    " from (" + p0x + " , "+ p0y + ") to (" + p1x + " , " + p1x + ")");
        else if (onTheLineSegment(p0x, p0y, p1x, p1y, p2x, p2y))
            System.out.println("(" + p2x +" , " + p2x + ")is on the line segment" +
                    " from (" + p0x + " , "+ p0y + ") to (" + p1x + " , " + p1y + ")");
        else if (onTheSameLine(p0x, p0y, p1x, p1y, p2x, p2y))
            System.out.println("(" + p2x +" , " + p2x + ")is on the same line" +
                    " from (" + p0x + " , "+ p0y + ") to (" + p1x + " , " + p1x + ")");
    }

    /** Return true if point (x2, y2) is on the left side of the
     * directed line from (x0, y0) to (x1, y1) */
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1,
                                        double x2, double y2) {
        if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0)
            return true;
        else
            return false;
    }

    /** Return true if point (x2, y2) is on the right side of the
     * directed line from (x0, y0) to (x1, y1) */
    public static boolean rightOfTheLine(double x0, double y0, double x1, double y1,
                                        double x2, double y2) {
        if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0)
            return true;
        else
            return false;
    }

    /** Return true if point (x2, y2) is on the same
     * line from (x0, y0) to (x1, y1) */
    public static boolean onTheSameLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2) {
        if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0)
            return true;
        else
            return false;
    }


    /** Return true if point (x2, y2) is on the
     * line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double x0, double y0,
                                           double x1, double y1, double x2, double y2) {
        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        return position <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1));
    }
}
