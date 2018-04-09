package Chapter_18;

import java.util.Scanner;

public class FindTheLargestNumberInAnArray_Exe18_13 {
    public static void main(String[] args) {
        System.out.println("Enter a list of eight number in array: ");
        Scanner input = new Scanner(System.in);
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("The largest number is " + largestInteger(array));
    }

    public static int largestInteger(int[] list) {
        return largestInteger(list, 0, list.length - 1);
    }

    public static int largestInteger(int[] list, int low, int high) {
        if (low < high) {
            // Find the smallest number and its index in list[low .. high]
            int indexOfMin = low;
            int min = list[low];
            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }


            // Swap the smallest in list[low .. high] with list[low]
            list[indexOfMin] = list[low];
            list[low] = min;

            // Sort the remaining list[low+1 .. high[
            largestInteger(list, low + 1, high);
        }
        return list[high];
    }
}
