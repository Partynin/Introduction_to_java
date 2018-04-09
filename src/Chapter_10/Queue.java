package Chapter_10;

public class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        elements = new int[8];
    }

    public void enqueue(int v) {
        if (size == elements.length) {
            int[] tempElements = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                tempElements[i] = elements[i];
            }
            elements = tempElements;
        }
        elements[size] = v;
        size++;
    }

    public int dequeue() {
        int el = elements[0];
        for (int i = 0; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return el;
    }

    public boolean empty() {
        if (size == 0) {
            return true;
        } else return false;
    }

    public int getSize() {
        return size;
    }
}
