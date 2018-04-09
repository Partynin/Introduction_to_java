package Chapter_13;

/** A complex number is a number in the form a + bi,
 where a and b are real numbers and i is sqrt(-1). The numbers a and b are known
 as the real part and imaginary part of the complex number, respectively. */

public class Complex implements Cloneable {
    private double a;
    private double b;

    /** Construct a complex with default properties */
    public Complex() {
        this(0, 0);
    }

    public Complex(long a) {
        this(a, 0);
    }

    /** Construct a complex with specified real part */
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    /** obtain the absolute value for a complex number | a + bi | = sqrt(a2 + b2) */
    public double abs() {
        double abs = Math.sqrt(a * a + b * b);
        return abs;
    }

    /** Add a complex number to this complex a + bi + c + di = (a + c) + (b + d)i */
    public Complex add(Complex secondComplex) {
        Complex addComplex = new Complex(a + secondComplex.getA(),
                b + secondComplex.getB());
        return addComplex;
    }

    /** Subtract a complex number from this complex a + bi - (c + di) = (a - c) + (b - d)i */
    public Complex subtract(Complex secondComplex) {
        Complex subtractComplex = new Complex(a - secondComplex.getA(),
                b - secondComplex.getB());
        return subtractComplex;
    }

    /** Multiply a complex number by this complex (a + bi)*(c + di) = (ac - bd) + (bc + ad)i */
    public Complex multiply(Complex secondComplex) {
        Complex multiplyComplex = new Complex(a * secondComplex.getA() - b * secondComplex.getB(),
                b * secondComplex.getA() + a * secondComplex.getB());
        return multiplyComplex;
    }

    /** Divide a complex number by this complex
     * (a + bi)/(c + di) = (ac + bd)/(c * c + d * d) + (bc - ad)i/(c * c + d * d) */
    public Complex divide(Complex secondComplex) {
        Complex divideComplex = new Complex((a * secondComplex.getA() + b * secondComplex.getB())
                / (secondComplex.getA() * secondComplex.getA() + secondComplex.getB() * secondComplex.getB()),
                (b * secondComplex.getA() - a * secondComplex.getB()) /
                        (secondComplex.getA() * secondComplex.getA() + secondComplex.getB() * secondComplex.getB()));
        return divideComplex;
    }

    @Override
    public String toString() {
        String s = a + " + " + b + "i";
        if (b == 0)
            s = a + "";
        return s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Complex(a, b);
    }

    /** Returning the real part */
    public double getRealPart() {
        return a;
    }

    /** Returning the imaginary part */
    public double getImaginaryPart() {
        return b;
    }
}
