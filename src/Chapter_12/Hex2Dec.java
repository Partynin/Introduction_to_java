package Chapter_12;

import java.lang.NumberFormatException;
import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) throws BinaryFormatException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter bin number: ");
        String s = input.nextLine();
        System.out.println(s + " to dec = " + bin2Dec(s));

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number "
                + hex + " is " + hexDecimal(hex.toUpperCase()));
    }

    public static int hexDecimal(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
           if (!isNumeric("" + hexChar) && (hexChar < 'A' || hexChar > 'F'))
               throw new NumberFormatException("Invalid input");
        }
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else  // ch is '0', '1', ..., or '9'
            return ch - '0';
    }

    public static boolean isNumeric(String s) {
        for (char ch : s.toCharArray()) {
            if (ch < '0' || ch > '9') return false;
        }
        return true;
    }

    /** Метод переводит из двоичной системы в десятичную */
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        for (int j = 0; j < binaryString.length(); j++) {
            if (binaryString.charAt(j) != '0' && binaryString.charAt(j) != '1')
                throw new BinaryFormatException(binaryString);
        }

        int numberDec = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            numberDec = numberDec + (Integer.parseInt("" + binaryString.charAt(i))) *
                    (int)(Math.pow(2, (binaryString.length() - i - 1)));
        }

        return numberDec;
    }
}
