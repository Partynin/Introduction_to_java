package Chapter_22;

import ToolKit.Pair;
import ToolKit.Point;

public class ClosestPairOfPoints_Exe22_7 {
    public static final int ARRAY_LENGTH = 100;
    private static Point[] array = new Point[ARRAY_LENGTH];

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Point(Math.random() * 100, Math.random() * 100);
        }

        Pair pair = Pair.getClosestPair(array);
        System.out.println(pair.getDistance());
    }
}
