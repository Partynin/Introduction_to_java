package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedLists {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int firstNum = scanner.nextInt();
        int[] list1 = new int[firstNum + 1];
        list1[0] = firstNum;
        for (int i = 1; i < list1.length; i++) {
            list1[i] = scanner.nextInt();
        }

        System.out.print("Enter list2: ");
        int firstNum2 = scanner.nextInt();
        int[] list2 = new int[firstNum2 + 1];
        list2[0] = firstNum2;
        for (int i = 1; i < list2.length; i++) {
            list2[i] = scanner.nextInt();
        }

        System.out.print("The merged list is ");
        System.out.println(Arrays.toString(merge(list1, list2)));
    }

    /** The method merges two sorted lists into a new sorted list */
    public static int[] merge(int[] list1, int[] list2) {
        int[] listMerge = new int[list1.length + list2.length - 2];

        for (int i = 1; i < list1.length; i++) {
           listMerge[i - 1] = list1[i];
        }

        for (int i = 1; i < list2.length; i++) {
            listMerge[(list1.length - 2) + i] = list2[i];
        }

        Arrays.sort(listMerge);

        return listMerge;
    }
}
