package Chapter_5;

/**
 * Created by Kos on 09.07.2017.
 */
public class FinancialApplicationComputeFutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double increases = 0.05;

        for (int i = 1; i <= 10; i++) {
            tuition = tuition * increases + tuition;
        }
        System.out.printf("Tuition in ten years = %.2f\n", tuition);

        double tuitionCost = 0;
        for (int i = 1; i <= 4; i++) {
            tuition = tuition * increases + tuition;
            tuitionCost += tuition;
        }
        System.out.printf("Cost of four years of tuition = %.2f", tuitionCost);
    }
}
