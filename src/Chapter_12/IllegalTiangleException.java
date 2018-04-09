package Chapter_12;

public class IllegalTiangleException extends Exception {
    private double illegalSide;

    /** Construct an exception */
    public IllegalTiangleException(double illegalSide) {
        super("Invalid side " + illegalSide);
        this.illegalSide = illegalSide;
    }

    /** Return the illegalSide */
    public double getIllegalSide() {
        return illegalSide;
    }
}
