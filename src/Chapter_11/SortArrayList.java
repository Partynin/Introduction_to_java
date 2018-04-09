package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }

        sort(list);
        System.out.println(list.toString());
    }

    /** Method that sorts an ArrayList of numbers */
    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1 + i; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
