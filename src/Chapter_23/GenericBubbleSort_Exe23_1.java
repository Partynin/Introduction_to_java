package Chapter_23;

import java.util.Comparator;

/** 23.1 (Generic bubble sort) Write the following two generic methods using bubble
 sort. The first method sorts the elements using the Comparable interface and
 the second uses the Comparator interface.
 public static <E extends Comparable<E>>
 void bubbleSort(E[] list)
 public static <E> void bubbleSort(E[] list,
 Comparator<? super E> comparator) */

public class GenericBubbleSort_Exe23_1 {
    /** Main method */
    public static void main(String[] args) {
        Integer[] listInt = {2, 4, 5, 7, 8, 1, 0, 4, 10};
        bubbleSort(listInt);
        for (Integer in : listInt)
            System.out.print(in + " ");

        System.out.println();

        Integer[] listInt2 = {3, 4, 5, 1, 1, 0, 4, 8, 9, 7};
        bubbleSort(listInt2, new BubbleSortComparator());
        for (Integer in : listInt2)
            System.out.print(in + " ");
    }

    /** Generic method with using the Comparable interface */
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        boolean needNextTurn = true;
        for (int k = 1; k < list.length && needNextTurn; k++) {
            needNextTurn = false;
            for (int j = 0; j < list.length - k; j++) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextTurn = true;
                }
            }
        }
    }

    /** Generic method with using the Comparator interface */
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        for (int k = 1; k < list.length; k++) {
            for (int j = 0; j < list.length - k; j++) {
                if (comparator.compare(list[j], list[j + 1]) > 0) {
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}

class BubbleSortComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2)
            return 1;
        else if (o1 < o2)
            return -1;
        else return 0;
    }
}
