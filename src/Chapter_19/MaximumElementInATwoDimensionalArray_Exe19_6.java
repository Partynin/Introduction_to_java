package Chapter_19;

/** 19.6 (Maximum element in a two-dimensional array) Write a generic method that
 returns the maximum element in a two-dimensional array.
 public static <E extends Comparable<E>> E max(E[][] list) */

public class MaximumElementInATwoDimensionalArray_Exe19_6 {
    /** Main method */
    public static void main(String[] args) {
        Integer[][] list = {{2, 3, 4}, {3, 3, 3}, {4, 44, 1}};
        System.out.println("The maximum in array is " + max(list));
    }

    /** Generic method that returns the maximum in a two-dimensional array */
    public static <E extends Comparable<E>> E max(E[][] list) {
        E oMax = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if (oMax.compareTo(list[i][j]) < 0)
                    oMax = list[i][j];
            }
        }

        return oMax;
    }
}
