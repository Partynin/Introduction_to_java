package ToolKit;

import java.util.Arrays;

public class GenericStackWithArray<E> {
    E[] array = (E[])new Object[5];
    int element = 0;

    public int getSize() {
        return array.length;
    }

    public E peek() {
        return array[element];
    }

    public void push(E o) {
        if (array.length > element) {
        array[element] = o;
        element++;
        } else {
            E[] tempArray = (E[])new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }

            array = tempArray;

            array[element] = o;
            element++;
        }
    }

    public E pop() {
        E o = array[element - 1];
        array[element - 1] = null;
        element--;
        return o;
    }

    public boolean isEmpty() {
        return element == 0 ? true : false;
    }

    @Override
    public String toString() {
        return "stack: " + Arrays.toString(array);
    }
}
