package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 13.07.2017.
 */
public class FinancialApplicationComputeCDValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter yield: ");
        double yield = scanner1.nextDouble();

        System.out.print("Enter number of months: ");
        int months = scanner1.nextInt();

        double CD = amount;
        double rt = yield / 1200.0;
        System.out.println("Month   CD Value");
        for (int i = 1; i <= months; i++) {
            CD = CD + CD * rt;

            System.out.printf("%-8d%.2f\n", i, CD);
        }
    }
}
