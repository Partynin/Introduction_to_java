package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 02.06.2017.
 */
public class CostOfDriving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles = scanner.nextDouble();
        System.out.print("Enter prise per gallon: ");
        double prise = scanner.nextDouble();

        double cost = (distance / miles) * prise;

        System.out.println("The cost of driving is $" + cost);
    }
}
