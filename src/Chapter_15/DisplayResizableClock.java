package Chapter_15;

import Chapter_14.ClockPane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayResizableClock extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a clock and label
        ClockPane clock = new ClockPane();
        String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);

        // Place clock and label in border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("DisplayClock");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.widthProperty().addListener(ov ->
            clock.setW(pane.getWidth())
        );

        pane.heightProperty().addListener(ov ->
            clock.setH(pane.getHeight())
        );
    }
}
