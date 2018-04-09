package Chapter_10;

import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String[] args) {
        System.out.printf("50! is \n" + factorial(50));
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE; // BigInteger.ONE = new BigInteger("1")
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i + ""));

        return result;
    }
}
