package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 30.06.2017.
 */
public class HexToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String s = scanner.nextLine();

        // Check if the hex string has exactly one character
        if (s.length() != 1){
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        // Display binary value for the hex digit
        char ch = s.charAt(0);
        if (ch <= 'F' && ch >= 'A'){
            int value = ch - 'A' + 10;

            System.out.println("The binary value is: " + Integer.toBinaryString(value));
        }
        else  if (Character.isDigit(ch)){
            int value = Integer.parseInt(s);
            System.out.println("The binary value is: " + Integer.toBinaryString(value));
        }
        else System.out.println(ch + " is an invalid input");
    }
}
