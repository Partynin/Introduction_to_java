package Chapter_16;

import Chapter_15.BallPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BounceBallSlider extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BallPane ballPane = new BallPane();
        Slider slSpeed = new Slider();
        slSpeed.setMax(20);
        ballPane.rateProperty().bind(slSpeed.valueProperty());

        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setBottom(slSpeed);

        // Create a scene and palace it in the stage
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("BounceBallSlider");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
