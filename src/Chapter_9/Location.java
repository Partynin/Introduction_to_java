package Chapter_9;

import Chapter_8.LocateTheLargestElement;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(double[][] a) {
        row = LocateTheLargestElement.locateLargest(a)[0][0];
        column = LocateTheLargestElement.locateLargest(a)[0][1];
        maxValue = LocateTheLargestElement.maxValueInTwoDimensionalArray(a);
    }
}
