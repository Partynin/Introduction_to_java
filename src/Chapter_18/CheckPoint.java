package Chapter_18;


import java.util.Arrays;

public class CheckPoint {
    public static void main(String[] args) {
        int[] array = {1, 3, 8, 6, 3, 4, 7, 9, 0};
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int[] array1 = {1, 3, 8, 6, 3, 4, 7, 9, 0};
        selectionSort(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = {1, 3, 8, 6, 3, 4, 7, 9, 0};
        insertionSort(array2);
        System.out.println(Arrays.toString(array2));

        System.out.println();
        System.out.println(factorial(4));

        System.out.println();
        System.out.println(factRecurs(4));
    }

    private static long factRecurs(int number) {
        if (number == 0)
            return 1;
        return factRecurs(number - 1) * number;
    }

    public static long factorial(int number) {
        long factor = 1;
        for (int i = number; i > 0; i--) {
            factor *= i;
        }
        return factor;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        int temp, j;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
    }
}
