package Chapter_14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class ShowPolyline extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a pane, a polyline, and place polyline to pane
        Pane pane = new Pane();
        Polyline polyline = new Polyline();
        pane.getChildren().add(polyline);
        polyline.setFill(Color.WHITE);
        polyline.setStroke(Color.BLACK);
        ObservableList<Double> list = polyline.getPoints();

        final double WIDTH = 200, HEIGHT = 200;
        double centerX = WIDTH / 2, centerY = HEIGHT / 2;
        double radius = Math.min(WIDTH, HEIGHT) * 0.4;

        // Add points to the polyline list
        for (int i = 0; i < 6; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
            list.add(centerY + radius * Math.sin(2 * i * Math.PI / 6));
        }

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("ShowPolygon");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
