package Chapter_18;

import java.util.Scanner;

public class PrintTheCharactersInAStringReversely_Exe18_12 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.print("The string " + str + " reversely is ");
        reverseDisplay(str);
    }


    public static void reverseDisplay(String value) {
        reverseDisplay(value, value.length() - 1);
    }

    public static void reverseDisplay(String value, int high) {
        if (high >= 0) {
            System.out.print(value.charAt(high));
            reverseDisplay(value, high - 1);
        }
    }
}
