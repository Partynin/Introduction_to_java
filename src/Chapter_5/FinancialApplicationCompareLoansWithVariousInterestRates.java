package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 12.07.2017.
 */
public class FinancialApplicationCompareLoansWithVariousInterestRates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loan = scanner.nextDouble();
        System.out.print("Number of Years: ");
        int years = scanner.nextInt();
        double interestRate = 5;
        double increment = 0;
        System.out.println("Interest Rate   Monthly Payment   Total Payment");

        for (int i = 1; i <= 25; i++) {
            double monthlyPayment = (loan * (1.05 + increment)) / (years * 12);
            double totalPayment = loan * (1.05 + increment);
            System.out.printf("%.3f           %.2f            %.2f\n", interestRate +
                    increment, monthlyPayment, totalPayment);

            increment += 0.125;
        }
    }
}
