package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 13.06.2017.
 */
public class GameHeadsOrTails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a guess head-0 or tail-1: ");
        int guess = scanner.nextInt();

        int flip = (int)(Math.random() * 2);
        if (guess == flip){
            System.out.println("You are correct!");
        }
        else System.out.println("You are incorrect! (((");
    }
}
