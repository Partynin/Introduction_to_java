package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 02.07.2017.
 */
public class ProcessAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        int length = s.length();
        char ch = s.charAt(0);

        System.out.printf("Length of string is %d and first character is %s", length, ch);
    }
}
