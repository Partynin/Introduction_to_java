package Chapter_26;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


/** *26.1 (Display AVL tree graphically) Write a program that displays an AVL tree along
 with its balance factor for each node. */

public class DisplayAVLTreeGraphically_Exe26_1 extends Application {
    public static final int WIDTH = 450;
    public static final int HEIGHT = 250;

    @Override
    public void start(Stage primaryStage) throws Exception {
        AVLTree<Integer> tree = new AVLTree<>(); // Create a tree

        BorderPane pane = new BorderPane();
        AVLTreeView view = new AVLTreeView(tree); // Create a AVL
        pane.setCenter(view);

        TextField tfKeyNode = new TextField();
        tfKeyNode.setPrefColumnCount(3);
        tfKeyNode.setAlignment(Pos.BASELINE_RIGHT);
        Button btInsert = new Button("Insert");
        Button btDelete = new Button("Delete");
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("Enter a key: "), tfKeyNode, btInsert, btDelete);
        hBox.setAlignment(Pos.CENTER);
        pane.setBottom(hBox);

        btInsert.setOnAction(e -> {
             int key = Integer.parseInt(tfKeyNode.getText());
             if (tree.search(key)) { // key is in the tree already
                 view.displayTree();
                 view.setStatus(key + " is already in the AVL tree");
                 } else {
                 tree.insert(key); // Insert a new key
                 view.displayTree();
                 view.setStatus(key + " is inserted in the AVL tree");
                 }
             });

         btDelete.setOnAction(e -> {
             int key = Integer.parseInt(tfKeyNode.getText());
             if (!tree.search(key)) { // key is not in the tree
                 view.displayTree();
                 view.setStatus(key + " is not in the tree");
                 } else {
                 tree.delete(key); // Delete a key
                 view.displayTree();
                 view.setStatus(key + " is deleted from the tree");
                 }
             });

         // Create a scene and place the pane in the stage
         Scene scene = new Scene(pane, WIDTH, HEIGHT);
         primaryStage.setTitle("BSTAnimation"); // Set the stage title
         primaryStage.setScene(scene); // Place the scene in the stage
         primaryStage.show(); // Display the stage
         }
}
