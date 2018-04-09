package Chapter_6;

import java.util.Scanner;

public class DisplayAnIntegerReversed {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("Revers integer " + number + " is " + reverse(number));
    }

    // Method for revers integer number
    public static int reverse(int number) {
        String s = Integer.toString(number);
        String sNew = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            sNew = sNew + s.charAt(i);
        }
        number = Integer.parseInt(sNew);

        return number;
    }
}
