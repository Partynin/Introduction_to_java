package Chapter_8;

import java.util.Scanner;

public class MarkovMatrix {
    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] m = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scanner.nextDouble();
            }
        }

        if (isMarkovMatrix(m))
            System.out.println("It is Markov matrix");
        else System.out.println("It is not a Markov matrix");
    }

    /** Check whether a matrix is a Markov matrix */
    public static boolean isMarkovMatrix(double[][] m) {
        boolean flag = false;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 0)
                    return flag;
            }
        }

        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[i].length; j++) {
                sum += m[j][i];
            }
            if (sum == 1)
                flag = true;
            else {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
