package Chapter_12;

public class TestOutOfMemoryError {
    /** Main method */
    public static void main(String[] args) {
        try {
            method();
        }
        catch (OutOfMemoryError ex) {
            System.out.println("Exception handled");
        }
    }

    public static void method() throws OutOfMemoryError {
            int[] temp = new int[1000000000];
            temp = new int[temp.length * 1000000000];
    }
}
