package Chapter_15;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlAMovingText_Exe15_27 extends Application {
    private double width = 200;
    private double height = 80;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Text text = new Text(0, height / 2, "Programming is fun");
        Line line = new Line(-50, height / 2, 250, height / 2);

        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(3000));
        pt.setPath(line);
        pt.setNode(text);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(false);
        pt.play();

        pane.getChildren().add(text);

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("ControlAMovingText");
        primaryStage.show();

        pane.setOnMousePressed(e -> pt.pause());

        pane.setOnMouseReleased(e -> pt.play());
    }
}
