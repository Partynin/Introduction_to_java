package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 14.07.2017.
 */
public class GameScissorRockPaper {
    public static void main(String[] args) {
        int win1 = 0;
        int win2 = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("scissor (0), rock (1), paper (2): ");
            int player = scanner.nextInt();

            int computer = (int) (Math.random() * 3);

            if (player == 0 && computer == 0)
                System.out.println("The computer is scissor. You are scissor. It is a draw.");
            else if (player == 1 && computer == 1)
                System.out.println("The computer is rock. You are rock. It is a draw.");
            else if (player == 2 && computer == 2)
                System.out.println("The computer is paper. You are paper. It is a draw.");

            else if (player == 1 && computer == 0) {
                System.out.println("The computer is scissor. You are rock. You won.");
                win1++;
            }
            else if (player == 2 && computer == 1) {
                System.out.println("The computer is rock. You are paper. You won.");
                win1++;
            }
            else if (player == 0 && computer == 2) {
                System.out.println("The computer is paper. You are scissor. You won.");
                win1++;
            }

            else if (player == 0 && computer == 1) {
                System.out.println("The computer is rock. You are scissor. You lose.");
                win2++;
            }
            else if (player == 1 && computer == 2) {
                System.out.println("The computer is paper. You are rock. You lose.");
                win2++;
            }
            else if (player == 2 && computer == 0) {
                System.out.println("The computer is scissor. You are paper. You lose.");
                win2++;
            }
        } while (win1 < 3 && win2 < 3);

        if (win1 == 3)
            System.out.println("You Won!!!");
        else System.out.println("You Lose(((");
    }
}
