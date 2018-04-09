package Chapter_10;

import java.math.BigDecimal;

public class ApproximatedE {
    /** Main method */
    public static void main(String[] args) {
        for (int k = 100; k <= 1000; k = k + 100) {
            BigDecimal E = new BigDecimal(1.0);
            for (int i = 1; i <= k; i++) {
                BigDecimal I = new BigDecimal(1.0);
                for (int j = 1; j <= i; j++) {
                    I = I.multiply(new BigDecimal(j));
                }
                E = E.add(new BigDecimal(1.0).divide(I, 25, BigDecimal.ROUND_UP));
            }
            System.out.println("E for " + k + " = " + E + " " + Math.E);
        }
    }
}
