package Chapter_7;

import java.util.Scanner;

public class FindTheSmallestElement {
    private static double[] array = new double[10];

    /** Main method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextDouble();
        }

        System.out.println(min(array));
    }

    /** Finds the smallest element */
    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}
