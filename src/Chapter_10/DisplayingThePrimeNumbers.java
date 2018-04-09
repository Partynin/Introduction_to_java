package Chapter_10;

public class DisplayingThePrimeNumbers {
    /** Main method */
    public static void main(String[] args) {
        int number = 2;
        // Create a stack
        StackOfIntegers stack = new StackOfIntegers();

        // Full the stack
        while (number <= 120) {
            if (isPrime(number))
                stack.push(number);

            number++;
        }

        // Display the stack
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }
}
