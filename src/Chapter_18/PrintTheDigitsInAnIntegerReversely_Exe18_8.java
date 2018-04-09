package Chapter_18;

import java.util.Scanner;

public class PrintTheDigitsInAnIntegerReversely_Exe18_8 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.print("The number " + number + " reversely is ");
        reverseDisplay(number);
    }

    public static void reverseDisplay(int value) {
        if (value > 0) {
            System.out.print(value % 10);
            reverseDisplay(value / 10);
        }
    }
}
