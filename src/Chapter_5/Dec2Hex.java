package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 07.07.2017.
 */
public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an decimal integer
        System.out.print("Enter decimal number: ");
        int decimal = input.nextInt();

        // Convert decimal to hex
        String hex = "";
        int count = 0;

        while (decimal != 0) {
            int hexValue = decimal % 16;

            // Convert a decimal value to a hex digit
            char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
                    (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');

                    hex = hexDigit + hex;
                    decimal = decimal / 16;
                    count++;
        }

        System.out.println("The xeh number is " + hex);
        System.out.println("Count = " + count);
    }
}
