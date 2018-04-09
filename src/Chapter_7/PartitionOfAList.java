package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class PartitionOfAList {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array " + Arrays.toString(array));

        System.out.println("After the partition, the list is " +
                Arrays.toString(newArray(array, partition(array))));
    }

    /** The method returns the index where the pivot is located */
    public static int partition(int[] list) {
        int indexPivot = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[0] >= list[i])
                indexPivot++;
        }

        System.out.println("Pivot " + (indexPivot - 1));

        return indexPivot - 1;
    }


    /** Create new array */
    public static int[] newArray(int[] array, int indexPivot) {
        int[] newArray = new int[array.length];
        newArray[indexPivot] = array[0];
        int count = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= newArray[indexPivot]) {
                newArray[count] = array[i];
                count++;
            }
        }

        count = count + 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > newArray[indexPivot]) {
                newArray[count] = array[i];
                count++;
            }
        }

        return newArray;
    }
}
