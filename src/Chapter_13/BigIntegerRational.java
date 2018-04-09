package Chapter_13;


import java.math.BigInteger;

public class BigIntegerRational extends Number implements Comparable {
    // Data fields for numerator and denominator
    private BigInteger numerator;
    private BigInteger denominator;

        /** Construct a rational with default properties */
    public BigIntegerRational(){
        this(BigInteger.ZERO, BigInteger.ONE);
    }

        /** Construct a rational with specified numerator and denominator */
    public BigIntegerRational(BigInteger numerator, BigInteger denominator){
        BigInteger numerator1;
        BigInteger gcd = gcd(numerator, denominator);
        BigInteger y = BigInteger.ZERO;
        if(denominator.compareTo(y) < 0)
        numerator1 = new BigInteger("-1");
    else
        numerator1 = new BigInteger("1");
        BigInteger numerator2 = numerator1.multiply(numerator);
        this.numerator = numerator2.divide(gcd);
        BigInteger denominator1 = denominator.abs();
        this.denominator = denominator1.divide(gcd);
    }

        /** Find GCD of two numbers */
    private static BigInteger gcd(BigInteger numerator, BigInteger denominator){
        BigInteger gcd = numerator.gcd(denominator); // можно так
        return gcd;
//        BigInteger n1 = numerator.abs();
//        BigInteger n2 = denominator.abs();
//        BigInteger gcd = new BigInteger("1");
//
//        BigInteger k = new BigInteger("1");
//        while(k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0) {
//            BigInteger result1 = n1.mod(k);
//            BigInteger result2 = n2.mod(k);
//            if(result1.equals(BigInteger.ZERO) && result2.equals(BigInteger.ZERO))
//            gcd = k;
//            k = k.add(BigInteger.ONE);
//        }
//        return gcd;
    }

        /** Return numerator */
    public BigInteger getNumerator() {
        return numerator;
    }

        /** Return denominator */
    public BigInteger getDenominator() {
        return denominator;
    }

        /** Add a rational number to this rational */
    public BigIntegerRational add(BigIntegerRational secondBigIntegerRational){
       BigInteger x = (numerator.multiply(secondBigIntegerRational.getDenominator()))
               .add(denominator.multiply(secondBigIntegerRational.getNumerator()));
       BigInteger y = denominator.multiply(secondBigIntegerRational.getDenominator());
       return new BigIntegerRational(x, y);
    }

        /** Subtract a rational number from this rational */
    public BigIntegerRational subtract(BigIntegerRational secondBigIntegerRational){
        BigInteger x = (numerator.multiply(secondBigIntegerRational.getDenominator()))
                .subtract(denominator.multiply(secondBigIntegerRational.getNumerator()));
        BigInteger y = denominator.multiply(secondBigIntegerRational.getDenominator());
        return new BigIntegerRational(x, y);
    }

        /** Multiply a rational number to this rational */
    public BigIntegerRational multiply(BigIntegerRational secondBigIntegerRational){
        BigInteger x = numerator.multiply(secondBigIntegerRational.getNumerator());
        BigInteger y = denominator.multiply(secondBigIntegerRational.getDenominator());
        return new BigIntegerRational(x, y);
    }

        /** Divide a rational number from this rational */
    public BigIntegerRational divide(BigIntegerRational secondBigIntegerRational){
        BigInteger x = numerator.multiply(secondBigIntegerRational.getDenominator());
        BigInteger y = denominator.multiply(secondBigIntegerRational.getNumerator());
        return new BigIntegerRational(x, y);
    }

        /** Override the toString() method */
    public String toString() {
        if(denominator.equals("1"))
        return numerator + "";
    else
        return numerator + "/"+ denominator;
    }

        /** Override the equals method in the Object class */
    public boolean equals(Object parm1) {
        if((this.subtract((BigIntegerRational)(parm1))).getNumerator().equals("0"))
        return true;
    else
        return false;
    }

        /** Implement the abstract intValue method in java.lang.Number */
    public int intValue() {
        return (int)doubleValue();
    }

        /** Implement the abstract floatValue method in java.lang.Number */
    public float floatValue() {
        return (float)doubleValue();
    }

        /** Implement the doubleValue method in java.lang.Number */
    public double doubleValue() {
        //double z = (numerator.divide(denominator)).doubleValue(); можно так
        double x = this.getNumerator().doubleValue();
        double y = this.getDenominator().doubleValue();
        return x / y;
    }

        /** Implement the abstract longValue method in java.lang.Number */
    public long longValue() {
        return (long)doubleValue();
    }

        /** Implement the compareTo method in java.lang.Comparable */
    public int compareTo(Object o) {
        BigInteger zero = BigInteger.ZERO;
        BigInteger x = ((this.subtract((BigIntegerRational)o)).getNumerator());
        BigInteger y = ((this.subtract((BigIntegerRational)o)).getNumerator());
        if(x.compareTo(zero) > 0)
        return 1;
    else if(y.compareTo(zero) < 0)
        return -1;
    else
        return 0;
    }

}
