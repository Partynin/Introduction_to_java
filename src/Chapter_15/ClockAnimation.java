package Chapter_15;

import Chapter_14.ClockPane;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ClockAnimation extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ClockPane clock = new ClockPane(); // Create a clock

        // Create a handler for animation
        EventHandler<ActionEvent> eventHandler = e -> {
            clock.setCurrentTime(); // Set a new clock time
        };

        // Create an animation for running clock
        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(1000), eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        // Create a scene and place it in the stage
        Scene scene = new Scene(clock, 250, 250);
        primaryStage.setTitle("ClockAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
