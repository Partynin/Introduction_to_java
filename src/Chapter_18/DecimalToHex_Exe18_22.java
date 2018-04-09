package Chapter_18;

import java.util.Scanner;

public class DecimalToHex_Exe18_22 {
    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("The number " + n + " as a hes is " + dec2Hex(n));
    }

    public static String dec2Hex(int value) {
        return dec2Hex(value, "");
    }

    public static String dec2Hex(int value, String hex) {
        if (value / 16 == 0)
            return ((value % 16) >= 10 ?
                    ((char)((value % 16) - 10 + 'A')) + "" : (value % 16)) + hex;
        else
            return dec2Hex(value / 16, ((value % 16) >= 10 ?
                    ((char)((value % 16) - 10 + 'A')) + "" : (value % 16)) + hex);
    }
}
