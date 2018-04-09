package Chapter_7;

import java.util.Scanner;

public class PrintDistinctNumbers {
    private static int[] list = new int[10];
    private static int[] list2 = new int[10];

    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
            if (isNew(list2, list[i])) {
                list2[count] = list[i];
                count++;
            }
        }
        System.out.println("The number of distinct number " +
                "is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(list2[i] + " ");
        }
    }

    /** Check it is new number */
    public static boolean isNew(int[] list, int number) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == number)
                return false;
        }
        return true;
    }
}
