package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 28.05.2017.
 */
public class GeometryAreaOfAHexagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();

        double area = ((3 * Math.pow(3,0.5)) / 2) * side * side;

        System.out.println("The area of the hexagon is " + area);
    }
}
