package Chapter_19;

import java.util.ArrayList;

/** 19.8 (Shuffle ArrayList) Write the following method that shuffles an ArrayList:
 public static <E> void shuffle(ArrayList<E> list) */

public class ShuffleArrayList_Exe19_8 {
    /** Main method */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        shuffle(list);
        System.out.println("Randomly shuffles ArrayList is " + list);
    }

    /** The method shuffles an ArrayList */
    public static <E> void shuffle(ArrayList<E> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            E temp = list.get(i);
            int random = (int)( i + Math.random() * (list.size() - i));
            list.set(i, list.get(random));
            list.set(random, temp);
        }
    }
}
