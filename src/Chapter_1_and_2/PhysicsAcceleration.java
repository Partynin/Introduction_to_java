package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 27.05.2017.
 */
public class PhysicsAcceleration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter V0, V1, and t: ");
        double V0 = scanner.nextDouble();
        double V1 = scanner.nextDouble();
        double t = scanner.nextDouble();

        double averageAcceleration = (V1 - V0) / t;

        System.out.println("The average acceleration is " + averageAcceleration);
    }
}
