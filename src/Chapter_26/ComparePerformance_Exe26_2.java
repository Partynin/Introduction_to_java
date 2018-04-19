package Chapter_26;

import Chapter_25.BST;

import java.util.ArrayList;
import java.util.Collections;

/** 26.2 (Compare performance) Write a test program that randomly generates 500,000
 numbers and inserts them into a BST, reshuffles the 500,000 numbers and performs
 a search, and reshuffles the numbers again before deleting them from
 the tree. Write another test program that does the same thing for an AVLTree.
 Compare the execution times of these two programs. */

public class ComparePerformance_Exe26_2 {
    /** Main method */
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            data.add(i);
        }

        // Time performance for BST
        BST<Integer> bst = new BST<>();
        long startTime = System.currentTimeMillis();
        for (Integer i : data)
            bst.insert(i);
        System.out.println("BST insert time is " + (startTime - System.currentTimeMillis()));

        Collections.shuffle(data);

        startTime = System.currentTimeMillis();
        for (Integer i : data)
            bst.search(i);
        System.out.println("BST search time is " + (startTime - System.currentTimeMillis()));

        Collections.shuffle(data);
        for (Integer i : data)
            bst.delete(i);
        System.out.println("BST delete time is " + (startTime - System.currentTimeMillis()));

        // Time performance for AVL tree
        AVLTree<Integer> avlTree = new AVLTree<>();
        startTime = System.currentTimeMillis();
        for (Integer i : data)
            avlTree.insert(i);
        System.out.println("AVL insert time is " + (startTime - System.currentTimeMillis()));

        Collections.shuffle(data);

        startTime = System.currentTimeMillis();
        for (Integer i : data)
            avlTree.search(i);
        System.out.println("AVL search time is " + (startTime - System.currentTimeMillis()));

        Collections.shuffle(data);
        for (Integer i : data)
            avlTree.delete(i);
        System.out.println("AVL delete time is " + (startTime - System.currentTimeMillis()));
    }
}
