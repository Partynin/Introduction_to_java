package Chapter_21;

import java.util.*;

/** *21.6 (Count the occurrences of numbers entered) Write a program that reads an
 unspecified number of integers and finds the one that has the most occurrences.
 The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3
 3 3 2 0, the number 3 occurred most often. If not one but several numbers have
 the most occurrences, all of them should be reported. For example, since 9 and 3
 appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported. */

public class CountTheOccurrencesOfNumbersEntered_Exe21_6 {
    /** Main method */
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter int numbers, enter end with 0: ");
        int number = input.nextInt();
        while (number != 0) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else map.put(number, 1);

            number = input.nextInt();
        }

        System.out.println("Entered numbers is " + map);

        // Get all entries into a set
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        // Get key and value from each entry
        int maxKey = 0;
        int max = 0;
        for (Map.Entry<Integer, Integer> entry: entrySet) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Max occurrence id number: " + maxKey);

        Collection<Integer> collection = new ArrayList<>();

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> pair = iterator.next();
            int value = pair.getValue();
            if (value == max) {
                collection.add(pair.getKey());
            }
        }

        System.out.println("All occurrence: " + collection);
    }
}
