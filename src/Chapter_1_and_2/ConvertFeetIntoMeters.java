package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 26.05.2017.
 */
public class ConvertFeetIntoMeters {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = read.nextDouble();

        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
