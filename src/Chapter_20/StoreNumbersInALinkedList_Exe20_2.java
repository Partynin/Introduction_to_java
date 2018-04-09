package Chapter_20;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.*;

/** *20.2 (Store numbers in a linked list) Write a program that lets the user enter numbers
 from a graphical user interface and displays them in a text area, as shown in
 Figure 20.17a. Use a linked list to store the numbers. Do not store duplicate numbers.
 Add the buttons Sort, Shuffle, and Reverse to sort, shuffle, and reverse the list. */

public class StoreNumbersInALinkedList_Exe20_2 extends Application {
    private VBox getPane() {
        VBox mainPane = new VBox();

        HBox paneForEnterANumber = new HBox(5);
        Label lbEnterANumber = new Label("Enter a number");
        TextField tfEnterANumber = new TextField();
        paneForEnterANumber.getChildren().addAll(lbEnterANumber, tfEnterANumber);
        paneForEnterANumber.setAlignment(Pos.CENTER);

        TextArea textArea = new TextArea();

        HBox paneForButtons = new HBox(5);
        Button btSort = new Button("Sort");
        Button btShuffle = new Button("Shuffle");
        Button btRevers = new Button("Revers");
        paneForButtons.getChildren().addAll(btSort, btShuffle, btRevers);
        paneForButtons.setAlignment(Pos.CENTER);

        mainPane.getChildren().addAll(paneForEnterANumber,textArea, paneForButtons);

        List<Integer> list = new LinkedList<>();

        tfEnterANumber.setOnAction(e -> {
            String s = tfEnterANumber.getText();
            Scanner input = new Scanner(s);
            while (input.hasNext()) {
                int number = Integer.parseInt(input.next());
                Iterator<Integer> iterator = list.iterator();
                boolean flag = false;
                while (iterator.hasNext()) {
                    if (iterator.next() == number)
                        flag = true;
                }
                if (!flag)
                    list.add(number);
            }

            textArea.clear();
            textArea.setText(list.toString());
        });

        btSort.setOnAction(e -> {
            Collections.sort(list);
            textArea.clear();
            textArea.setText(list.toString());
        });

        btShuffle.setOnAction(e -> {
            Collections.shuffle(list);
            textArea.clear();
            textArea.setText(list.toString());
        });

        btRevers.setOnAction(e -> {
            Collections.reverse(list);
            textArea.clear();
            textArea.setText(list.toString());
        });

        return mainPane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place the pane in the stage
         Scene scene = new Scene(getPane(), 350, 200);
         primaryStage.setTitle("MultipleBounceBall"); // Set the stage title
         primaryStage.setScene(scene); // Place the scene in the stage
         primaryStage.show(); // Display the stage
    }
}
