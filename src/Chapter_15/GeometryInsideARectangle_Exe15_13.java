package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GeometryInsideARectangle_Exe15_13 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Rectangle rectangle = new Rectangle(100, 60, 100, 40);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        pane.getChildren().add(rectangle);

        pane.setOnMouseMoved(e -> {
            pane.getChildren().clear();
            Text text = new Text(e.getX(), e.getY(), "Mouse point is " +
                    (rectangle.contains(e.getX(), e.getY()) ? "inside" : "outside") +
                    " the rectangle");
            pane.getChildren().addAll(rectangle, text);
        });

        primaryStage.setScene(new Scene(pane, 400, 200));
        primaryStage.setTitle("InsideRectangle");
        primaryStage.show();
    }
}
