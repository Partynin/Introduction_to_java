package Chapter_15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class PickFourCards_Exe_15_1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);
        Button btRefresh = new Button("Refresh");

        HBox box = new HBox(5);
        box.setPadding(new Insets(5, 5, 5, 5));
        setRandomCords(box);

        vBox.getChildren().addAll(box, btRefresh);

        btRefresh.setOnAction(e -> setRandomCords(box));

        Scene scene = new Scene(vBox, 315, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PickFourCards");
        primaryStage.show();
    }

    /** Create a FlowPane with three cards */
    public void setRandomCords(HBox box) {
        ArrayList<Integer> array = new ArrayList<>();
        // Fill array integers
        for (int i = 1; i < 53; i++) {
            array.add(i);
        }
        Collections.shuffle(array);

        ImageView image1 = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/card/" + array.get(0) + ".png");
        ImageView image2 = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/card/" + array.get(1) + ".png");
        ImageView image3 = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/card/" + array.get(2) + ".png");
        ImageView image4 = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/card/" + array.get(3) + ".png");

        box.getChildren().clear();
        box.getChildren().addAll(image1, image2, image3, image4);
    }
}
