package Chapter_22;

import java.util.HashMap;
import java.util.Map;

/** *22.6 (Execution time for GCD) Write a program that obtains the execution time for
 finding the GCD of every two consecutive Fibonacci numbers from the index
 40 to index 45 using the algorithms in Listings 22.3 and 22.4. */

public class ExecutionTimeForGCD_Exe22_6 {
    /** Main method */
    public static void main(String[] args) {
        Map<Integer, Long> GCDMap = new HashMap<>();
        Map<Integer, Long> GCDEuclidMap = new HashMap<>();

        for (int i = 40; i < 46; i++) {
            int fib1 = getFibonacci(i);
            int fib2 = getFibonacci(i + 1);

            long startTime = System.currentTimeMillis();
            GCD.gcd(fib1, fib2);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            GCDMap.put(i, executionTime);

            startTime = System.currentTimeMillis();
            GCDEuclid.gcd(fib1, fib2);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            GCDEuclidMap.put(i, executionTime);
        }

        System.out.println("                         |  40     41     42     43     44     45");
        System.out.println("------------------------------------------------------------------");
        System.out.print("Listing 22.3 GCD         | ");
        for (Map.Entry<Integer, Long> entry : GCDMap.entrySet()) {
            long value = entry.getValue();
            System.out.print(value + "   ");
        }
        System.out.print("\nListing 22.4 GCDEuclid   |  ");
        for (Map.Entry<Integer, Long> entry : GCDEuclidMap.entrySet()) {
            long value = entry.getValue();
            System.out.print(value + "      ");
        }
    }

    /** Get Fibonacci number */
    private static int getFibonacci(int index) {
        int a = 0;
        int b = 1;
        int c = 1;

        if (index == 0)
            return a;
        if (index == 1)
            return b;
        if (index == 2)
            return c;

        for (int i = 3; i <= index; i++) {
            a = b;
            b = c;
            c = a + b;
        }

        return c;
    }
}
