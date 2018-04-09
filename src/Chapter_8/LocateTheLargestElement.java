package Chapter_8;

import java.util.Scanner;

public class LocateTheLargestElement {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        double[][] array = new double[rows][columns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The location of the largest element is at (" +
        locateLargest(array)[0][0] + ", " + locateLargest(array)[0][1] + ")");
    }

    /** Returns the location of the largest element in a two-dimensional array */
    public static int[][] locateLargest(double[][] a) {
        int[][] location = new int[1][2];
        double max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                    location[0][0] = i;
                    location[0][1] = j;
                }
            }
        }

        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location.length; j++) {
                //System.out.print(location[i][j] + " ");
            }
        }

        return location;
    }

    /** Method for fined the largest element in the two dimensional array */
    public static double maxValueInTwoDimensionalArray(double[][] a) {
        double max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }
}
