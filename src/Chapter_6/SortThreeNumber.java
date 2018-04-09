package Chapter_6;

import java.util.Scanner;

public class SortThreeNumber {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three number: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    // Method for display sorting numbers
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double i = 0;
        if (num1 > num2) {
            i = num1;
            num1 = num2;
            num2 = i;
        }
        if (num2 > num3) {
            i = num3;
            num3 = num2;
            num2 = i;
        }
        if (num1 > num3) {
            i = num3;
            num3 = num1;
            num1 = i;
        }
        if (num1 > num2) {
            i = num1;
            num1 = num2;
            num2 = i;
        }
        System.out.println("Sort increase three numbers is " + num1 + " " + num2 + " " + num3);
    }
}
