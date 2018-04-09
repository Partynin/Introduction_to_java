package Chapter_22;

import java.util.Scanner;

/** *22.3 (Pattern matching) Write a program that prompts the user to enter two strings
 and tests whether the second string is a substring of the first string. Suppose
 the neighboring characters in the string are distinct. (Don’t use the indexOf
 method in the String class.) Analyze the time complexity of your algorithm.
 Your algorithm needs to be at least O(n) time. */

public class PatternMatching_Exe22_3 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter a string s2: ");
        String s2 = input.nextLine();

        char[] charsS1 = s1.toCharArray();
        char[] charsS2 = s2.toCharArray();

        int index = -1;
        int count = 0;

        for (int i = 0; i < charsS1.length; i++) {
            if (charsS1[i] != charsS2[count]) {
                count = 0;
            }
            if (charsS1[i] == charsS2[count]) {
                if (count == 0)
                    index = i;
                count++;
            }

            if (count == charsS2.length - 1)
                break;
        }

        if (index >= 0) {
            System.out.println("matched at index " + index);
        } else System.out.println("match not found");
    }
}
