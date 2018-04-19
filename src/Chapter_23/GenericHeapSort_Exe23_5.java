package Chapter_23;

import ToolKit.HeapCoamparable;

import java.util.Arrays;
import java.util.Comparator;

/** *23.5 (Generic heap sort) Write the following two generic methods using heap sort.
 The first method sorts the elements using the Comparable interface and the
 second uses the Comparator interface.
 public static <E extends Comparable<E>>
 void heapSort(E[] list)
 public static <E> void heapSort(E[] list,
 Comparator<? super E> comparator) */

public class GenericHeapSort_Exe23_5 {
    /** Main method */
    public static void main(String[] args) {
        // Test heap with Comparable interface
        String[] strings = {"C", "D", "A", "B"};
        heapSort(strings);
        System.out.println(Arrays.toString(strings));

        Integer[] list = {62, 42, 59, 32, 39, 44, 13, 22, 29, 14, 33, 30, 17, 9};
        heapSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

        System.out.println();

        // Test heap with Comparator class
        String[] strings2 = {"C", "D", "A", "B", "E"};
        heapSort(strings2);
        System.out.println(Arrays.toString(strings2));

        Integer[] list2 = {62, 42, 59, 32, 39, 44, 13, 22, 29, 14, 33, 30, 17, 9, 1, 3};
        heapSort(list2);
        for (int i = 0; i < list2.length; i++)
            System.out.print(list2[i] + " ");
    }

    /** Heap sort using Comparable interface */
    public static <E extends Comparable<E>> void heapSort(E[] list) {
        Heap<E> heap = new Heap<>();

        // Add elements to the heap
        for (int i = 0; i < list.length; i++)
            heap.add(list[i]);

        // Remove elements from the heap
        for (int i = list.length - 1; i >= 0; i--)
            list[i] = heap.remove();
    }

    /** Heap sort using Comparator class */
    public static <E> void heapSort(E[] list, Comparator<? super E> comparator) {
        HeapCoamparable<E> heap = new HeapCoamparable<>(comparator);

        // Add elements to the heap
        for (int i = 0; i < list.length; i++)
            heap.add(list[i]);

        // Remove elements from the heap
        for (int i = list.length - 1; i >= 0; i--)
            list[i] = heap.remove();
    }

    private static class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2)
                return 1;
            else if (o1 < o2)
                return -1;
            else return 0;
        }
    }
}
