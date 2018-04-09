package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 30.06.2017.
 */
public class DecimalToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int value = scanner.nextInt();

        if (value > 15 && value < 0){
            System.out.println("You must enter exactly (0 to 15)");
            System.exit(1);
        }

        if (value >= 0 && value <= 10)
            System.out.println("The hex value of " + value + " is " + value);
        else if (value >= 11 && value <= 15){
            int i = 'A' + value - 10;
            char ch = (char)i;
            System.out.printf("The hex value of %d is %s", value, ch);
        }
        else System.out.println(value + " is an invalid input");
    }
}
