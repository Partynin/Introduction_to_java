package Chapter_8;

import java.util.Scanner;

public class GamePlayATicTacToeGame {
    private static Scanner scanner = new Scanner(System.in);

    /** Main method */
    public static void main(String[] args) {

        String[][] playerMoves = new String[3][3];
        for (int i = 0; i < playerMoves.length; i++) {
            for (int j = 0; j < playerMoves[i].length; j++)
                playerMoves[i][j] = " ";
        }

        while (isGameEnd(playerMoves)) {
            enterXToken(playerMoves);
            if (!isGameEnd(playerMoves))
                break;
            interOToken(playerMoves);
        }
    }

    public static void drawField(String[][] playerMoves) {
        for (int i = 0; i < playerMoves.length; i++) {
            System.out.println("---------------");
            for (int j = 0; j < playerMoves[i].length; j++) {
                System.out.printf(" | " + playerMoves[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("---------------");
    }

    public static void enterXToken(String[][] playerMoves) {
        drawField(playerMoves);
        System.out.print("Enter a row (0, 1, or 2) for player X:");
        int axisX = scanner.nextInt();
        System.out.print("Enter a column (0, 1, or 2) for player X:");
        int axisY = scanner.nextInt();

        playerMoves[axisX][axisY] = "X";
    }

    public static void interOToken(String[][] playerMoves) {
        drawField(playerMoves);
        System.out.print("Enter a row (0, 1, or 2) for player O:");
        int axisX = scanner.nextInt();
        System.out.print("Enter a column (0, 1, or 2) for player O:");
        int axisY = scanner.nextInt();

        playerMoves[axisX][axisY] = "O";
    }

    public static boolean isGameEnd(String[][] playerMoves) {
        boolean result = true;

        if (isGameWin(playerMoves))
            result = false;
        if (isGameDraw(playerMoves))
            result = false;

        return result;
    }

    public static boolean isGameWin(String[][] playerMoves) {
        boolean flag = false;
        String space = " ";

        int count2 = 0;
        for (int i = 0; i < playerMoves.length; i++) {
            String first = playerMoves[i][0];
            if (first.equals(space))
                break;
            for (int j = 0; j < playerMoves[i].length; j++) {
                if (first.equals(playerMoves[i][j]))  {
                    flag = true;
                    count2++;
                    System.out.println("count2 " + count2);
                }
                else flag = false;
            }
            if (flag == true && count2 == 5) {
                drawField(playerMoves);
                System.out.println(first + " player won 1");
                break;
            }
        }

        int count3 = 0;
        for (int i = 0; i < playerMoves.length; i++) {
            String first = playerMoves[0][i];
            if (first.equals(space))
                break;
            for (int j = 0; j < playerMoves[i].length; j++) {
                if (first.equals(playerMoves[j][i])) {
                    flag = true;
                    count3++;
                }
                else flag = false;
            }
            if (flag == true && count3 == 5) {
                drawField(playerMoves);
                System.out.println(first + " player won 2");
                break;
            }
        }

        int count = 0;
        for (int i = 0; i < playerMoves.length - 1; i++) {
            String first = playerMoves[i][i];

            if (first.equals(space))
                break;

                if (first.equals(playerMoves[i + 1][i + 1])) {
                    flag = true;
                    count++;
                }
                else flag = false;

            if ((flag == true) && (2 == count)) {
                drawField(playerMoves);
                System.out.println(first + " player won 3");
                break;
            }
        }

        int count1 = 0;
        for (int i = 0; i < playerMoves.length - 1; i++) {
            String first = playerMoves[i][2 - i];

            if (first.equals(space))
                break;

            if (first.equals(playerMoves[1 + i][1 - i])) {
                flag = true;
                count1++;
            }
            else flag = false;

            if ((flag == true) && (2 == count1)) {
                drawField(playerMoves);
                System.out.println(first + " player won 4");
                break;
            }
        }

        return flag;
    }

    public static boolean isGameDraw(String[][] playerMoves) {
        boolean flag = false;
        int count = 0;

        for (int i = 0; i < playerMoves.length; i++) {
            for (int j = 0; j < playerMoves[i].length; j++) {
                if (playerMoves[i][j].equals(" "))
                    count++;
            }
        }

        if (count == 0) {
            flag = true;
            System.out.println("Draw!!!");
        }

        return flag;
    }
}
