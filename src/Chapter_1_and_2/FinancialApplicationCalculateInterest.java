package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 02.06.2017.
 */
public class FinancialApplicationCalculateInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = scanner.nextDouble();
        double interestRate = scanner.nextDouble();

        double interest = balance * (interestRate / 1200);

        System.out.println("The interest rate is " + interest);
    }
}
