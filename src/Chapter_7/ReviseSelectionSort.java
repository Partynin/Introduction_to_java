package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class ReviseSelectionSort {
    private static double[] array = new double[10];

    /**
     * Main method
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }

        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    /** The method for sorting the numbers */
     public static void selectionSort(double[] list) {
         for (int i = 0; i < list.length - 1; i++) {
             double currentMax = list[i];
            int currentMaxIndex = i;

             for (int j = i + 1; j < list.length; j++) {
                 if (currentMax < list[j]) {
                     currentMax = list[j];
                     currentMaxIndex = j;
                     }
                 }

             if (currentMaxIndex != i) {
                 list[currentMaxIndex] = list[i];
                 list[i] = currentMax;
                 }
             }
         }
}