package Chapter_15;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ChangeOpacity_Exe15_26 extends Application {
    private double width = 300;
    private double height = 300;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Arc arc = new Arc(150, 150, 100, 50, -20, -140);
        arc.setFill(null);
        arc.setStroke(Color.BLACK);
        Circle circle = new Circle(150, 200, 10);
        circle.setFill(Color.RED);

        pane.getChildren().addAll(arc, circle);

        // Create a path transition
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(arc);
        pt.setNode(circle);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play(); // Start animation

        // Apply a fade transition to circle
        FadeTransition ft = new FadeTransition(Duration.millis(2000), circle);
        ft.setFromValue(0.1);
        ft.setToValue(1.0);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play(); // Start animation

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("AnimationPalindrome");
        primaryStage.show();
    }
}
