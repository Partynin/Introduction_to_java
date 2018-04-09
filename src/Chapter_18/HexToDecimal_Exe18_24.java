package Chapter_18;

import java.util.Scanner;

public class HexToDecimal_Exe18_24 {
    public static void main(String[] args) {
        System.out.print("Enter a hex string: ");
        Scanner input = new Scanner(System.in);
        String hexStr = input.nextLine();

        System.out.println("The hex string " + hexStr + " as a decimal is " + hex2Dec(hexStr));
    }

    public static int hex2Dec(String hexString) {
        return hex2Dec(hexString, 0);
    }

    public static int hex2Dec(String hexString, int result) {
        if (hexString.length() == 0)
            return result;
        else
            return result + hex2Dec(hexString.substring(1),
                    (hexString.charAt(0) - '0' < 10 ? hexString.charAt(0) - '0' :
                    hexString.charAt(0) - 'A' + 10) *
                            (int) Math.pow(16, hexString.length() - 1));
    }
}
