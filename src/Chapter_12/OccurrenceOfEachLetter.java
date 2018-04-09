package Chapter_12;

import java.io.File;
import java.util.Scanner;

public class OccurrenceOfEachLetter {
    private static int[][] array = new int[26][2];
    /** Main method */
    public static void main(String[] args) {
        // Fell array digital number for corresponding letters
        for (int i = 0; i < array.length; i++) {
            array[i][0] = i;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File don't exists!");
            System.exit(11);
        }

        try (
                Scanner scanner1 = new Scanner(file);
                ) {
            while (scanner1.hasNext()) {
                String s = scanner1.nextLine();
                System.out.println(s);
                computeLetters(s);
            }

        } catch (Exception es) {
            System.out.println("Scanner don't work!");
            System.exit(12);
        }

        // print number of letters
        for (int i = 0; i < array.length; i++) {
            char ch = (char) (array[i][0] + 65); // Cast number to uppercase letter
            System.out.println("Number of " + ch + "'s: " +
                    array[i][1]);
        }
    }

    /** Compute letters for the string */
    public static void computeLetters(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 65; j <= 90; j++) {
                if (Character.toUpperCase(s.charAt(i)) == j) {
                    array[j - 65][1] += 1;
                }
            }
        }
    }
}
