package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 14.06.2017.
 */
public class ScienceWindChillTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour:");
        double wind = scanner.nextDouble();

        if (temperature > -58 && temperature < 47 && wind >= 2) {
            double windChillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(wind, 0.16)
                    + 0.4275 * temperature * (Math.pow(wind, 0.16));
            System.out.println("The wind chill index is " + windChillIndex);
        }
        else System.out.println("Invalid data");
    }
}
