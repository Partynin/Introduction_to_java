package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 26.05.2017.
 */
public class ConvertPoundsIntoKilograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();

        double kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
