package Chapter_13;

import java.util.ArrayList;

public class ReviseTheMyStackClass implements Cloneable {
    private ArrayList<Object> list;

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    // Returns and removes the top element in this stack.
    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy
        ReviseTheMyStackClass clone = (ReviseTheMyStackClass) super.clone();
        // Deep copy
        clone.list = (ArrayList<Object>) (list.clone());
        return clone;
    }
}
