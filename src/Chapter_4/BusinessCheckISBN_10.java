package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 02.07.2017.
 */
public class BusinessCheckISBN_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");
        String s = scanner.nextLine();
        int d1 = Integer.parseInt(s.charAt(0) + "");
        int d2 = Integer.parseInt(s.charAt(1) + "");
        int d3 = Integer.parseInt(s.charAt(2) + "");
        int d4 = Integer.parseInt(s.charAt(3) + "");
        int d5 = Integer.parseInt(s.charAt(4) + "");
        int d6 = Integer.parseInt(s.charAt(5) + "");
        int d7 = Integer.parseInt(s.charAt(6) + "");
        int d8 = Integer.parseInt(s.charAt(7) + "");
        int d9 = Integer.parseInt(s.charAt(8) + "");

        int ISBN = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7
                + d8 * 8 + d9 * 9) % 11;

        if (ISBN == 10)
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5
                    + d6 + d7 + d8 + d9 + "X");
        else System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5
                + d6 + d7 + d8 + d9 + ISBN);
    }
}
