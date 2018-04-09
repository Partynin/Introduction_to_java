package Chapter_21;

import java.util.Arrays;
import java.util.LinkedHashSet;

/** 21.1 (Perform set operations on hash sets) Create two linked hash sets {"George",
 "Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie",
 "Kevin", "Michelle", "Ryan"} and find their union, difference, and intersection.
 (You can clone the sets to preserve the original sets from being changed by
 these set methods.) */

public class PerformSetOperationsOnHashSets_Exe21_1 {
    /** Main method */
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake",
                "Kevin", "Michael"));
        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList("George", "Kevin", "Michael",
                "Ryan"));

        LinkedHashSet<String> unionSet = (LinkedHashSet<String>) set1.clone();
        unionSet.addAll(set2);
        System.out.println("Union set is " + unionSet);

        LinkedHashSet<String> differenceSet = (LinkedHashSet<String>) set1.clone();
        differenceSet.removeAll(set2);
        System.out.println("Difference set is " + differenceSet);

        LinkedHashSet<String> intersectionSet = (LinkedHashSet<String>) set1.clone();
        intersectionSet.retainAll(set2);
        System.out.println("Intersection set is " + intersectionSet);
    }
}
