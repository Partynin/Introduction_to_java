package Chapter_7;

import java.util.Scanner;

public class SortStudents {


    /** Main method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();

        String[] names = new String[number];
        System.out.print("Enter the students' names: ");
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner1.nextLine();
        }

        int[] scores = new int[number];
        System.out.print("Enter their scores: ");
        for (int i = 0; i < scores.length; i ++) {
            scores[i] = scanner.nextInt();
        }

        print(names, scores);
    }

    /** Print students scores */
    public static void print(String[] names, int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            int currentMax = scores[i];
            String currentMaxName = names[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (currentMax < scores[j]) {
                    currentMax = scores[j];
                    currentMaxName = names[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                scores[currentMaxIndex] = scores[i];
                scores[i] = currentMax;
                names[currentMaxIndex] = names[i];
                names[i] = currentMaxName;
            }
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + " " + names[i]);
        }
    }
}
