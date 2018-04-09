package Chapter_12;

public class BinaryFormatException extends Exception {
    private String binaryString;

    /** Construct an exception */
    public BinaryFormatException(String binaryString) {
        super("Invalid binary String " + binaryString);
        this.binaryString = binaryString;
    }

    /** Return the String */
    public String getBinaryString() {
        return binaryString;
    }
}
