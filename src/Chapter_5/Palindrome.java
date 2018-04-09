package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 09.07.2017.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // The index of the first character in the string
        int low = 0;

        // The index of the last character in the sting
        int high = s.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        if (isPalindrome)
            System.out.println(s + " is palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}
