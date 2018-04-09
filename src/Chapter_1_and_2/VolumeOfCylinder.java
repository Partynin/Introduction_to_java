package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 26.05.2017.
 */
public class VolumeOfCylinder {

        final static double PI = 3.14159;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a radius of cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter a length of cylinder: ");
        double length = scanner.nextDouble();

        // Compute area and volume
        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
    }
}
