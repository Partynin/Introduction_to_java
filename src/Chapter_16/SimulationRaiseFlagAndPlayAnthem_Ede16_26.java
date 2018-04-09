package Chapter_16;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SimulationRaiseFlagAndPlayAnthem_Ede16_26 extends Application {
    private final static String URLBase =
            "file:/C:/Users/Константин/IdeaProjects/Introduction_to_java/book";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Line linePath = new Line(220, 300, 220, 50);
        linePath.setVisible(false);

        Image imageFlag = new Image(URLBase + "/image/flag2.gif");
        ImageView ivFlag = new ImageView(imageFlag);
        MediaPlayer mp = new MediaPlayer(new Media(URLBase + "/audio/anthem2.mp3"));
        mp.play();

        pane.getChildren().addAll(linePath, ivFlag);

        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(14000));
        pt.setPath(linePath);
        pt.setNode(ivFlag);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play();

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("SimulationRaiseFlagPlayAnthem"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
