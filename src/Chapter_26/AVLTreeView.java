package Chapter_26;

import Chapter_25.BST;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class AVLTreeView extends Pane {
    private AVLTree<Integer> tree = new AVLTree<>();
    private double radius = 15; // Tree node radius
    private double vGap = 50; // Gap between two levels in a tree

    AVLTreeView(AVLTree<Integer> tree) {
        this.tree = tree;
        setStatus("Tree is empty");
    }

    public void setStatus(String msg) {
        getChildren().add(new Text(20, 20, msg));
    }

    public void displayTree() {
        this.getChildren().clear();
        if (tree.getRoot() != null) {
            displayTree(tree.getRoot(), getWidth() / 2, vGap, getWidth() / 4);
        }
    }

    /** Display a subtree */
    private void displayTree(BST.TreeNode<Integer> root, double x, double y, double hGap) {
        if (root.left != null) {
            // Draw a line to the left node
            getChildren().add(new Line(x - hGap, y + vGap, x, y));
            // Draw the left subtree recursively
            displayTree(root.left, x - hGap, y + vGap, hGap / 2);
            }

         if (root.right != null) {
            // Draw a line to the right node
            getChildren().add(new Line(x + hGap, y + vGap, x, y));
            // Draw the right subtree recursively
            displayTree(root.right, x + hGap, y + vGap, hGap / 2);
            }

         // Display a node
         Circle circle = new Circle(x, y, radius);
         int balanceFactorValue = (tree.balanceFactor((AVLTree.AVLTreeNode<Integer>) root));
         Text textBalance = new Text(x - 3, y + 27, Integer.toString(balanceFactorValue));
         circle.setFill(Color.GREENYELLOW);
         circle.setStroke(Color.BLACK);
         getChildren().addAll(circle, textBalance,
                 new Text(x - 4, y + 4, root.element + ""));
    }
}
