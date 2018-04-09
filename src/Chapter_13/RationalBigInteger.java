package Chapter_13;


import java.math.BigInteger;

public class RationalBigInteger {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("Start1");
        // Create and initialize two rational numbers r1 and r2
        BigIntegerRational r1 = new BigIntegerRational(new BigInteger("400000"),
                new BigInteger("200000"));
        BigIntegerRational r2 = new BigIntegerRational(new BigInteger("200000"),
                new BigInteger("300000"));

        System.out.println("Start");

        // Display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
