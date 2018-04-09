package Chapter_21;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * *21.15 (Addition quiz) Rewrite Programming Exercise 11.16 to store the answers in a
 * set rather than a list.
 */

public class AdditionQuiz_Exe21_15 {
    /** Main method */
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        Set<Integer> list = new HashSet<>();

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer){
            if (list.contains(answer)) {
                System.out.println("You already entered " + answer + " try again!");
                answer = input.nextInt();
                continue;
            }
            else {
                list.add(answer);
                System.out.print("Wrong answer. Try again. What is "
                        + number1 + " + " + number2 + "? ");
                answer = input.nextInt();
            }
        }

        System.out.println("You got it!");
    }
}
