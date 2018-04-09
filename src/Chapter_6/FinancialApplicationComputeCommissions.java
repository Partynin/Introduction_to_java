package Chapter_6;

public class FinancialApplicationComputeCommissions {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("Sales Amount     Commission");
        System.out.println("___________________________");

        for (int i = 10000; i <= 100000; i = i + 5000) {
            System.out.printf("%d%20.1f\n", i, computeCommission(i));
        }
    }

    /** Method that computes the commission */
    public static double computeCommission(double salesAmount) {
        double commission = 0;
        if (salesAmount > 0.01 && salesAmount < 5000)
            commission = (salesAmount / 100) * 8;
        else if (salesAmount > 5000.01 && salesAmount <= 10000)
            commission = (5000 * 0.08) + (salesAmount - 5000) * 0.1;
        else if (salesAmount > 10000.01)
            commission = (5000 * 0.08) + (5000 * 0.1) + (salesAmount - 10000) * 0.12;

        return commission;
    }
}
