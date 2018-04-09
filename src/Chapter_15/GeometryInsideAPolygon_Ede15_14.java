package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GeometryInsideAPolygon_Ede15_14 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Polygon polygon = new Polygon(40, 20, 70, 40, 60, 80, 45, 45, 20, 60);
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);

        pane.getChildren().add(polygon);

        pane.setOnMouseMoved(e -> {
            pane.getChildren().clear();
            Text text = new Text(e.getX(), e.getY(), "Mouse point is " +
                    (polygon.contains(e.getX(), e.getY()) ? "inside" : "outside") +
            " the polygon");
            pane.getChildren().addAll(polygon, text);
        });

        primaryStage.setScene(new Scene(pane, 400, 200));
        primaryStage.setTitle("InsideThePolygon");
        primaryStage.show();
    }
}
