package Chapter_15;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GeometryPendulum_Exe15_31 extends Application {
    private double width = 300;
    private double height = 300;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Arc arc = new Arc(150, 150, 100, 50,
                -30, -130);
        arc.setFill(null);
        arc.setVisible(false);
        arc.setStroke(Color.BLACK);
        Circle circle = new Circle(150, 200, 10);
        circle.setFill(Color.RED);
        Circle circle1 = new Circle(150, 30, 5);
        Line line = new Line(150, 30, circle.getCenterX(), circle.getCenterY());
        /** Defines the x coordinate of the translation that is added to this Node's transform.
         The node's final translation will be computed as layoutX + translateX, where layoutX
         establishes the node's stableposition and translateX optionally makes dynamic adjustments
         to that position. */
        line.endXProperty().bind(circle.translateXProperty().add(circle.getCenterX()));
        line.endYProperty().bind(circle.translateYProperty().add(circle.getCenterY()));

        pane.getChildren().addAll(arc, line, circle, circle1);

        // Create a path transition
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(arc);
        pt.setNode(circle);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play(); // Start animation

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("AnimationPalindrome");
        primaryStage.show();
    }
}
