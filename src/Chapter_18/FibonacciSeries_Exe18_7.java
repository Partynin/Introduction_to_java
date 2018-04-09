package Chapter_18;

import java.util.Scanner;

public class FibonacciSeries_Exe18_7 {
    private static int count;

    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for the Fibonacci number: ");
        int index = input.nextInt();

        // Find and display the Fibonacci number
        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
        System.out.println("Number of times the fib method is called = " + count);
    }

    /** Return the Fibonacci number for the specified index */
    public static long fib(long index) {
        return fib(index, 1, 0);
    }

    /** Auxiliary tail-recursive method for fib */
    private static int fib(long index, int next, int result) {
        count++;
        if (index == 0)
            return result;
        else return fib(index - 1, next + result, next);
    }
}
