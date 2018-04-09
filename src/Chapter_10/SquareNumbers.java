package Chapter_10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SquareNumbers {
    /** Main method */
    public static void main(String[] args) {
        long longSquare = (long) Math.sqrt(Long.MAX_VALUE);
        String s = longSquare + "";
        BigInteger firstBI = new BigInteger(s);


        for (int i = 0; i < 10; i++) {
            firstBI = firstBI.multiply(firstBI);
            System.out.println(firstBI);
        }

        BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
        long start = (long) Math.sqrt(Long.MAX_VALUE);
        BigDecimal n = new BigDecimal(start);
        int count = 0;


        while (count < 10) {

            BigDecimal squared = n.multiply(n);
            if (squared.compareTo(longMaxValue) > 0) {
                count++;
                System.out.println(count+": " + n + " squared = " + squared);
            }
            n = n.add(BigDecimal.ONE);
        }
    }
}
