package Chapter_15;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        // Add an image view and add it to pane
        ImageView imageView = new ImageView("file:/C:/Users/Константин/IdeaProjects" +
                "/Introduction_to_java/book/image/us.gif");
        pane.getChildren().add(imageView);

        // Create a path transition
        PathTransition pt = new PathTransition(Duration.millis(10000),
                new Line(100, 200, 100, 0), imageView);
        pt.setCycleCount(5);
        pt.play();  // Start animation

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("FlagRisingAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
