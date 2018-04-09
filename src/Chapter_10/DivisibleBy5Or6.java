package Chapter_10;

import java.math.BigDecimal;

public class DivisibleBy5Or6 {
    public static void main(String[] args) {
        BigDecimal longMax = new BigDecimal(Long.MAX_VALUE);
        int count = 0;
        while (count < 10) {
            if (longMax.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO) ||
                    longMax.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
                System.out.println(longMax);
                count++;
            }
            longMax = longMax.add(BigDecimal.ONE);
        }
    }
}

