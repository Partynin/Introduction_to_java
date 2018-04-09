package Chapter_7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckPoint {
    public static void main(String[] args) {
        /**double[] array = new double[10];
        array[array.length - 1] = 5.5;
        System.out.println(array[0] + array[1]);
        double sum = 0;
        for (double e: array) {
            sum += sum;
        }
        double min = array[0];
        for (double e: array) {
            if (e < min)
                min = e;
        }
        System.out.println(array[(int) (Math.random() * array.length)]);
        double[] array1 = {3.5, 5.5, 4.52, 5.6};

        int[] source = {3, 4, 5};
        int[] t = new int[source.length];
        System.arraycopy(source,0, t, 0, source.length);

        int number = 0;
        int[] numbers = new int[1];

        m(number, numbers);
        System.out.println("number is " + number + " and numbers[0] is " + numbers[0]);

        int[] list = {1, 2, 3, 4, 5};
        revers(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

        double[] listInorder = {2, 5, 6, 4, 1};
        SelectionSort.selectionSSort(listInorder);
        showArray(listInorder);
        System.out.println();
        SortArrayWaning.selectionSort(listInorder);
        showArray(listInorder);

        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 7, 7, 10};
        Arrays.fill(list1, 5);
        Arrays.fill(list2, 1,5,8);
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));

        int[] list1 = {2, 4, 7, 10};
        Arrays.fill(list1, 7);
        System.out.println(Arrays.toString(list1));

        int[] list2 = {2, 4, 7, 10};
        System.out.println(Arrays.toString(list2));
        System.out.println(Arrays.equals(list1, list2));

        for (int i = 0; i < args.length; i++)  {
            System.out.println(args[i]);
        } */
        System.out.println("string" + 5 + 3);
    }
    public static void revers(int[] list) {
        int[] newList = new int[list.length];

        for (int i = 0; i < list.length; i++)
            newList[i] = list[list.length - 1 - i];

        list = newList;
    }
    public static void m(int x, int[] y) {
        x = 3;
        y[0] = 3;
    }
    public static void showArray(double[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
