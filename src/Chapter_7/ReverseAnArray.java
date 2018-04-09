package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    private static double[] array = new double[10];

    /**
     * Main method
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextDouble();
        }

        System.out.println("The array revers is " + Arrays.toString(reverse(array)));
    }

    /** Revers an array */
    public static double[] reverse(double[] list) {
        double x = 0;
        for (int i = 0; i < list.length / 2; i++) {
            x = list[i];
            list[i] = list[list.length - (i + 1)];
            list[list.length - (i + 1)] = x;
        }
        return list;
    }
}