package Chapter_6;

import java.util.Scanner;

public class DisplayPatterns {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number n: ");
        int n = scanner.nextInt();

        displayPattern(n);
    }

    // Method for showing pattern
    public static void displayPattern(int n) {
        int padding = n - 1;	// Holds number of whitespace
        for (int r = 1; r <= n; r++) {
            // Print padding
            for (int p = 0; p < padding; p++) {
                System.out.print("  ");
            }

            // Print numbers
            for (int i = r; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            padding--; // Decrement padding
        }
    }
}
