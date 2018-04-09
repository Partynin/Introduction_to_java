package Chapter_22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** *22.5 (Same-number subsequence) Write an O(n) program that prompts the user to
 enter a sequence of integers ending with 0 and finds the longest subsequence
 with the same number. */

public class SameNumberSubsequence_Exe22_5 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a series of numbers ending with 0: ");
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = input.nextInt();
            list.add(number);

            if (number == 0)
                break;
        }

        Map<Integer, Integer> map = new HashMap<>();

        int maxValue = 0;
        int maxKey = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                int value = map.get(list.get(i)) + 1;
                map.put(list.get(i), value);
                if (maxValue < value) {
                    maxKey = list.get(i);
                    maxValue = value;
                    index = i - value + 1;
                }
            } else map.put(list.get(i), 1);
        }

        System.out.println("The longest same number sequence starts at index " + index +
                " with " + maxKey + " values of " + map.get(maxKey));
    }
}
