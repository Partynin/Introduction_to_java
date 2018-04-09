package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 30.06.2017.
 */
public class FindTheUnicodeOfACharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = scanner.nextLine();

        int code = s.charAt(0);

        System.out.printf("The unicode for the character %s is %d", s, code);
    }
}
