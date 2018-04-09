package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GeometryInsideACircle_Exe15_12 extends Application {
    private Pane pane = new Pane();
    private double width = 400;
    private double height = 150;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(100, 60, 50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        pane.getChildren().add(circle);

        pane.setOnMouseMoved(e -> {
            pane.getChildren().clear();
            Text text = new Text(e.getX(), e.getY(), "Mouse point is " +
                    (circle.contains(e.getX(), e.getY()) ? "inside" : "outside") + " " +
                    "the circle");
            pane.getChildren().addAll(circle, text);
        });

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("GeometryInsideACircle");
        primaryStage.show();
    }
}
