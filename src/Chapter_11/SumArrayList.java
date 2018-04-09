package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        System.out.print("Enter five numbers: ");

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextDouble());
        }

        System.out.println("Sum of number = " + sum(list));
    }

    /** The method returns the sum of all numbers in an ArrayList */
    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }
}
