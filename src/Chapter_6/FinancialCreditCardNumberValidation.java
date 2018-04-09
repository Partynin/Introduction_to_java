package Chapter_6;

import java.util.Scanner;

public class FinancialCreditCardNumberValidation {
    public static final int PREFIX_VISA = 4;
    public static final int PREFIX_MASTER = 5;
    public static final int PREFIX_AMERICAN_XP = 37;
    public static final int PREFIX_DISCOVERS = 6;

    static int[] prefixes = new int[] {
            PREFIX_VISA, PREFIX_MASTER, PREFIX_AMERICAN_XP, PREFIX_DISCOVERS
    };

    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit cart number as a long integer: ");
        long number = scanner.nextLong();

        if (isValid(number))
            System.out.println(number + " is valid");
        else System.out.println(number + " is invalid");
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {

        if (getSize(number) > 16 || getSize(number) < 13) return false;

        for (int i = 0; i < prefixes.length; i++) {
            if (getPrefix(number, prefixes[i]) == prefixes[i]) break; // prefix math
            if (i < prefixes.length - 1) return false; // no prefix return false
        }

        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return sum % 10 == 0;
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sumEvenDouble = 0;
        String s = Long.toString(number);
        for (int i = s.length() - 2; i >= 0; i = i - 2) {
            sumEvenDouble = sumEvenDouble + getDigit(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        return sumEvenDouble;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number) {
        int digit = 0;
        digit = number * 2;
        if (digit >= 10) {
            digit = (digit % 10) + (digit / 10);
            return digit;
        }
        return digit;
    }

    /**Return sum of odd-place digit in number */
    public static int sumOfOddPlace(long number) {
        int sumOdd = 0;
        String s = Long.toString(number);
        for (int i = s.length() - 1; i >= 0; i = i - 2) {
            sumOdd = sumOdd + Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        return sumOdd;
    }

    /** Return true if the digit d is a prefix for number */
    public  static boolean prefixMatched(long number, int d) {

        if (d > number) return false;

        long difference = (getSize(number) - getSize(d));

        return d == (int)(number / Math.pow(10, difference));
    }

    /** Return the number of a digits in d */
    public static int getSize(long d) {
        int size = 0;
        while (d > 0) {
            size++;
            d /= 10;
        }

        return size;
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        if (prefixMatched(number, k)) return k;

        return number;
    }
}
