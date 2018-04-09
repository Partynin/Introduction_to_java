package Chapter_1_and_2;

import java.util.Scanner;

public class CountTheLettersInAString {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.printf("Quantity of letters equal: %d", countLetters(s));
    }

    /** Counter letters in a string */
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                count++;
        }

        return count;
    }
}
