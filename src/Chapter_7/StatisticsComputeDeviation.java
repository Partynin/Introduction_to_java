package Chapter_7;

import java.util.Scanner;

public class StatisticsComputeDeviation {
    private static double[] array = new double[10];
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextDouble();
        }
        System.out.printf("The mean is %.2f\n",mean(array));
        System.out.printf("The standard deviation is %.5f", deviation(array));
    }

    /** Compute the deviation of double values */
    public static double deviation(double[] x) {
        double deviation = 0;
        for (int i = 0; i < x.length; i++) {
            deviation = deviation + (Math.pow((x[i] - mean(x)), 2));
        }
        deviation = Math.sqrt(deviation / (x.length - 1));
        return deviation;
    }

    /** Compute the mean of an array of double values */
    public static double mean(double[] x) {
        double mean = 0;
        for (int i = 0; i < x.length; i++) {
            mean = mean + x[i];
        }
        mean = mean / x.length;
        return mean;
    }
}
