package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 10.07.2017.
 */
public class FindTheTowHighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = scanner.nextInt();

        int count = 0;
        String name1 = "";
        int score1 = 0;
        String name2 = "";
        int score2 = 0;

        while (number > 0) {
            count++;
            System.out.println("Enter name " + count + " student: ");
            String name = scanner1.nextLine();
            System.out.println("Enter the score " + count + " student: ");
            int score = scanner.nextInt();

            if (score1 < score) {
                name2 = name1;
                score2 = score1;
                name1 = name;
                score1 = score;
            }
            else if (score2 < score) {
                score2 = score;
                name2 = name;
            }

            number--;
        }
        System.out.printf("Student with highest score %s score = %d\n", name1, score1);
        System.out.printf("Student with second score %s score = %d", name2, score2);
    }
}
