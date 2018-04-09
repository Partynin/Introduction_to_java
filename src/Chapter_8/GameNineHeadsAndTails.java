package Chapter_8;

import java.util.Scanner;

public class GameNineHeadsAndTails {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int decNumber = scanner.nextInt();

        String binaryString = Integer.toBinaryString(decNumber);

        System.out.println(binaryString);

        if (binaryString.length() < 9) {
            int x = 9 - binaryString.length();
            while (x != 0) {
                binaryString = binaryString + "0";
                x--;
            }
            binaryString = new StringBuffer(binaryString).reverse().toString();
        }

        System.out.println(binaryString);

        display(createMatrix(binaryString));
    }

    /** Display matrix */
    public static void display(int[][] matrix) {
        String[][] strMatrix = new String[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0)
                    strMatrix[i][j] = "H";
                else strMatrix[i][j] = "T";
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < strMatrix.length; i++) {
            for (int j = 0; j < strMatrix[i].length; j++) {
                System.out.print(strMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /** Create a matrix 3-by-3 */
    public static int[][] createMatrix(String binaryString) {
        int[][] matrix = new int[3][3];
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = binaryString.charAt(count) - '0';
                count++;
            }
        }

        return matrix;
    }
}
