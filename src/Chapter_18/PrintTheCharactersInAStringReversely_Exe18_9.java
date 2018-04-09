package Chapter_18;

import java.util.Scanner;

public class PrintTheCharactersInAStringReversely_Exe18_9 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.print("The string " + str + " reversely is ");
        reverseDisplay(str);
    }

    public static void reverseDisplay(String value) {
        if (value.length() > 0) {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}
