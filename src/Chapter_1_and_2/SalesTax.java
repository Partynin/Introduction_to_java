package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 20.05.2017.
 */
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100)/100.0);
    }
}
