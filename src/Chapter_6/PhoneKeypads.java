package Chapter_6;

import java.util.Scanner;

public class PhoneKeypads {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        String sNew = "";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                s1 = (Character.toString(s.charAt(i))).toUpperCase();
                sNew = sNew + getNumber(s1.charAt(0));
            }
            else sNew = sNew + s.charAt(i);
        }
        System.out.println(sNew);
    }

    /** Return a number given on uppercase letter */
    public static int getNumber(char uppercaseLetter) {
        int number = 0;
        if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C')
            number = 2;
        else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F')
            number = 3;
        else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I')
            number = 4;
        else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L')
            number = 5;
        else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O')
            number = 6;
        else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R'
                || uppercaseLetter == 'S')
            number = 7;
        else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V')
            number = 8;
        else if (uppercaseLetter == 'W' || uppercaseLetter == 'X' || uppercaseLetter == 'Y'
                || uppercaseLetter == 'Z')
            number = 9;

        return number;
    }
}
