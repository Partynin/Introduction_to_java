package ToolKit;

import java.util.PriorityQueue;

public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        MyPriorityQueue<E> clone = new MyPriorityQueue<>();

        this.forEach(clone::offer);
        return clone;
    }
}
