package Chapter_8;

import java.util.Scanner;

public class SumTheMajorDiagonalInAMatrix {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");

        double[][] matrix = new double[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Sum of the elements in the major diagonal " +
                "is " + sumMajorDiagonal(matrix));

    }

    /** That method sums all the numbers in the major diagonal
     * in an n * n matrix
     */
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            sum = sum + m[i][i];
        }

        return sum;
    }
}
