package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 30.06.2017.
 */
public class FindTheCharacterOfAnASCIICode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int code = scanner.nextInt();

        char ch = (char)code;

        System.out.printf("The character for ASCII code %d is %s", code, ch);
    }
}
