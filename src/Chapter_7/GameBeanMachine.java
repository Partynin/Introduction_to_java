package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class GameBeanMachine {
    private static char[] path = new char[7];

    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numBalls = scanner.nextInt();
        System.out.print("Enter the number of slits in the bean " +
                "machine: ");
        int numSlots = scanner.nextInt();
        int[] slots = new int[numSlots];

        for (int i = 0; i < numBalls; i++) {
            computePath(path, slots, numSlots);
            displayPath(path);
        }

        displaySlots(slots, numSlots);
    }

    /** Display result path */
    public static void displayPath(char[] path){
        System.out.println(path);
    }

    /** Display result slots */
    public static void displaySlots(int[] slots, int numBalls){
        System.out.println(Arrays.toString(slots));
        for (int i = numBalls; i > 0; i--) {
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] != 0 && slots[j] >= i)
                    System.out.printf("0");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    /** Compute random path */
    public static void computePath(char[] pathBall, int[] slots, int numSlots) {
        int slotCenter = numSlots  / 2;
        for (int i = 0; i < pathBall.length; i++) {
            if ((int)(Math.random() * 2)  == 0) {
                pathBall[i] = 'L';
                slotCenter = slotCenter - 1;
                if (slotCenter < 0)
                    slotCenter = slotCenter + 1;
            }
            else {
                pathBall[i] = 'R';
                slotCenter = slotCenter + 1;
                if (slotCenter > numSlots - 1)
                    slotCenter = slotCenter - 1;
            }
        }
        slots[slotCenter] = slots[slotCenter] + 1;
    }
}
