package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 28.05.2017.
 */
public class FinancialApplicationCompoundValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = scanner.nextDouble();
        double rate = 1 + 0.00417;

        double first = savingAmount * rate;
        double second = (first + savingAmount) * rate;
        double third = (second + savingAmount) * rate;
        double fourth = (third + savingAmount) * rate;
        double fiveth = (fourth + savingAmount) * rate;
        double sixth = (fiveth + savingAmount) * rate;

        System.out.println("After the sixth month, the account value is " + sixth);
    }
}
