package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 09.07.2017.
 */
public class RepeatAdditions {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTION = 15; // Number of questions
        int correctCount = 0; // Count the number of correct answer
        int count = 0;  // Count the number og questions
        long startTime = System.currentTimeMillis();
        String output = " "; // Output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTION){
            // 1. Generate tow random single-digit integers
            int number1 = 1 + (int) (Math.random() * 14);
            int number2 = 1 + (int) (Math.random() * 14);

            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = number1;
            }

            // 3. Prompt the student to answer "What is number1 - number2?"
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // 4. Grade the answer and display result
            if (number1 - number2 == answer){
                System.out.println("You are correct!");
                correctCount++; // Increase the correct answer countPosition
            }
            else System.out.println("Your answer is wrong.\n" + number1 + " - " + number2
                    + " should be " + (number1 - number2));

            // Increase the question countPosition
            count++;

            output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2
                    == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct countPosition is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
