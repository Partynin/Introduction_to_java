package Chapter_19;

import java.util.ArrayList;

/** 19.3 (Distinct elements in ArrayList) Write the following method that returns a new
 ArrayList. The new list contains the non-duplicate elements from the original list.
 public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) */

public class DistinctElementInArrayList_Exe19_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("mother");
        list.add("father");
        list.add("brother");
        list.add("uncle");
        list.add("niece");
        list.add("mother");
        System.out.println("List: " + list.toString());
        System.out.println("List without duplicates: " + removeDuplicates(list));
    }

    /** The method returns a new ArrayList contains non-duplicate elements */
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!newList.contains(list.get(i)))
                newList.add(list.get(i));
        }

        return newList;
    }
}
