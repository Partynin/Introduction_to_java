package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 27.05.2017.
 */
public class ScienceCalculatingEnergy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double M = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();

        double Q = M * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is " + Q);
    }
}
