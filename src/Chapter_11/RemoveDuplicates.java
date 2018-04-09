package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }

        removeDuplicate(list);
        System.out.print("The distinct integers are " + list.toString());
    }

    /** The method remove the duplicate elements from an array list of integers */
    public static void removeDuplicate(ArrayList<Integer> list) {
        int checkElement = list.get(0);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!checkListContain(list.get(i), list1))
                list1.add(list.get(i));
        }

        list.clear();
        list.addAll(list1);
    }

    /** Check contain in the list an aliment */
    public static boolean checkListContain(int element, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element)
                return true;
        }
        return false;
    }
}
