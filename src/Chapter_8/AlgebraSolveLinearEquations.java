package Chapter_8;

import java.util.Scanner;

public class AlgebraSolveLinearEquations {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a00, a01, a10, a11, b0 and b1:");
        double[][] a = new double[2][2];
        double[] b = new double[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < b.length; i++) {
                b[i] = scanner.nextDouble();
        }

        if (linearEquation(a, b) == null)
            System.out.println("the equation has no solution");
        else {
            double[] solve = linearEquation(a, b);
            System.out.println("x is " + solve[0] + " and y is " +
            solve[1]);
        }
    }

    /** Solves the linear equations */
    public static double[] linearEquation(double[][] a, double[] b) {
        double[] solve = new double[2];

        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0)
            return null;

        solve[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1]
        - a[0][1] * a[1][0]);
        solve[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1]
                - a[0][1] * a[1][0]);

        return solve;
    }
}
