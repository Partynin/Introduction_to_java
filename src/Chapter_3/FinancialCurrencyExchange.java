package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 19.06.2017.
 */
public class FinancialCurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        double convert = scanner.nextDouble();

        if (convert == 0){
            System.out.print("Enter the dollar amount: ");
            double amount = scanner.nextDouble();
            double RMB = amount * rate;
            System.out.println("$" + amount + " is " + RMB + " yuan");
        }
        else if (convert == 1){
            System.out.print("Enter the RMB amount: ");
            double amount = scanner.nextDouble();
            double RMB =(amount / rate);
            System.out.println(amount + " yuan is " + "$" + RMB);
        }
        else System.out.println("Incorrect input");
    }
}
