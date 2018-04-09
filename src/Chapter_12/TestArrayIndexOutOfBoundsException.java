package Chapter_12;

import java.util.Scanner;

public class TestArrayIndexOutOfBoundsException {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        try {
            System.out.println("Enter a index of the array: ");
            System.out.println(array[scanner.nextInt()]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}
