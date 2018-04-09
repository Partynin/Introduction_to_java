package Chapter_6;

import java.util.Calendar;
import java.util.Scanner;

public class OccurrenceOfASpecifiedCharacter {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string and char: ");
        String str = scanner.nextLine();
        System.out.print("Enter char: ");
        String a = scanner.nextLine();
        char ch = a.charAt(0);

        System.out.println("Occurrence char " + ch + " is number "
        + count(str, ch));
    }

    /** Method finds the number of occurrences of specified character in a string */
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count = i;
                break;
            }
        }

        return count;
    }
}
