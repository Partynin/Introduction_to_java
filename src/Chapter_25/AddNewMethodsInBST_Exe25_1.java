package Chapter_25;

/** *25.1 (Add new methods in BST) Add the following new methods in BST. */

public class AddNewMethodsInBST_Exe25_1 {
    /** Main method */
    public static void main(String[] args) {
        BST<Integer> integerBST = new BST<>();
        integerBST.insert(60);
        integerBST.insert(55);
        integerBST.insert(100);
        integerBST.insert(45);
        integerBST.insert(57);
        integerBST.insert(67);
        integerBST.insert(107);
        integerBST.insert(59);
        integerBST.insert(101);

        integerBST.breadthFirstTraversal();

        System.out.println();
        System.out.println("Height of this binary tree is " + integerBST.height());
    }
}
