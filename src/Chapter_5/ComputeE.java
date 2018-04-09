package Chapter_5;

/**
 * Created by Kos on 13.07.2017.
 */
public class ComputeE {
    public static void main(String[] args) {
        for (int k = 10000; k <= 100000; k = k + 10000) {
        double E = 1;
        for (int i = 1; i <= k; i++) {
            double I = 1;
            for (int j = 1; j <= i; j++) {
                I = I * j;
            }
            E = E + 1.0 / I;
        }
        System.out.println("E for " + k + " = " + E + " " + Math.E);
        }
    }
}
