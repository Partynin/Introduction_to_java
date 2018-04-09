package Chapter_11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElementInaArrayList {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a sequence of numbers ending with 0: ");
        int number = 0;
        do {
            number = scanner.nextInt();
            if (number != 0) {
                list.add(number);
            }
        } while (number != 0);

        System.out.println(max(list));
    }

    /** The method returns the maximum value in an ArrayList of integers */
    public static Integer max(ArrayList<Integer> list) {
        return Collections.max(list);
    }
}
