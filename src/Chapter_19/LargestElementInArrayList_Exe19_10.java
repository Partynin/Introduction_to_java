package Chapter_19;

import java.util.ArrayList;

/** 19.10 (Largest element in ArrayList) Write the following method that returns the largest
 element in an ArrayList:
 public static <E extends Comparable<E>> E max(ArrayList<E> list) */

public class LargestElementInArrayList_Exe19_10 {
    /** Main method */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(3);
        System.out.println(list);
        System.out.println("The largest element in list is " + max(list));
    }

    /** The method returns the largest element in an ArrayList */
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E oMax = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(oMax) > 0) {
                oMax = list.get(i);
            }
        }

        return oMax;
    }
}
