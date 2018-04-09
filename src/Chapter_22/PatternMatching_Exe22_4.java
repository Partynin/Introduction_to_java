package Chapter_22;

import java.util.Scanner;

/** *22.4 (Pattern matching) Write a program that prompts the user to enter two strings
 and tests whether the second string is a substring of the first string. (Don’t use
 the indexOf method in the String class.) Analyze the time complexity of
 your algorithm. */

public class PatternMatching_Exe22_4 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter a string s2: ");
        String s2 = input.nextLine();

        int index = -1;
        int count = 0;
        boolean matched = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(count)){
                count = 0;
            }

            if (s1.charAt(i) == s2.charAt(count)) {
                if (count == 0)
                    index = i;
                count++;
            }

            if (count == s2.length()) {
                matched = true;
                break;
            }
        }

        if (matched)
            System.out.println("matched at index " + index);
         else System.out.println("Match not found.");
    }
}
