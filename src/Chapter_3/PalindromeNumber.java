package Chapter_3;


import java.util.Scanner;

/**
 * Created by Kos on 13.06.2017.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == c){
            System.out.println(" " + a + b + c + " is a palindrome");
        }
        else System.out.println(" " + a + b + c + " is not a palindrome");
    }
}
