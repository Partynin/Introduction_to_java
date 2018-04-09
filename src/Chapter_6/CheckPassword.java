package Chapter_6;

import java.util.Scanner;

public class CheckPassword {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String s = scanner.nextLine();

        if (isOnlyLettersAndDigits(s) && isHasTwoDigits(s) && isLengthMoreVan9(s))
            System.out.println("Valid password");
        else System.out.println("Invalid password");
    }

    /** Method checks length string */
    public static boolean isLengthMoreVan9(String s) {
        if (s.length() >= 9)
            return true;
        else return false;
    }

    /** Check the string has only letters and digits */
    public static boolean isOnlyLettersAndDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)))
                return false;
        }
        return true;
    }

    /** Check the string has at least two digits */
    public static boolean isHasTwoDigits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                count++;
        }
        if (count >= 2)
            return true;
        else return false;
    }
}
