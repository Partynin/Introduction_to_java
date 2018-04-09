package Chapter_18;

import java.util.Scanner;

public class SumTheDigitsInAnIntegerUsingRecursion_Exe18_11 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("The sum of digits in an integer " + n + " is " + sumDigits(n));
    }

    public static int sumDigits(int n) {
       if (n == 0)
           return n;
       else return n % 10 + sumDigits(n / 10);
    }
}
