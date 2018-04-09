package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 15.07.2017.
 */
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int x = 0;
        String s = "";

        while (number >= 1){
        x = number % 8;
        s = s + Integer.toString(x);
        number = number / 8;
        }


        System.out.println(new StringBuffer(s).reverse().toString());
    }
}
