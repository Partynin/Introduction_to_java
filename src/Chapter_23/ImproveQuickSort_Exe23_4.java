package Chapter_23;

/** 23.4 (Improve quick sort) The quick sort algorithm presented in the book selects the
 first element in the list as the pivot. Revise it by selecting the median among the
 first, middle, and last elements in the list. */

import java.util.Arrays;

public class ImproveQuickSort_Exe23_4 {
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    public static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    private static int getPivot(int[] list, int first, int last) {
        if (first - last > 1) {
            int medium = list[last + (last - first) / 2];
            int begin = list[first];
            int end = list[last];
            int[] temp = {begin, medium, end};
            Arrays.sort(temp);
            return temp[1];
        }

        return list[first];
    }

    /** Partition the array list[first..last] */
    public static int partition(int[] list, int first, int last) {
        // Choose the middle element as the pivot among
        // first, medium, last
        int pivot = getPivot(list, first, last);
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward for left
            while (low <= high && list[low] <= pivot) {
                low++;
            }

            // Search backward for right
            while (low <= high && list[high] > pivot) {
                high--;
            }

            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot)
            high--;

        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }

    /** A quick sort test method */
    public static void main(String[] args) {
        int[] list = {2, 22, 2, 5, -3, 55, 4, 49};
        quickSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
