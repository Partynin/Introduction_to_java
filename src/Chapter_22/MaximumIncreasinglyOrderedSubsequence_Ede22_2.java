package Chapter_22;

import java.util.*;

/** **22.2 (Maximum increasingly ordered subsequence) Write a program that prompts
 the user to enter a string and displays the maximum increasingly ordered subsequence
 of characters. Analyze the time complexity of your program. */

public class MaximumIncreasinglyOrderedSubsequence_Ede22_2 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        stack.add(chars[0]);
        for (int i = 1; i < chars.length; i++) {
                if (chars[i] > stack.peek()) {
                    stack.add(chars[i]);
                }
        }

        String subsequence = "";
        for (char c : stack)
            subsequence += c + "";

        System.out.println(subsequence);
        /** The time complexity O(n) */
    }
}