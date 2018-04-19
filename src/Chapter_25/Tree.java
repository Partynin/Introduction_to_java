package Chapter_25;

public interface Tree<E> extends Iterable<E> {
    /** Return true if the element is in the tree */
    public boolean search(E e);

    /** Insert element e into binary search tree. Return true
     * if the element inserted successfully.
     */
    public boolean insert(E e);

    /** Delete the specified element from the tree. Return true
     * if the element deleted successfully.
     */
    public boolean delete(E e);

    /** Inorder traversal from the root */
    public void inorder();

    /** Postorder traversal from the root */
    public void postorder();

    /** Preorder traversal from the root */
    public void preorder();

    /** Get the number of nodes in the tree */
    public int getSize();

    /** Return true if the treeis empty */
    public boolean isEmpty();
}
