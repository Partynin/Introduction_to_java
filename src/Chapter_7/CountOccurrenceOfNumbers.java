package Chapter_7;

import java.util.Scanner;

public class CountOccurrenceOfNumbers {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] list = new int[100];
    public static int[] list3 = new int[100];
    public static int[] list2;

    /** Main method */
    public static void main(String[] args) {
        System.out.print("Enter the integers between 1 and " +
                "100: ");
        fillArray();
        ReverseTheNumbersEntered.displayList(list2);
        System.out.println();
        displayOccurs(list2);
    }

    /** Write array between 1 and 100 */
    public static void fillArray() {
        int x = 1;
        int count = 0;

        do {
            list[count] = scanner.nextInt();
            x = list[count];
            count++;
        } while (x != 0);

        list2 = new int[count - 1];
        System.arraycopy(list, 0, list2, 0, count - 1);
    }

    /** Display occurrence of numbers */
    public static void displayOccurs(int[] list) {
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < list.length; i++) {
            list3[i] = list[i];
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j])
                    count++;
            }

            for (int k = 0; k < list3.length; k++) {
                if (list3[k] == list[i])
                    count2++;
            }

            if (count2 == 1) {
                if (count == 1)
                System.out.println(list[i] + " occurs " + count + " time");
                else System.out.println(list[i] + " occurs " + count + " times");
            }

            count2 = 0;
            count = 0;
        }
    }
}
