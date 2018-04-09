package Chapter_8;

import java.util.Scanner;

public class AlgebraAddTwoMatrices {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        double[][] a = new double[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        double[][] b = new double[3][3];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = scanner.nextDouble();
            }
        }

        double[][] c = addMatrix(a, b);

        System.out.println("The matrices are added as follows");
        for (int i = 0; i < a.length; i++) {
            int j = 0;
            if (i != 1) {
                System.out.printf("%.1f %.1f %.1f   %.1f %.1f %.1f   %.1f %.1f %.1f\n",
                        a[i][j], a[i][j + 1], a[i][j + 2], b[i][j],
                        b[i][j + 1], b[i][j + 2], c[i][j], c[i][j + 1],
                        c[i][j + 2]);
            }
            else System.out.printf("%.1f %.1f %.1f + %.1f %.1f %.1f = %.1f %.1f %.1f\n",
                    a[i][j], a[i][j + 1], a[i][j + 2], b[i][j],
                    b[i][j + 1], b[i][j + 2], c[i][j], c[i][j + 1],
                    c[i][j + 2]);

        }
    }

    /** Add two matrices */
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }
}
