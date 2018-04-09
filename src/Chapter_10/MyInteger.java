package Chapter_10;

public class MyInteger {
    // the int value represented by this object
    private int value;

    // A constructor that creates a MyInteger object for the specified int value.
    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
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

    public static boolean isEven(MyInteger value) {
        return value.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger value) {
        return value.getValue() % 2 != 0;
    }

    /** Check whether object is prime */
    public static boolean isPrime(MyInteger number) {
        for (int divisor = 2; divisor <= number.getValue() / 2; divisor++) {
            if (number.getValue() % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger value) {
        return this.value == value.getValue();
    }

    public static int parseInt(char[] array) {
        String st = "";
        for (int i = 0; i < array.length; i++) {
            st += array[i];
        }

        int value = Integer.parseInt(st);

        return value;
    }

    public static int parseInt(String string) {
        int value = Integer.parseInt(string);
        return value;
    }
}
