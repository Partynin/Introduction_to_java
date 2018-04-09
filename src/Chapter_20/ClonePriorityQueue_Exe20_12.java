package Chapter_20;

import ToolKit.MyPriorityQueue;

/** 20.12 (Clone PriorityQueue) Define MyPriorityQueue class that extends
 PriorityQueue to implement the Cloneable interface and implement the
 clone() method to clone a priority queue. */

public class ClonePriorityQueue_Exe20_12 {
    /** Main method */
    public static void main(String[] args) {
        MyPriorityQueue<String> myPriorityQueue = new MyPriorityQueue<>();
        myPriorityQueue.add("mother");
        myPriorityQueue.add("father");
        myPriorityQueue.add("brother");

        System.out.println(myPriorityQueue);
        try {
            MyPriorityQueue<String> myPriorityQueue1 =
                    (MyPriorityQueue<String>) myPriorityQueue.clone();
            System.out.println(myPriorityQueue1);
        } catch (CloneNotSupportedException ex) {
            System.out.println("We have a problem");
            ex.printStackTrace();
        }
    }
}
