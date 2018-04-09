package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 26.05.2017.
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double degreeInCelsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (9.0 / 5) * degreeInCelsius + 32;

        System.out.println(degreeInCelsius + " Celsius is " + fahrenheit + " in Fahrenheit");
    }
}
