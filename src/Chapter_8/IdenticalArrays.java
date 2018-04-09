package Chapter_8;

import java.lang.reflect.Array;
import java.util.Scanner;

public class IdenticalArrays {
        /** Main method */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter list1: ");
            int[][] array1 = new int[3][3];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    array1[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Enter list2: ");
            int[][] array2 = new int[3][3];
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    array2[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    System.out.print(array1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    System.out.print(array2[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            if (equals(array1, array2))
                System.out.println("The two arrays are identical");
            else System.out.println("The two arrays are not identical");
        }

        /** Check the arrays are strictly identical */
        public static boolean equals(int[][] m1, int[][] m2) {

            sort(m1);
            sort(m2);

            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[i].length; j++) {
                    System.out.print(m1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 0; i < m2.length; i++) {
                for (int j = 0; j < m2[i].length; j++) {
                    System.out.print(m2[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[i].length; j++) {
                    if (m1[i][j] != m2[i][j])
                        return false;
                }
            }

            return true;
        }

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
        }
}
