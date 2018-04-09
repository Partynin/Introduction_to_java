package Chapter_14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise14_8 extends Application {
    private static ArrayList<Integer> array = new ArrayList<>();
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(3, 3, 3, 3));
        pane.setHgap(3);
        pane.setVgap(3);

        // Fill array integers
        for (int i = 1; i < 55; i++) {
            array.add(i);
        }

        // You can use the static shuffle method in the java.util.Collections class to perform
        // a random shuffle for the elements in a list
        Collections.shuffle(array);

        int count = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                pane.add(getImageView(array.get(count)), i, j);
                count++;
            }
        }

        Scene scene = new Scene(pane, 678, 597);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise14_3");
        primaryStage.show();
    }

    /** Return ImageView with specified number for deck cards */
    public static ImageView getImageView(int x) {
        ImageView image1 = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/card/" + x + ".png");
        return image1;
    }
}
