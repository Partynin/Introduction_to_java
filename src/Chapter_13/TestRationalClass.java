package Chapter_13;

public class TestRationalClass {
    /** Main method */
    public static void main(String[] args) {
        // Create and initialize two rational numbers r1 and r2
        Rational r1 = new Rational(4, 2);
        Rational r2 = new Rational(2, 3);

        // Display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());

        Rational r3 = new Rational(-2, 6);
        System.out.println(r3.getNumerator());
        System.out.println(r3.getDenominator());
        System.out.println(r3.intValue());
        System.out.println(r3.doubleValue());

        Rational r4 = new Rational(1,2);
        Rational r5 = new Rational(1, -2);
        System.out.println(r4.add(r5));
    }
}
