package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 14.07.2017.
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int decimal = scanner.nextInt();
        String s = "";

        while (decimal >= 1) {
            if (decimal % 2 == 0) {
                s = s + 0;
            }
            else s = s + 1;

            decimal = decimal / 2;
        }

        System.out.println(new StringBuffer(s).reverse().toString());
    }
}
