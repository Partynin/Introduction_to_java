package Chapter_23;

import Chapter_13.*;
import ToolKit.GeometricObjectComparator;

import java.util.Comparator;

/** 23.2 (Generic merge sort) Write the following two generic methods using merge sort.
 The first method sorts the elements using the Comparable interface and the
 second uses the Comparator interface.
 public static <E extends Comparable<E>>
 void mergeSort(E[] list)
 public static <E> void mergeSort(E[] list,
 Comparator<? super E> comparator) */

public class GenericMergeSort_Exe23_2 {
    /** Main method */
    public static void main(String[] args) {
        String[] strings = {"a", "v", "b", "c", "f", "g"};
        mergeSort(strings);
        for (String s : strings)
            System.out.print(s + " ");

        System.out.println();

        Integer[] integers = {2, 1, 0, 4, 7, 3, 9, 8, 2};
        mergeSort(integers);
        for (Integer in : integers)
            System.out.print(in + " ");

        System.out.println();

        GeometricObject[] geometricObjects = new GeometricObject[5];
        geometricObjects[0] = new Circle(5);
        geometricObjects[1] = new Rectangle(5, 1);
        geometricObjects[2] = new Triangle(3, 3, 3);
        geometricObjects[3] = new Square(3);
        geometricObjects[4] = new Octagon(2);

        mergeSort(geometricObjects, new GeometricObjectComparator());

        for (GeometricObject geometricObject : geometricObjects)
            System.out.println(geometricObject.getArea() + " ");
    }

    /** The generic method using the Comparable interface */
    public static <E extends Comparable<E>> void mergeSort(E[] list) {
        if (list.length > 1) {
            E[] firstHalf = (E[]) new Comparable[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            E[] secondHalf = (E[]) new Comparable[list.length - list.length / 2];
            System.arraycopy(list, list.length / 2, secondHalf, 0,
                    list.length - list.length / 2);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, list);
        }
    }

    public static <E extends Comparable<E>> void merge(E[] firstHalf, E[] secondHalf, E[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (firstHalf.length > current1 && secondHalf.length > current2) {
            if (firstHalf[current1].compareTo(secondHalf[current2]) < 0) {
                temp[current3++] = firstHalf[current1++];
            } else temp[current3++] = secondHalf[current2++];
        }

        while (firstHalf.length > current1) {
            temp[current3++] = firstHalf[current1++];
        }

        while (secondHalf.length > current2) {
            temp[current3++] = secondHalf[current2++];
        }
    }

    /** The generic method using the Comparator interface */
    public static <E> void mergeSort(E[] list, Comparator<? super E> comparator) {
        if (list.length > 1) {
            E[] firstList = (E[]) new Object[list.length / 2];
            System.arraycopy(list, 0, firstList, 0, list.length / 2);
            mergeSort(firstList, comparator);

            E[] secondList = (E[]) new Object[list.length - list.length / 2];
            System.arraycopy(list, list.length / 2, secondList, 0,
                    list.length - list.length / 2);
            mergeSort(secondList, comparator);

            merge(firstList, secondList, list, comparator);
        }
    }

    public static <E> void merge(E[] firstList, E[] secondList, E[] temp,
                                 Comparator<? super E> comparator) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (firstList.length > current1 && secondList.length > current2) {
            if (comparator.compare(firstList[current1], secondList[current2]) > 0) {
                temp[current3++] = secondList[current2++];
            } else temp[current3++] = firstList[current1++];
        }

        while (firstList.length > current1) {
            temp[current3++] = firstList[current1++];
        }

        while (secondList.length > current2) {
            temp[current3++] = secondList[current2++];
        }
    }
}
