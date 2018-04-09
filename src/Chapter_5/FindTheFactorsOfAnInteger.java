package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 10.07.2017.
 */
public class FindTheFactorsOfAnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 2; i <= number;) {
            if (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
            else i++;
        }
    }
}
