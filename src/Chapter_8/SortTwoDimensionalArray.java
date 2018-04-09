package Chapter_8;

import java.util.Arrays;

public class SortTwoDimensionalArray {
    /**
     * Main method
     */
    public static void main(String[] args) {
        int[][] m = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print(" , ");
        }
        System.out.println();

        sort(m);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print(" , ");
        }
    }

    /**
     * Sort two dimensional array
     */
    public static void sort(int m[][]) {
        for (int i = 0; i < m.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = m[i][0];
            int currentMin1 = m[i][1];
            int currentMinIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (currentMin > m[j][0]) {
                    currentMin = m[j][0];
                    currentMin1 = m[j][1];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                m[currentMinIndex][0] = m[i][0];
                m[currentMinIndex][1] = m[i][1];
                m[i][0] = currentMin;
                m[i][1] = currentMin1;
            }
        }

        for (int i = 0; i < m.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = m[i][1];
            int currentMin1 = m[i][0];
            int currentMinIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (currentMin > m[j][1] && currentMin1 == m[j][0]) {
                    currentMin = m[j][1];
                    currentMin1 = m[j][0];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                m[currentMinIndex][1] = m[i][1];
                m[currentMinIndex][0] = m[i][0];
                m[i][1] = currentMin;
                m[i][0] = currentMin1;
            }
        }

    }
}