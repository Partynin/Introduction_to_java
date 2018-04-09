package Chapter_20;

import Chapter_13.Circle;
import Chapter_13.GeometricObject;
import Chapter_13.Rectangle;

import java.util.Comparator;

/** *20.21 (Use Comparator) Write the following generic method using selection sort
 and a comparator.
 public static <E> void selectionSort(E[] list,
 Comparator<? super E> comparator)
 Write a test program that creates an array of 10 GeometricObjects and
 invokes this method using the GeometricObjectComparator introduced in
 Listing 20.4 to sort the elements. Display the sorted elements. Use the following
 statement to create the array.
 GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
 new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
 new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
 new Circle(6.5), new Rectangle(4, 5)}; */

public class UseComparator_Exe20_21 {
    public static void main(String[] args) {
        GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
                new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
                new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
                new Circle(6.5), new Rectangle(4, 5)};

        for (int i = 0; i < list.length; i++) {
            System.out.println("Geometry object: " + list[i]);
        }

        GeometricObjectComparator comparator = new GeometricObjectComparator();
        selectionSort(list, comparator);

        System.out.println();
        System.out.println("List after sorting");
        System.out.println();

        for (int i = 0; i < list.length; i++) {
            System.out.println("Geometry object: " + list[i]);
        }
    }

    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
        for (int i = 0; i < list.length - 1; i++) {
            E min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (comparator.compare(min, list[j]) > 0) {
                   min = list[j];
                   minIndex = j;
                }
            }

            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }
}
