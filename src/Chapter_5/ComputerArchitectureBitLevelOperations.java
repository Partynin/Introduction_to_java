package Chapter_5;

import java.util.Scanner;

public class ComputerArchitectureBitLevelOperations {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("The 16 bits are ");

        for (int i = 15; i >= 0; i--) {
            System.out.print((number >> i) & 1);
        }
    }
}
