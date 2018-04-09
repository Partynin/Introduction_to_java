package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 26.05.2017.
 */
public class FindTheNumberOfYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of minutes: ");
        long minutes = scanner.nextLong();

        int days = (int) (minutes % 525600) / 1440;
        int years = (int) (minutes / 525600);
        System.out.println(minutes + " minutes is approximately " + years + " years and " +
        + days + " days");
    }
}
