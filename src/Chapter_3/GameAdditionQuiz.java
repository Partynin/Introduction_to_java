package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 12.06.2017.
 */
public class GameAdditionQuiz {
    public static void main(String[] args) {
        // 1. Generate two random single-digital integers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        //3. Prompt the student to answer "What is the number1 - number2?"
        System.out.print
                ("What is " + number1 + " + " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // 4. Grade the answer and display the result
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 +
                    " should be " + (number1 - number2));
        }
    }
}
