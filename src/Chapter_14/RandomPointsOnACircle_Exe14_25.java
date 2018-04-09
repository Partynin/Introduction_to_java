package Chapter_14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class RandomPointsOnACircle_Exe14_25 extends Application {
    private static double width = 300;
    private static double height = 300;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        // Add points to the polygon list
        ObservableList<Double> list = polygon.getPoints();
        // Get random angels
        ArrayList<Double> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(Math.random() * (2 * Math.PI));
        }
        // Sort the random angels
        Collections.sort(list1);
        for (int i = 0; i < 5; i++) {
            // Random point on circle
            double x1 = width / 2 + (40 * Math.cos(list1.get(i)));
            double y1 = height / 2 + (40 * Math.sin(list1.get(i)));
            list.add(x1);
            list.add(y1);
        }

        Circle circle = new Circle(width / 2, height / 2, 40);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        pane.getChildren().addAll(circle, polygon);

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("RandomPointsOnACircle");
        primaryStage.show();
    }
}
