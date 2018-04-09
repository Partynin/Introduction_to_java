package Chapter_8;

import java.util.Scanner;

public class SumElementsColumnByColumn {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");

        double[][] matrix = new double[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of the elements at column " +
            i + " is " + sumColumn(matrix, i));
        }
    }

    /** Returns the sum jof all the elements in a specified
     * column in a matrix
     */
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            sum = sum + m[i][columnIndex];
        }

        return sum;
    }
}
