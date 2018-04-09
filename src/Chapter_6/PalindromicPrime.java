package Chapter_6;

public class PalindromicPrime {
    /** Main method */
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        int count1 = 0;
        while (count < 100) {
            i++;
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i +" ");
                count++;
                count1++;
            }
            if (count1 % 10 == 0 && count1 != 0) {
                System.out.println();
                count1 = 0;
            }
        }

    }

    /** Prime number */
    public static boolean isPrime(int number) {
            boolean isPrime = true; // Is the current number prime?

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }
            return isPrime;
    }

        /** Return tru if number is a palindrome */
        public  static boolean isPalindrome(int number) {
            return number == reverse(number) ? true : false;
        }


    // Return the reversal of an integer, i.e., reverse(456) return 654
    public static int reverse(int number) {
        String s = Integer.toString(number);
        String sNew = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            sNew = sNew + s.charAt(i);
        }
        number = Integer.parseInt(sNew);

        return number;
    }
}
