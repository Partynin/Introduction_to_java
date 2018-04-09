package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 10.07.2017.
 */
public class FindTheHighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = scanner.nextInt();

        int count = 0;
        String name1 = "";
        int score1 = 0;
        String name;
        int score = 0;
        while (number > 0) {
            count++;
            System.out.println("Enter name " + count + " student: ");
            name = scanner1.nextLine();
            System.out.println("Enter the score " + count + " student: ");
            score = scanner.nextInt();
            if (score1 < score) {
                name1 = name;
                score1 = score;
            }

            number--;
        }
        System.out.printf("Student with highest score %s score = %d", name1, score1);
    }
}
