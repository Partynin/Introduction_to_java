package Chapter_8;

import java.util.Scanner;

public class GameConnectFour {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[6][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (j * 9) + i + 100;
            }
        }

       do {
           displayBoard(array);
           System.out.print("Drop a red disk at column (0-6):");
           int dropR = scanner.nextInt();
           for (int i = array.length - 1; i > 0; i--) {
               if (array[i][dropR] != 1 && array[i][dropR] != 0) {
                   array[i][dropR] = 1;
                   break;
               }
           }

           if (PatternRecognitionFourConsecutiveEqualNumbers.isConsecutive(array)) {
               displayBoard(array);
               System.out.println("The red player won");
               break;
           }

           displayBoard(array);
           System.out.print("Drop a red disk at column (0-6):");
           int dropE = scanner.nextInt();
           for (int i = array.length - 1; i > 0; i--) {
               if (array[i][dropE] != 1 && array[i][dropE] != 0) {
                   array[i][dropE] = 0;
                   break;
               }
           }

           if (PatternRecognitionFourConsecutiveEqualNumbers.isConsecutive(array)) {
               displayBoard(array);
               System.out.println("The yellow player won");
               break;
           }

       } while (!PatternRecognitionFourConsecutiveEqualNumbers.isConsecutive(array));
    }

    /** Display the board */
    public static void displayBoard(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1)
                    System.out.print("|R");
                else if (array[i][j] == 0)
                    System.out.print("|E");
                else System.out.print("| ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------------");
        System.out.println(" 0 1 2 3 4 5 6 ");
    }
}
