package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt(); // Read a value from the input

            if (!list.contains(value) && value != 0)
                list.add(value); // Add value if it not in the list
        } while (value != 0);

        // Display the distinct list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        for (int number: list)
            System.out.print(number + " ");
    }
}
