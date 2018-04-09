package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 13.07.2017.
 */
public class FinancialApplicationCompoundValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter the number of month: ");
        int month = scanner.nextInt();

        double account = 0;
        double pr = interestRate / 100.0 / 12.0;
        for (int i = 1; i <= month; i++) {
            account = (amount + account) * (1 + pr);
        }
        System.out.printf("Value = %.3f", account);
    }
}
