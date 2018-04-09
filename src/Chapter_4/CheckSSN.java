package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 02.07.2017.
 */
public class CheckSSN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String s = scanner.nextLine();

        if (s.length() < 11 || s.charAt(3) != '-' || s.charAt(6) != '-' || !Character.isDigit(s.charAt(0))
                || !Character.isDigit(s.charAt(1)) || !Character.isDigit(s.charAt(2)) || !Character.isDigit(s.charAt(4))
                || !Character.isDigit(s.charAt(5)) || !Character.isDigit(s.charAt(7)) || !Character.isDigit(s.charAt(8))
                || !Character.isDigit(s.charAt(9)) || !Character.isDigit(s.charAt(10)))
            System.out.println(s + " is an invalid social security number");
        else System.out.println(s + " is a valid social security number");
    }
}
