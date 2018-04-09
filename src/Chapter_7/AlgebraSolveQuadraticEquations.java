package Chapter_7;

import java.util.Scanner;

public class AlgebraSolveQuadraticEquations {

    private static double[] eqn = new double[3];
    private static double[] roots = new double[2];

    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c:");

        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = scanner.nextDouble();
        }

        System.out.println(solveQuadratic(eqn, roots));

    }

    /** Solving a quadratic equation */
    public static int solveQuadratic(double[] eqn, double[] roots) {
        double discriminant = eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];

        if (discriminant > 0){
            roots[0] = (-eqn[1] + discriminant) / 2 * eqn[0];
            roots[1] = (-eqn[1] - discriminant) / 2 * eqn[0];
            System.out.println("The equation has two roots " + roots[0] + " and " +
            roots[1]);
            return 2;
        }
        else if (discriminant == 0){
            roots[0] = -eqn[1] / (2 * eqn[0]);
            System.out.println("The equation has one root " + roots[0]);
            return 1;
        }
        else
            System.out.println("The equation has no real root");

        return 0;
    }
}
