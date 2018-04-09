package Chapter_18;

import java.util.Scanner;

public class ComputeFibonacci {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for the Fibonacci number: ");
        int index = input.nextInt();

        // Find and display the Fibonacci number
        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
    }

    public static long fib(long index) {
        long a = 0;
        long b = 1;
        for (int i = 2; i <= index; i++) {
            long next = a + b;
            a = b;
            b = next;
        }

        return b;
    }

//    /** The method for finding the Fibonacci number */
//    public static long fib(long index) {
//        if (index == 0) // Base case
//            return 0;
//        else if (index == 1) // Base case
//            return 1;
//        else // Reduction and recursive call
//            return fib(index - 1) + fib(index - 2);
//    }

//    /** Return the Fibonacci number for the specified index */
//    public static long fib(long index) {
//        return fib(index, 1, 0);
//    }
//
//    /** Auxiliary tail-recursive method for fib */
//    private static int fib(long index, int next, int result) {
//        if (index == 0)
//            return result;
//        else return fib(index - 1, next + result, next);
//    }
}
