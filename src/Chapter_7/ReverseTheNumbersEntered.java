package Chapter_7;

import java.util.Scanner;

public class ReverseTheNumbersEntered {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[10];
        System.out.print("Enter 10 integer: ");

        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        displayList(list);
        System.out.println();
        reversListInteger(list);
        displayList(list);
    }

    private static void reversListInteger(int[] list) {
        for (int i = 0; i < list.length / 2; i++) {
            int x = list[i];
            list[i] = list[list.length - (i + 1)];
            list[list.length - (i + 1)] = x;
        }
    }

    public static void displayList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
