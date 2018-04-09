package Chapter_19;

/** 19.5 (Maximum element in an array) Implement the following method that returns the
 maximum element in an array.
 public static <E extends Comparable<E>> E max(E[] list) */

public class MaximumElementInAnArray_Exe19_5 {
    /** Main method */
    public static void main(String[] args) {
        Integer[] list = {1, 3, 8, 33, 2, 5};
        System.out.println("Maximum element in the list is " + max(list));
    }

    /** Returns the maximum element in an array */
    public static <E extends Comparable<E>> E max(E[] list) {
        E oMax = list[0];

        for (int i = 1; i < list.length; i++) {
            if (oMax.compareTo(list[i]) < 0)
                oMax = list[i];
        }

        return oMax;
    }
}
