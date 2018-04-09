package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list: ");
        int firstNumber = scanner.nextInt();
        int[] array = new int[firstNumber + 1];
        array[0] = firstNumber;
        for (int i = 1; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        if (isSorted(array))
            System.out.println("The list is already sorted");
        else System.out.println("The list is not sorted");
    }

    /** Returns true if tne list is sorted */
    public static boolean isSorted(int[] list) {
        int[] list1 = new int[list.length - 1];
        int[] list2 = new int[list.length - 1];

        System.arraycopy(list, 1, list1, 0, list1.length);
        System.arraycopy(list, 1, list2, 0, list1.length);

        Arrays.sort(list2);

        if (Arrays.equals(list1, list2))
            return true;
        else return false;
    }
}
