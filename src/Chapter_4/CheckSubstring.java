package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 02.07.2017.
 */
public class CheckSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = scanner.nextLine();

        boolean flag = s1.contains(s2);

        if (flag) System.out.println(s2 + " is a substring of " + s1);
        else System.out.println(s2 + " is not a substring of " + s1);
    }
}
