package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 28.05.2017.
 */
public class PhysicsFindingRunwayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double V = scanner.nextDouble();
        double a = scanner.nextDouble();

        double length = (Math.pow(V,2)) / (2 * a);

        System.out.println("The minimum length for this airplane is " + length);
    }
}
