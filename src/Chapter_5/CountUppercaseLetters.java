package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 16.07.2017.
 */
public class CountUppercaseLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        System.out.println("The number of uppercase letters is " + count);
    }
}
