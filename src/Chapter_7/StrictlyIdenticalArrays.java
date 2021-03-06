package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class StrictlyIdenticalArrays {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int number1 = scanner.nextInt();
        int[] list1 = new int[number1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(list1));

        System.out.print("Enter list2: ");
        int number2 = scanner.nextInt();
        int[] list2 = new int[number2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(list2));

        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        }
        else System.out.println("Two lists are not strictly identical");

        System.out.println(equals(list1, list2));
    }

    /** Check the arrays are strictly identical */
    public static boolean equals(int[] list1, int[] list2) {
        if (Arrays.equals(list1, list2))
            return true;
        else return false;
    }
}
