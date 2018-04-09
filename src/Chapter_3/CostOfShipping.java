package Chapter_3;

import java.util.Scanner;

/**
 * Created by Kos on 13.06.2017.
 */
public class CostOfShipping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a weight: ");
        double packageWheith = scanner.nextDouble();

        if (packageWheith > 50)
            System.out.println("The package cannot be shipped.");
        else {
            if (packageWheith > 0 && packageWheith <= 1)
                System.out.println("The shipping coast is " + 3.5);
            else if (packageWheith > 1 && packageWheith <= 3)
                System.out.println("The shipping coast is " + 5.5);
            else if (packageWheith > 3 && packageWheith <= 10)
                System.out.println("The shipping coast is " + 8.5);
            else if (packageWheith > 10 && packageWheith <= 50)
                System.out.println("The shipping coast is " + 10.5);
        }
    }
}
