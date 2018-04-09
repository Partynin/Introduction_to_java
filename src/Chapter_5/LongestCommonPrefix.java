package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 16.07.2017.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string first: ");
        String s = scanner.nextLine();
        System.out.print("Enter a string second: ");
        String s2 = scanner.nextLine();
        String s3 = "";
        int length = 0;

        if (s.length() >= s2.length())
            length = s2.length();
        else length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == s2.charAt(i)) {
                s3 = s3 + s.charAt(i);
            }
        }
        if (s3.length() > 1)
        System.out.println("The common prefix is " + s3);
        else System.out.println(s + " and " + s2 + " have no common prefix");
    }
}
