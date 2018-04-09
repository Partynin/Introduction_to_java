package Chapter_6;

/**
 * Created by Kos on 17.07.2017.
 */
public class TestMax {
    /** Main method */
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is "
        + k);
    }

    /** Return the max of two numbers */
    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public  static double max(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }
}
