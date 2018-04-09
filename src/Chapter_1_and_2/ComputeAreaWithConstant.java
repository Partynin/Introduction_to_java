package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 06.05.2017.
 */
public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final int SIZE = 20;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area for the circle jf radius " +
            radius + " is " + area);
    }
}
