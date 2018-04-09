package Chapter_22;

import java.util.*;

/** *22.1 (Maximum consecutive increasingly ordered substring) Write a program that
 prompts the user to enter a string and displays the maximum consecutive
 increasingly ordered substring. Analyze the time complexity of your program. */

public class MaximumConsecutiveIncreasingly_Exe22_1 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        char[] chars = s.toCharArray();

        List<String> array = new ArrayList<String>();

        String substring = "";
        for (int i = 0; i < chars.length; i++) {
            substring += chars[i];
            if (i != chars.length - 1)
            if (chars[i] > chars[i + 1]) {
                array.add(substring);
                substring = "";
            }
        }

        if (substring != "")
            array.add(substring);

        LengthStringArrayListComparator comparator = new LengthStringArrayListComparator();
        System.out.println(Collections.max(array, comparator));
        /** The time complexity O(n) */
    }
}

/** Comparator need for finding string by it length */
class LengthStringArrayListComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length())
            return -1;
        else if (o1.length() == o2.length())
            return 0;
        else return 1;
    }
}
