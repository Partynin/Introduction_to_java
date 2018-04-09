package Chapter_12;

import java.util.Scanner;

public class InputMismatchException {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What sum of these integers: ");
        int x = (int)(Math.random() * 10);
        int y = (int)(Math.random() * 10);
        System.out.println(x + " + " + y + " = ");

        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int reply = scanner.nextInt();
                if (reply == x + y)
                    continueInput = false;
            } catch (Exception ex) {
                System.out.println("Enter a number again the input is incorrect!");
                scanner.nextLine(); // Discard input
            }
        } while (continueInput);

        System.out.println("You are right!!!");
    }
}
