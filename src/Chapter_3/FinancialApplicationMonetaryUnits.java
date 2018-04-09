package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 12.06.2017.
 */
public class FinancialApplicationMonetaryUnits {
        public static void main(String[] args){
            // Create a Scanner
            Scanner input = new Scanner(System.in);

            // Receive the amount
            System.out.print(
                    "Enter an amount in double, for example 11.56: ");
            double amounte = input.nextDouble();

            int remainingAmount = (int)(amounte * 100);

            // Find the number of one dollars
            int numberOfOneDollars = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;

            //Find the number of quarters in the remaining amount
            int numberOfQuarters = remainingAmount / 25;
            remainingAmount = remainingAmount % 25;

            // find the number of dimes in the remaining amount
            int numberOfDimes = remainingAmount / 10;
            remainingAmount = remainingAmount % 10;

            // Find the number of nickels in the remaining amount
            int numberOfNickels = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;

            // Find the number of pennies in the remaining amount
            int numberOfPennies = remainingAmount;

            // Display results
            System.out.println("Yore amount " + amounte + " consists of");
            if (numberOfOneDollars == 0){
            }
            else if (numberOfOneDollars == 1)
                System.out.println("    " + numberOfOneDollars + " dollar");
            else if (numberOfOneDollars > 1)
                System.out.println("    " + numberOfOneDollars + " dollars");
            if (numberOfQuarters == 0){
            }
            else if (numberOfQuarters == 1)
                System.out.println("    " + numberOfQuarters + " quarter");
            else if (numberOfQuarters > 1)
                System.out.println("    " + numberOfQuarters + " quarters");
            if (numberOfDimes == 0){
            }
            else if (numberOfDimes == 1)
                System.out.println("    " + numberOfDimes + " dime");
            else if (numberOfDimes > 1)
                System.out.println("    " + numberOfDimes + " dimes");
            if (numberOfNickels == 0){
            }
            else if (numberOfNickels == 1)
                System.out.println("    " + numberOfNickels + " nickel");
            else if (numberOfNickels > 1)
                System.out.println("    " + numberOfNickels + " nickels");
            if (numberOfPennies == 0){
            }
            else  if (numberOfPennies == 1)
                System.out.println("    " + numberOfPennies + " pennie");
            else if (numberOfPennies > 1)
                System.out.println("    " + numberOfPennies + " pennies");
        }
}
