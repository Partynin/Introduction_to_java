package Chapter_1_and_2;

import java.util.Scanner;

/**
 * Created by Kos on 27.05.2017.
 */
public class PopulationProjection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numberYears = scanner.nextInt();

        int currentPopulation = 312032486;
        int birthYear = 4505142;
        int death = 2425846;
        int immigrant = 700800;
        int population = currentPopulation + (birthYear + immigrant - death) *
                numberYears;

        System.out.println("The population in " + numberYears +
                " years is " + population);
    }
}
