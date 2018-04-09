package Chapter_8;

import java.util.Scanner;

public class PatternRecognitionFourConsecutiveEqualNumbers {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(isConsecutive(array));
    }

    /** Tests whether a two-dimensional array has four consecutive numbers */
    public static boolean isConsecutive(int[][] values) {
        boolean flag = false;

        // Check rows
        for (int i = 0; i < values.length; i++) {
            int count = 0;
            int first = values[i][0];
            for (int j = 0; j < values[i].length; j++) {
                if (first == values[i][j]) {
                    count++;
                }
                else {
                    first = values[i][j];
                    count = 1;
                }
                if (count == 4) {
                    flag = true;
                    break;
                }
            }
        }

        // Check columns
        for (int i = 0; i < values[0].length; i++) {
            int count = 0;
            int first = values[0][i];
            for (int j = 0; j < values.length; j++) {
                if (first == values[j][i]) {
                    count++;
                }
                else {
                    first = values[j][i];
                    count = 1;
                }
                if (count == 4) {
                    flag = true;
                    break;
                }
            }
        }

        // Check major diagonals
        for (int i = 0; i < values.length; i++) {
            int first = values[i][0];
            int count = 0;
            if (i >= 3) {
                for (int j = 0; j <= i; j++) {
                    if (first == values[i - j][j]) {
                        count++;
                    }
                    else {
                        first = values[i - j][j];
                        count = 1;
                    }
                    if (count == 4) {
                        flag = true;
                        break;
                    }
                }

            }
        }
        for (int i =  values[0].length - 1; i > 0; i--) {
            int first = values[values.length - 1][i];
            int count = 0;
            if (i <= values[0].length - 4) {
                for (int j = 0; j <= values.length - i; j++) {
                    if (first == values[values.length - 1 - j][i + j]) {
                        count++;
                    }
                    else {
                        first = values[values.length - 1 - j][i + j];
                        count = 1;
                    }
                    if (count == 4) {
                        flag = true;
                        break;
                    }
                }

            }
        }

        // Check sub-diagonals
        for (int i = 0; i < values.length - 3; i++) {
            int first = values[0][i];
            int count = 0;

                for (int j = 0; j < values.length - i; j++) {
                    if (first == values[i + j][j]) {
                        count++;
                    }
                    else {
                        first = values[i + j][j];
                        count = 1;
                    }
                    if (count == 4) {
                        flag = true;
                        break;
                    }
                }
        }
        for (int i = 1; i < values[0].length - 4; i++) {
            int first = values[0][i];
            int count = 0;

            for (int j = 0; j < values.length - i; j++) {
                if (first == values[j][j + i]) {
                    count++;
                }
                else {
                    first = values[j][j + i];
                    count = 1;
                }
                if (count == 4) {
                    flag = true;
                    break;
                }
            }
        }

        return flag;
    }
}
