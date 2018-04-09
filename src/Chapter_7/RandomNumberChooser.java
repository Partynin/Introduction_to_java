package Chapter_7;

import java.util.Scanner;

public class RandomNumberChooser {

    /** Main method */
    public static void main(String[] args) {
        System.out.println(getRandom(1,2,3,4,5,6,7,8,9,10, 11, 12, 13, 14, 14 ));
    }

    /** Chooser random number */
    public static int getRandom(int... numbers) {
        boolean flag = false;
        int ranNum = 0;

        do {
            flag = false;
            ranNum = 1 + (int) (Math.random() * 53);
            for (int i = 0; i < numbers.length; i++) {
                if (ranNum == numbers[i])
                    flag = true;
            }
        } while (flag);

        return ranNum;
    }
}
