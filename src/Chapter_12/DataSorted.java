package Chapter_12;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DataSorted {
    /** Main method */
    public static void main(String[] args) {
        File file = new File("SortedStrings.txt");

        ArrayList<String> arrayList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                arrayList.add(scanner.next());
            }
        } catch (Exception ex) {
            System.out.println("Scanner do not work!");
            System.exit(11);
        }

        System.out.println("String ing the file is increasing order: " +
                isIncreasingOrder(arrayList));
        System.out.println("strings that are out of the order: " + twoString(arrayList));
    }

    /** Reports whether the strings in the files are stored in increasing order */
    public static boolean isIncreasingOrder(ArrayList<String> arrayList) {
        for (int i = 1; i < arrayList.size(); i++) {
            String first = arrayList.get(i - 1);
            if (first.compareTo(arrayList.get(i)) >= 0) {
                return false;
            }
        }
        return true;
    }

    /** Return first two strings that are out of the order */
    public static String twoString(ArrayList<String> arrayList) {
        for (int i = 1; i < arrayList.size(); i++) {
            String first = arrayList.get(i - 1);
            if (first.compareTo(arrayList.get(i)) >= 0) {
                String s = first + " " + arrayList.get(i);
                return s;
            }
        }
        String s = "not this string";
        return s;
    }
}
