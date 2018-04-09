package Chapter_18;

import java.util.Scanner;

public class DecimalToBinary_Exe18_21 {
    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("Number " + n + " as decimal is " + dec2Bin(n));
    }

    public static String dec2Bin(int value) {
        return dec2Bin(value, "");
    }

    public static String dec2Bin(int value, String bin) {
        if (value / 2 == 0)
            return (value % 2) + bin;
        else
            return dec2Bin(value / 2, (value % 2) + bin);
    }
}
