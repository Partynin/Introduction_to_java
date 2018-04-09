package Chapter_20;

import ToolKit.CompareY;
import ToolKit.Point;

import java.util.Arrays;

/** *20.4 (Sort points in a plane) Write a program that meets the following requirements:
 ■ Define a class named Point with two data fields x and y to represent a
 point’s x- and y-coordinates. Implement the Comparable interface for comparing
 the points on x-coordinates. If two points have the same x-coordinates,
 compare their y-coordinates.
 ■ Define a class named CompareY that implements Comparator<Point>.
 Implement the compare method to compare two points on their y-coordinates.
 If two points have the same y-coordinates, compare their x-coordinates.
 ■ Randomly create 100 points and apply the Arrays.sort method to display
 the points in increasing order of their x-coordinates and in increasing order
 of their y-coordinates, respectively. */

public class SortPointsInAPlane_Exe20_4 {
    /** Main method */
    public static void main(String[] args) {
        Point[] array = new Point[100];
        for (int i = 0; i < 100; i++) {
            array[i] = new Point(Math.random() * 100, Math.random() * 100);
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        Arrays.sort(array, new CompareY());

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
