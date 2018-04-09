package Chapter_7;

import java.util.Scanner;

public class AssignGrades {
    public static Scanner scanner = new Scanner(System.in);

    /** Main method */
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();
        int[] list = new int[number];
        System.out.print("Enter " + number + " scores: ");

        fullArray(list);
        displayGrade(list);
    }

    /** Display grades */
    private static void displayGrade(int[] list) {
        int best = getBest(list);

        for (int i = 0; i < list.length; i++) {
            System.out.println("Student " + i + " scores is " + list[i]
            + " and grade is " + getGrades(list[i], best));
        }
    }

    /** Get the best score */
    public static int getBest(int[] list) {
        int best = list[0];
        for (int i = 1; i < list.length; i++) {
            if (best < list[i])
                best = list[i];
        }

        return best;
    }

    /** This method assigns grades */
    public static char getGrades(int score, int best) {
        char ch = 'F';
        if (score >= best - 10)
            ch = 'A';
        else if (score >= best - 20)
            ch = 'B';
        else if (score >= best - 30)
            ch = 'C';
        else if (score >= best - 40)
            ch = 'D';

        return ch;
    }

    /** Full array */
    public static void fullArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
    }
}
