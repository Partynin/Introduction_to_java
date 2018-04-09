package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 12.07.2017.
 */
public class FinancialApplicationLoanAmortizationSchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Number of Years: ");
        double namberOfYears = scanner.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double rate = scanner.nextDouble();
    }
}
