package Chapter_10;

import java.util.Scanner;

public class DisplayThePrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        // Find oll prime factors this number
        int factor = 2;
        while (factor <= num) {
            if (num % factor == 0) {
                stack.push(factor);
                num /= factor;
            } else {
                factor++;
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
