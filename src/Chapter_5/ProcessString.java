package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 16.07.2017.
 */
public class ProcessString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        String s2 = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0)
                s2 = s2 + Character.toString(s.charAt(i));
            }

        System.out.println(s2);
    }
}
