package Chapter_8;

import java.util.Scanner;

public class StrictlyIdenticalArrays {
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

        if (equals(array1, array2))
            System.out.println("The two arrays are strictly identical");
        else System.out.println("The two arrays are not strictly identical");
    }

    /** Check the arrays are strictly identical */
    public static boolean equals(int[][] m1, int[][] m2) {

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j])
                    return false;
            }
        }

        return true;
    }
}
