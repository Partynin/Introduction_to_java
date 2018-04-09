package Chapter_7;

import java.util.Scanner;

public class ComputingGcd {

        private static int[] array = new int[5];

        /** Main method */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter five integers
            System.out.print("Enter five integer: ");

            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }

            System.out.println("Max is " + getMin(array));
            System.out.println("The greatest common divisor is " + gcd(array));
        }

        /**  greatest common divisor */
        public static int gcd(int... numbers) {
            int gcd = 1;
            int count = 1;
            int count2 = 0;
            while (count < getMin(numbers)) {

                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % count == 0) {
                        count2++;
                    }
                }

                if (count2 == numbers.length - 1)
                    gcd = count;

                count++;
                count2 = 0;
            }

            return gcd;
        }

        /** Find max */
        public static int getMin(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min)
                    min = array[i];
            }
            return min;
        }
    }



