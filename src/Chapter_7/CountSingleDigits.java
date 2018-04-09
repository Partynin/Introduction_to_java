package Chapter_7;

import java.util.Arrays;

public class CountSingleDigits {
    private static int[] list = new int[10];

    /** Main method */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int x = (int)(Math.random() * 10);
            write(x);
        }
        System.out.println(Arrays.toString(list));
    }

    /** Write to array */
    public static void write(int x) {
        list[x] = list[x] + 1;
    }
}
