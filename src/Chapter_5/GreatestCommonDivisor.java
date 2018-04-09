package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 07.07.2017.
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter tow integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd = 1; // Initial gcd is 1
        /*int k = 2; // Possible gcd
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k ==0)
                gcd = k; // Update gcd
            k++;
        }*/
        System.out.println((n1 / 2) + " " + (n2 / 2));

        for (int k = 2; k <= n1 / 2 && k <= n2 / 2; k++) {
            if (n1 % k ==0 && n2 % k == 0)
                gcd = k;
        }

        System.out.println("The greatest common divisor for " + n1 + " and " +
        n2 + " is " +gcd);
    }
}
