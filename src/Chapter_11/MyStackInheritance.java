package Chapter_11;

import java.util.ArrayList;

public class MyStackInheritance extends ArrayList<Object>{
    public Object peek() {
        return this.get(size() - 1);
    }

    public Object pop() {
        Object o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}
