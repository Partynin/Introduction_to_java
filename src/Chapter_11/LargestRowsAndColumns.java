package Chapter_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestRowsAndColumns {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int size = scanner.nextInt();
        System.out.println("The random array is ");
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }

        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> column = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp = temp + array[i][j];
            }
            row.add(temp);
            temp = 0;
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp = temp + array[j][i];
            }
            column.add(temp);
            temp = 0;
        }

        System.out.println(row.toString());
        System.out.println(column.toString());
        System.out.println("The largest row index: " + getMaxIndexes(row));
        System.out.println("The largest column index: " + getMaxIndexes(column));
    }

    public static String getMaxIndexes(ArrayList<Integer> list) {
        String s = "";
        int max = Collections.max(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                s = s + i + ", ";
            }
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }
}
