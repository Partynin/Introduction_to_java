package Chapter_24;

public abstract class MyAbstractList<E> implements MyList<E> {
    protected int size = 0; // The size of the list

    /** Crate a default list */
    protected MyAbstractList() {

    }

    /** Create a list from an array of object */
    protected MyAbstractList(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    @Override /** Add a new element at the end of this list */
    public void add(E e) {
        add(size, e);
    }

    @Override /** Return true if this list dose not contain any element */
    public boolean isEmpty() {
        return  size == 0;
    }

    @Override /** Return the number of element in this list */
    public int size() {
        return size;
    }

    @Override
    public boolean remove(E e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else
            return false;
    }

    @Override /** Adds the elements in otherList to this list.
     * Returns true if this list changed as a result of the call */
    public boolean addAll(MyList<E> otherList) {
        int oldSize = size;
        for(E e : otherList)
            add(e);

        if (size != oldSize)
            return true;
        else return false;
    }

    @Override /** Removes all the elements in otherList from this list
     * Returns true if this list changed as a result of the call */
    public boolean removeAll(MyList<E> otherList) {
        int oldSize = size;
        for(E e : otherList) {
            remove(e);
        }

        if (size != oldSize)
            return true;
        else return false;
    }

    @Override /** Retains the elements in this list that are also in otherList
     * Returns true if this list changed as a result of the call */
    public boolean retainAll(MyList<E> otherList) {
        int oldSize = size;
        MyList<E> newList = new MyArrayList<>();
        for (E e : otherList) {
            if (contains(e))
                newList.add(e);
        }

        clear();
        addAll(newList);

        if (size != oldSize)
            return true;
        else return false;
    }
}
