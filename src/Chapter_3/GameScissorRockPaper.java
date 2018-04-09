package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 13.06.2017.
 */
public class GameScissorRockPaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = scanner.nextInt();

        int computer = (int)(Math.random() * 3);

        if (player == 0 && computer == 0)
            System.out.println("The computer is scissor. You are scissor. It is a draw.");
        else if (player == 1 && computer == 1)
            System.out.println("The computer is rock. You are rock. It is a draw.");
        else if (player == 2 && computer == 2)
            System.out.println("The computer is paper. You are paper. It is a draw.");
        else if (player == 1 && computer == 0)
            System.out.println("The computer is scissor. You are rock. You won.");
        else if (player == 2 && computer == 1)
            System.out.println("The computer is rock. You are paper. You won.");
        else if (player == 0 && computer == 2)
            System.out.println("The computer is paper. You are scissor. You won.");
        else if (player == 0 && computer == 1)
            System.out.println("The computer is rock. You are scissor. You lose.");
        else if (player == 1 && computer == 2)
            System.out.println("The computer is paper. You are rock. You lose.");
        else if (player == 2 && computer == 0)
            System.out.println("The computer is scissor. You are paper. You lose.");
    }
}
