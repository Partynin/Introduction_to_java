package Chapter_14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setHgap(5);
        pane.setVgap(5);

        ImageView image1 = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/flag5.gif");
        ImageView image2 = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/flag2.gif");
        ImageView image3 = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/flag3.gif");
        ImageView image4 = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/flag6.gif");

        pane.add(image1, 0, 0);
        pane.add(image2, 0, 1);
        pane.add(image3, 1, 0);
        pane.add(image4, 1, 1);

        Scene scene = new Scene(pane, 900, 500);
        primaryStage.setTitle("Exercise14_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
