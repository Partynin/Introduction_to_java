package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 01.07.2017.
 */
public class PhoneKeyPads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String s = scanner.nextLine();

        if (s.length() > 1 || !Character.isLetter(s.charAt(0)))
            System.out.println(s + "is invalid input");
        else if (s.toUpperCase().equals("A") || s.toUpperCase().equals("B") || s.toUpperCase().equals("C"))
            System.out.println("The corresponding number is 2");
        else if (s.toUpperCase().equals("D") || s.toUpperCase().equals("E") || s.toUpperCase().equals("F"))
            System.out.println("The corresponding number is 3");
        else if (s.toUpperCase().equals("G") || s.toUpperCase().equals("H") || s.toUpperCase().equals("I"))
            System.out.println("The corresponding number is 4");
        else if (s.toUpperCase().equals("J") || s.toUpperCase().equals("K") || s.toUpperCase().equals("L"))
            System.out.println("The corresponding number is 5");
        else if (s.toUpperCase().equals("M") || s.toUpperCase().equals("N") || s.toUpperCase().equals("O"))
            System.out.println("The corresponding number is 6");
        else if (s.toUpperCase().equals("P") || s.toUpperCase().equals("Q") || s.toUpperCase().equals("R")
                || s.toUpperCase().equals("S"))
            System.out.println("The corresponding number is 7");
        else if (s.toUpperCase().equals("T") || s.toUpperCase().equals("U") || s.toUpperCase().equals("V"))
            System.out.println("The corresponding number is 8");
        else if (s.toUpperCase().equals("W") || s.toUpperCase().equals("X") || s.toUpperCase().equals("Y")
                || s.toUpperCase().equals("Z"))
            System.out.println("The corresponding number is 9");
    }
}
