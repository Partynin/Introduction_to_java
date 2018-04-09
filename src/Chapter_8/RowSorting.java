package Chapter_8;

import java.util.Scanner;

public class RowSorting {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row bay row: ");
        double[][] m = new double[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("The row-sorted array is");
        double[][] mSort;
        mSort = sortRows(m);
        for (int i = 0; i < mSort.length; i++) {
            for (int j = 0; j < mSort[i].length; j++) {
                System.out.print(mSort[i][j] + " ");
            }
            System.out.println();
        }
    }

    /** Sort the rows in a two dimensional array */
    public static double[][] sortRows(double[][] m) {
        double[][] mSort = new double[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                mSort[i][j] = m[i][j];
            }
        }

        for (int i = 0; i < mSort.length; i++) {
            for (int j = 0; j < mSort[i].length; j++) {
                // Find the minimum in the list[i..list.length-1]
                double currentMin = mSort[i][j];
                int currentMinIndex = i;

                for (int k = i + 1; k < mSort.length; k++) {
                    if (currentMin > mSort[i][k]) {
                        currentMin = mSort[i][k];
                        currentMinIndex = k;
                        }
                    }

                // Swap list[i] with list[currentMinIndex] if necessary
                if (currentMinIndex != i) {
                    mSort[i][currentMinIndex] = mSort[i][j];
                    mSort[i][j] = currentMin;
                     }
            }
        }

        return mSort;
    }
}
