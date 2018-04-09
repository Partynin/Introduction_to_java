package Chapter_20;

import java.util.Arrays;
import java.util.PriorityQueue;

/** 20.10 (Perform set operations on priority queues) Create two priority queues,
 {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and
 {"George", "Katie", "Kevin", "Michelle", "Ryan"}, and find their
 union, difference, and intersection. */

public class PerformSetOperationsOnPriorityQueues_Exe20_10 {
    /** Main method */
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        System.out.println("First priorityQueue: " + queue1);

        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.addAll(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
        System.out.println("Second priorityQueue: " + queue2);

        queue1.addAll(queue2);
        System.out.println("Union of queues: " + queue1);

        queue1.clear();
        queue1.addAll(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        queue1.removeAll(queue2);
        System.out.println("Difference of queues: " + queue1);

        queue1.clear();
        queue1.addAll(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        queue1.retainAll(queue2);
        System.out.println("Intersection of queues: " + queue1);
    }
}
