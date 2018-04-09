package Chapter_19;

import java.util.Arrays;

/** 19.7 (Generic binary search) Implement the following method using binary search.
 public static <E extends Comparable<E>> int binarySearch(E[] list, E key) */

public class GenericBinarySearch_Exe19_7 {
    /** Main method */
    public static void main(String[] args) {
        String[] list = {"mother", "father", "brother", "sister", "uncle", "aunt", "niece"};
        Arrays.sort(list); // binary search only for sort arrays
        System.out.println("The sort list: " + Arrays.toString(list));
        System.out.println("The number of element \"father\" is " +
                binarySearch(list, "father"));
    }

    /** Method using binary search */
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int i = -1;
        if (list != null) {
            int low = 0, high = list.length, mid;
            while (low < high) {
                mid = (low + high) >>> 1; // чтоб не возникло переполнение целого (low + high) / 2
                if (key.compareTo(list[mid]) == 0) {
                    i = mid;
                    break;
                } else {
                    if (key.compareTo(list[mid]) < 0)
                        high = mid;
                    else low = mid + 1;
                }
            }
        }
        return i;
    }
}
