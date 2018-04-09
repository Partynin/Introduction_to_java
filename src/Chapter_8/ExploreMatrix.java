package Chapter_8;

import java.util.Scanner;

public class ExploreMatrix {
    private static int[][] matrix;

    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size the matrix: ");
        int size = scanner.nextInt();
        matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        checkRow();
        checkColumn();
        checkMajDiagonal();
        checkSubDiagonal();
    }

    /** All same numbers on row */
    public static void checkRow() {
        int event = 0;

        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][0];
            boolean flag = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (temp != matrix[i][j]) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("All " + temp + "s on row " + i);
                event++;
            }
        }

        if (event == 0)
            System.out.println("No same numbers on a row");
    }

    /** All same numbers on column */
    public static void checkColumn() {
        int event = 0;

        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[0][i];
            boolean flag = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (temp != matrix[j][i]) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("All " + temp + "s on column " + i);
                event++;
            }
        }

        if (event == 0)
            System.out.println("No same numbers on a column");
    }

    /** All same numbers on the major diagonal */
    public static void checkMajDiagonal() {
        boolean flag = true;
        int temp = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            if (temp != matrix[i][i]) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("All " + temp + "s on major diagonal");
        }

        if (!flag)
            System.out.println("No same numbers on the major diagonal");
    }

    /** All same number on the sub-diagonal */
    public static void checkSubDiagonal() {
        boolean flag = true;
        int temp = matrix[0][matrix.length - 1];

        for (int i = 0; i < matrix.length; i++) {
            if (temp != matrix[i][matrix.length - (i + 1)]) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("All " + temp + "s on sub-diagonal");
        }

        if (!flag)
            System.out.println("No same numbers on the sub-diagonal");
    }
}
