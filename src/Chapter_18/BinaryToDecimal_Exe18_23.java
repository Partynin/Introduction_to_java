package Chapter_18;

import java.util.Scanner;

public class BinaryToDecimal_Exe18_23 {
    public static void main(String[] args) {
        System.out.print("Enter a binary string: ");
        Scanner input = new Scanner(System.in);
        String binStr = input.nextLine();

        System.out.println("Decimal equivalent of string " + binStr + " is " + bin2Dec(binStr));
    }

    public static int bin2Dec(String binaryString) {
        return bin2Dec(binaryString, 0);
    }

    public static int bin2Dec(String binaryString, int result) {
        if (binaryString.length() == 0)
            return result;
        else
            return result + bin2Dec(binaryString.substring(1),
                    Integer.parseInt(binaryString.charAt(0) + "") *
                            (int) Math.pow(2, binaryString.length() - 1));

    }
}
