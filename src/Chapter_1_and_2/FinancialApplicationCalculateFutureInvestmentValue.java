package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 02.06.2017.
 */
public class FinancialApplicationCalculateFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investment = scanner.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter number of years:");
        double years = scanner.nextDouble();

        double futureInvestmentValue = (((investment / 100) * rate) * years) + investment;

        System.out.println("Accumulated value is $" + futureInvestmentValue );
    }
}
