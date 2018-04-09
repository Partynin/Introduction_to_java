package Chapter_6;

import java.util.Scanner;

public class FinancialApplicationComputeTheFutureInvestmentValue {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double investedAmount = scanner.nextDouble();
        System.out.print("Annual interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.println("Years       Future Value");
        for (int i = 1; i <= 30; i++) {
            System.out.printf("%d %18.2f\n", i, futureInvestmentValue(investedAmount, interestRate / 100, i));
        }
    }

    // Computes future investment value
    public static double futureInvestmentValue(double investmentAmount, double interestRate, int years) {
        double futureInvestmentValue = investmentAmount * Math.pow((1 + interestRate / 12.0), years * 12);

        return futureInvestmentValue;
    }
}
