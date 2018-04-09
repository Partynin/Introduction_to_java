package Chapter_6;

import java.util.Scanner;

public class FormatAnInteger {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter width of format: ");
        int width = scanner.nextInt();

        System.out.println("Format is " + format(number, width));
    }

    /** Method return format integer */
    public static String format(int number, int width) {
        String n = Integer.toString(number);
        while (n.length() < width) {
            n = "0" + n;
        }

        return n;
    }
}
