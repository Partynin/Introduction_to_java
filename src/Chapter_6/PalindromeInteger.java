package Chapter_6;

import java.util.Scanner;

public class PalindromeInteger {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("The " + number + " is palindrome: " + isPalindrome(number));

    }

    // Return the reversal of an integer, i.e., reverse(456) return 654
    public static int reverse(int number) {
        String s = Integer.toString(number);
        String sNew = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            sNew = sNew + s.charAt(i);
        }
        number = Integer.parseInt(sNew);

        return number;
    }

    // Return tru if number is a palindrome
    public  static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }
}
