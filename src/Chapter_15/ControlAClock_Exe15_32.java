package Chapter_15;

import Chapter_14.ClockPane;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;


public class ControlAClock_Exe15_32 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();
        ClockPane clock = new ClockPane();
        HBox box = new HBox(5);

        EventHandler<ActionEvent> eventEventHandler = e -> {
            clock.setCurrentTime();
        };

        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(1000), eventEventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        Button btStart = new Button("Start");
        Button btStop = new Button("Stop");
        box.getChildren().addAll(btStart, btStop);

        btStart.setOnAction(e -> animation.play());

        btStop.setOnAction(e -> animation.pause());

        pane.setCenter(clock);
        pane.setBottom(box);
        box.setAlignment(Pos.CENTER);

        primaryStage.setScene(new Scene(pane, 250, 290));
        primaryStage.setTitle("ControlAClock");
        primaryStage.show();
    }
}
