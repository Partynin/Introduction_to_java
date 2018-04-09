package Chapter_14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise14_3 extends Application {
    private static ArrayList<Integer> array = new ArrayList<>();
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Fill array integers
        for (int i = 1; i < 53; i++) {
            array.add(i);
        }

        // You can use the static shuffle method in the java.util.Collections class to perform
        // a random shuffle for the elements in a list
        Collections.shuffle(array);

        Scene scene = new Scene(createPane(array), 240, 120);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise14_3");
        primaryStage.show();
    }

    /** Create a FlowPane with three cards */
    public static FlowPane createPane(ArrayList<Integer> array) {
        ImageView image1 = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/card/" + array.get(0) + ".png");
        ImageView image2 = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/card/" + array.get(1) + ".png");
        ImageView image3 = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/card/" + array.get(2) + ".png");

        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setHgap(5);
        pane.getChildren().addAll(image1, image2, image3);

        return pane;
    }
}
