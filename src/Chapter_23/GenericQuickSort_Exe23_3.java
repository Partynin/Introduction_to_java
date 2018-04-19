package Chapter_23;

import java.util.Arrays;
import java.util.Comparator;

/** 23.3 (Generic quick sort) Write the following two generic methods using quick sort.
 The first method sorts the elements using the Comparable interface and the
 second uses the Comparator interface.
 public static <E extends Comparable<E>>
 void quickSort(E[] list)
 public static <E> void quickSort(E[] list,
 Comparator<? super E> comparator) */

public class GenericQuickSort_Exe23_3 {
    /** Main test method */
    public static void main(String[] args) {
        Integer[] integers = {3, 4, 5, 7, 8, 9, 1, 3, 1, 0};
        quickSort(integers);
        System.out.println(Arrays.toString(integers));

        String[] strings = {"D", "B", "F", "A", "C"};
        quickSort(strings, new MyComparator());
        System.out.println(Arrays.toString(strings));
    }

    private static class MyComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            if (o1.compareTo(o2) > 0)
                return 1;
            else if (o1.compareTo(o2) < 0)
                return -1;
            return 0;
        }
    }

    public static <E extends Comparable<E>> void quickSort(E[] list) {
        quickSort(list, 0, list.length - 1);
    }

    public static <E extends Comparable<E>> void quickSort(E[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    /** Partition the array list[first..last] */
    public static <E extends Comparable<E>> int partition(E[] list, int first, int last) {
        E pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward for left
            while (low <= high && list[low].compareTo(pivot) <= 0)
                low++;

            // Search backward for right
            while (low <= high && list[high].compareTo(pivot) > 0)
                high--;

            // Swap two elements in the list
            if (high > low) {
                E temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high].compareTo(pivot) >= 0)
            high--;

        // Swap pivot with list[high]
        if (pivot.compareTo(list[high]) > 0) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }
    public static <E> void quickSort(E[] list, Comparator<? super E> comparator) {
        quickSort(list, 0, list.length - 1, comparator);
    }

    public static <E> void quickSort(E[] list, int first, int last,
                                     Comparator<? super E> comparator) {
        if (last > first) {
            int pivotIndex = partition(list, first, last, comparator);
            quickSort(list, first, pivotIndex - 1, comparator);
            quickSort(list, pivotIndex + 1, last, comparator);
        }
    }

    /** Partition the array list[first..last] */
    public static <E> int partition(E[] list, int first, int last,
                                Comparator<? super E> comparator) {
        E pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward for left
            while (low <= high && comparator.compare(list[low], pivot) <= 0)
                low++;

            // Search backward for right
            while (low <= high && comparator.compare(list[high], pivot) > 0)
                high--;

            // Swap two elements in the list
            if (high > low) {
                E temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && comparator.compare(list[high], pivot) >= 0)
            high--;

        // Swap pivot with list[high]
        if (comparator.compare(pivot, list[high]) > 0) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }
}
