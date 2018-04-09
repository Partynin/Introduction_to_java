package Chapter_19;

import java.util.Arrays;

public class CheckPoint {
    public static void main(String[] args) {
        int[] array = {1, 3, 8, 9, 2, 12, 89};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortMerge(int[] arr) {
        int len = arr.length;
        if (len < 2)
            return arr;
        int middle = len / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)),
                sortMerge(Arrays.copyOfRange(arr, middle, len)));
    }

    public static int[] merge(int[] arr_1, int[] arr_2) {
        int length1 = arr_1.length, length2 = arr_2.length;
        int len = length1 + length2;
        int[] result = new int[len];
        int a = 0, b = 0; // counters of arrays
        for (int i = 0; i < len; i++) {
            if (b < length2 && a < length1) {
                if (arr_1[a] > arr_2[b]) result[i] = arr_2[b++];
                else result[i] = arr_1[a++];
            } else if (b < length2)
                result[i] = arr_2[b++];
            else result[i] = arr_2[a++];
        }
        return result;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int mid = low + ((high - low) >>> 1);
        int pivot = array[mid];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
}
