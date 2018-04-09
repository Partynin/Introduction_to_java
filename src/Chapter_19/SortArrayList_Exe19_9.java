package Chapter_19;

import java.util.ArrayList;

/** 19.9 (Sort ArrayList) Write the following method that sorts an ArrayList:
 public static <E extends Comparable<E>> void sort(ArrayList<E> list) */

public class SortArrayList_Exe19_9 {
    /** Main method */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(42);
        list.add(34);
        list.add(44);
        list.add(54);
        System.out.println(list);
        sort(list);
        System.out.println("The list sort is " + list);
    }

    /** Method that sorts an ArrayList */
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            E x = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (x.compareTo(list.get(j)) > 0) {
                    E temp = x;
                    x = list.get(j);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
