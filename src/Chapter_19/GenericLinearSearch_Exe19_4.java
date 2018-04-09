package Chapter_19;

/** 19.4 (Generic linear search) Implement the following generic method for linear search.
 public static <E extends Comparable<E>>
 int linearSearch(E[] list, E key) */

public class GenericLinearSearch_Exe19_4 {
    /** Main method */
    public static void main(String[] args) {
        String[] strings = {"mother", "father", "brother"};
        System.out.println("Position of element \"father\" is " +
                linearSearch(strings, "father"));
    }

    /** Generic method for linear search */
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        int position = -1;

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0)
                return position = i;
        }

        return position;
    }
}
