package Chapter_6;

import java.util.Scanner;

public class DisplayMatrixOf0sAnd1s {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        printMatrix(n);

    }

    /** Method for print matrix n-by-n */
    public static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
                for (int j  = 1; j <= n; j++) {
                    System.out.printf("%d ", (int)(Math.random() * 2));
            }
            System.out.println();
        }
    }
}
