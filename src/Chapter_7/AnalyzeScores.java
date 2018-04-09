package Chapter_7;

import java.util.Scanner;

public class AnalyzeScores {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] list = new int[100];
    private static int[] list2;

    /** Main method */
    public static void main(String[] args) {
        System.out.print("Enter scores: ");
        fillArray();
        results(list2);
    }

    /** fill array */
    public static void fillArray() {
        int x = 0;
        int count = 0;
        do {
            list[count] = scanner.nextInt();
            x = list[count];
            count++;
        } while (x >= 0);

        list2 = new int[count - 1];
        System.arraycopy(list, 0, list2, 0, count - 1);
    }

    /** compute average */
    public static double compAverage(int[] list) {
        double average = 0;
        for (int i = 0; i < list.length; i++) {
            average += list[i];
        }

        average = average / list.length;
        System.out.println(average);
        return average;
    }

    /** Display results */
    public static void results(int[] list) {
        int above = 0;
        int equal = 0;
        int below = 0;
        double average = compAverage(list2);
        for (int i = 0; i < list.length; i++) {
            if (list[i] == average)
                equal++;
            else if (list[i] < average)
                below++;
            else above++;
        }
        System.out.println("Score above is: " + above);
        System.out.println("Score equal is: " + equal);
        System.out.println("Score below is: " + below);
    }
}
