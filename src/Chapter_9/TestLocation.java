package Chapter_9;

import java.util.Scanner;

public class TestLocation {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        double[][] array = new double[i1][j1];
        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }


        System.out.println("The location of the largest element is " + locateLargest(array).maxValue
        + " at (" + locateLargest(array).row + ", "+ locateLargest(array).column + ")");
    }

    /** Method that returns the location of the largest element in a two-dimensional array */
    public static Location locateLargest(double[][] a) {
        Location location = new Location(a);
        return location;
    }
}
