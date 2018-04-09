package Chapter_7;

import java.util.Scanner;

public class AverageAnArray {
    /** Main method */
    public static void main(String[] args) {
        double[] array = new double[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten double values: ");

        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextDouble();
        }

        System.out.println(average(array));
    }

    /** Average an integer array */
    public static  int average(int [] array) {
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + array[i];
        }
        average = average / array.length;

        return average;
    }

    /** Average a double array */
    public static double average(double[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + array[i];
        }
        average = average / array.length;

        return average;
    }
}
