package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicates {
    private static int[] list = new int[10];
    private static int[] list2 = new int[10];

    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");


        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.print("The distinct numbers are: " + Arrays.toString(eliminateDuplicates(list)));

    }

    /** Check it is new number */
    public static boolean isNew(int[] list, int number) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == number)
                return false;
        }
        return true;
    }
    /** Returns a new array  with no duplicate values */
    public static int[] eliminateDuplicates(int[] list) {

        int count = 0;

        for (int i = 0; i < list.length; i++) {
            if (isNew(list2, list[i])) {
                list2[count] = list[i];
                count++;
            }
        }
        int[] newList = new int[count];
        System.arraycopy(list2,0,newList,0,count);
        return newList;
    }

}
