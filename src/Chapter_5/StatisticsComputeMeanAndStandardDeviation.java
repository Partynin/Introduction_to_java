package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 16.07.2017.
 */
public class StatisticsComputeMeanAndStandardDeviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double maen = 0;
        double deviation = 0;
        double sumX = 0;
        int count = 0;
        double sumPowX = 0;
        do {
            double x = scanner.nextDouble();
            sumX += x;
            sumPowX += Math.pow(x, 2);
            count++;

        } while (count < 10);

        maen = sumX / 10;

        deviation = Math.sqrt((sumPowX - (sumX * sumX) / 10) / 9);

        System.out.println("The mean is " + maen);
        System.out.println("The standard deviation is " + deviation);
    }
}
