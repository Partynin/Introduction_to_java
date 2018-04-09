package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 28.05.2017.
 */
public class HealthApplicationComputingBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();

        double BMI = (weight * 0.45359237) / (Math.pow((height * 0.0254), 2));

        System.out.println("BMI is " + BMI);
    }
}
