package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    private static double[] array = new double[10];

    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }

        babbleSort(array);
        System.out.println("Sort array is " +
                Arrays.toString(array));
    }

    /** Bubble sort */
    public static void babbleSort(double[] array) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double template = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = template;
                    flag = true;
                }
            }

        }
    }
}
