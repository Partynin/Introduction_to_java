package Chapter_20;

import java.util.Iterator;
import java.util.LinkedList;

/** 20.6 (Use iterators on linked lists) Write a test program that stores 5 million integers
 in a linked list and test the time to traverse the list using an iterator vs. using
 the get(index) method. */

public class UseIteratorsOnLinkedLists_Exe20_6 {
    /** Main method */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.addLast((int)(Math.random() * Integer.MAX_VALUE));
        }

        Iterator<Integer> iterator = list.iterator();

        long startTime, endTime, timeConsumedMillis;
        startTime = System.currentTimeMillis(); // Start time

        while (iterator.hasNext()) {
            int x = iterator.next();
        }

        endTime = System.currentTimeMillis(); // End time
        timeConsumedMillis = endTime - startTime;
        System.out.println("Elapsed time for iterator is: "
                + timeConsumedMillis);


        startTime = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
        }

        endTime = System.currentTimeMillis();
        timeConsumedMillis = endTime - startTime;
        System.out.println("Elapsed time for get(index) is: " + timeConsumedMillis);
    }
}
