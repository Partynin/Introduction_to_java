package Chapter_13;

import java.math.BigInteger;

public class UseTheRationalClass {
    /** Main method */
    public static void main(String[] args) {
        BigIntegerRational sum = new BigIntegerRational();
        for (int i = 1; i < 100; i++) {
            System.out.print(new BigIntegerRational(new BigInteger(i + ""), new BigInteger((i + 1) + "")) + " ");
            sum = sum.add(new BigIntegerRational(new BigInteger(i + ""), new BigInteger((i + 1) + "")));
        }

        System.out.println();
        System.out.println(sum);
    }
}
