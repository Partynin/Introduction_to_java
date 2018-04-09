package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

import static Chapter_11.RemoveDuplicates.checkListContain;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        ArrayList<Integer> list = new ArrayList<>();

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer){
            if (checkListContain(answer, list)) {
                System.out.println("You already entered " + answer);
                answer = input.nextInt();
                continue;
            }
            else {
            System.out.print("Wrong answer. Try again. What is "
                    + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
            list.add(answer);
            }
        }

        System.out.println("You got it!");
    }
}
