package Chapter_7;

import java.util.Scanner;

public class PatternRecognitionConsecutiveFourEqualNumbers {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int numValues = scanner.nextInt();
        int[] array = new int[numValues];
        System.out.print("Enter the values: ");
        for (int i = 0; i < numValues; i++) {
            array[i] = scanner.nextInt();
        }

        if (isConsecutiveFour(array))
            System.out.println("The list has consecutive fours");
        else System.out.println("The list has no consecutive fours");
    }

    /** Tests whether the array has four consecutive numbers */
    public static boolean isConsecutiveFour(int[] values) {
        boolean flag = false;
        int temper = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i] == values[j]) {
                    temper++;
                    if (temper == 4)
                        flag = true;
                }
                else {
                    temper = 0;
                }
            }
        }

        return flag;
    }
}
