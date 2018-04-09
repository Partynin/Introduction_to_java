package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 03.07.2017.
 */
public class FinancialApplicationMonetaryUnits {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Enter an amount, for example 11,56: ");
        String amount = input.nextLine();

        // Find the number of one dollars
        int numberOfOneDollars = Integer.parseInt(amount.substring(0, amount.indexOf(',')));

        // Find the number of cents
        int numberOfCents = Integer.parseInt(amount.substring(amount.indexOf(',') + 1));

        //Find the number of quarters
        int numberOfQuarters = numberOfCents / 25;
        numberOfCents %= 25;

        // find the number of dimes
        int numberOfDimes = numberOfCents / 10;
        numberOfCents %= 10;

        // Find the number of nickels
        int numberOfNickels = numberOfCents / 5;
        numberOfCents %= 5;



        // Display results
        System.out.println("Yore amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfCents + " pennies");
    }
}
