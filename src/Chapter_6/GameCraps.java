package Chapter_6;

public class GameCraps {
    /** Main method */
    public static void main(String[] args) {
        int dice1 = rolled();
        int dice2 = rolled();
        int sum = sum(dice1, dice2);
        System.out.println("You rolled " + dice1 + " + " + dice2
        + " = " + sum);
        boolean win = true;
        if (youWin7Or11(sum)) {
            System.out.println("Ypu win");
        }
        else if (youLose2Or3Or12(sum)) {
            System.out.println("You lose");
        }
        else {
            System.out.println("point is " + sum);
        while (win) {
            int dice3 = rolled();
            int dice4 = rolled();
            int sum2 = dice3 + dice4;
            System.out.println("You rolled " + dice3 + " + " + dice4
                    + " = " + sum2);
            if (sum2 == 7) {
                System.out.println("You lose");
                break;
            }
            if (samePoint(sum, sum2)){
                System.out.println("You win");
                win = false;
            }
        }
        }
    }

    /** Rolled dice */
    public static int rolled() {
        int i = (int)(1 + (Math.random() * 5));
        return i;
    }

    /** Calculate sum */
    public static int sum(int i1, int i2) {
        int sum = i1 + i2;
        return sum;
    }

    /** Check win */
    public static boolean youWin7Or11(int sum) {
        if (sum == 7 || sum == 11)
            return true;
        else return false;
    }

    /** Check lose */
    public static boolean youLose2Or3Or12(int sum) {
        if (sum == 2 || sum == 3 || sum == 12)
            return true;
        else return false;
    }

    /** Check the same point value is rolled */
    public static boolean samePoint(int sum, int sam2) {
        if (sum == sam2)
            return true;
        else return false;
    }
}
