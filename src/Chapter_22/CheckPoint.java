package Chapter_22;

import java.util.Arrays;

public class CheckPoint {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 8, 3, 1, 0};

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = - 1;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
