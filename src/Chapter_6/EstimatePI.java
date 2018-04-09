package Chapter_6;

public class EstimatePI {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("i         m(i)");
        System.out.println("________________");
        for (int i = 1; i <= 901; i = i + 100) {
            if (i == 1)
                System.out.printf("%d  %14.4f\n", i, getApproximatePI(i));
            else
            System.out.printf("%d%14.4f\n", i, getApproximatePI(i));
        }

    }

    /** The method calculates and returns approximate value of PI */
    public static double getApproximatePI(int j) {
        double n = 0;

            for (int i = 1; i <= j; i++)
                n = n + (Math.pow(-1, i + 1)) / (2 * i - 1);

            double PI = 4 * n;

            return PI;
        }
    }

