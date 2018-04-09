package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 17.06.2017.
 */
public class UsAndOrAndExclusivOrOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = scanner.nextInt();

        boolean flag = (i % 5  == 0 && i % 6 == 0);
        System.out.println("Is " + i + "divisible by 5 and 6? " + flag);
        flag = (i % 5  == 0 || i % 6 == 0);
        System.out.println("Is " + i + "divisible by 5 or 6? " + flag);
        flag = (i % 5  == 0 ^ i % 6 == 0);
        System.out.println("Is " + i + "divisible by 5 or 6, but not both? " + flag);
    }
}
