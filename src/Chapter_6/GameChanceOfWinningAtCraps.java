package Chapter_6;

public class GameChanceOfWinningAtCraps {
    /**
     * Main method
     */
    public static void main(String[] args) {
        int chance = 0;
        for (int i = 1; i < 10000; i++) {
            if ((getResult()))
                chance++;
        }
        System.out.println(chance);
    }

    public static boolean getResult() {
        int dice1 = rolled();
        int dice2 = rolled();
        int sum = sum(dice1, dice2);
        boolean win = true;
        if (youWin7Or11(sum))
            return true;
        else if (youLose2Or3Or12(sum))
            return false;
        else {
            while (win) {
                int dice3 = rolled();
                int dice4 = rolled();
                int sum2 = dice3 + dice4;
                if (sum2 == 7) {
                    return false;
                }
                if (samePoint(sum, sum2)) {
                    return true;
                }
            }
        }
        return false;
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
