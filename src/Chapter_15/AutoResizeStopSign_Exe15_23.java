package Chapter_15;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AutoResizeStopSign_Exe15_23 extends Application {
    private double WIDTH = 400;
    private double HEIGHT = 400;
    private double CENTER_X = WIDTH / 2;
    private double CENTER_Y = HEIGHT /2;
    private double RADIUS = WIDTH * 0.4;
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();

        Polygon polygon = new Polygon();
        polygon.setFill(Color.RED);
        polygon.setStroke(Color.BLACK);
        ObservableList<Double> points = polygon.getPoints();

        for (int i = 0; i < 8; i++) {
            points.add(CENTER_X + RADIUS * Math.cos(Math.toRadians(i * 45 + 45 / 2)));
            points.add(CENTER_Y - RADIUS * Math.sin(Math.toRadians(i * 45 + 45 / 2)));
        }

        Text text = new Text("STOP");
        text.setFont(Font.font(100));
        text.setFill(Color.WHITE);

        pane.getChildren().addAll(polygon, text);

        primaryStage.setScene(new Scene(pane, WIDTH, HEIGHT));
        primaryStage.setTitle("Exercise14_15");
        primaryStage.show();

        pane.widthProperty().addListener(ov -> {
            points.clear();
            for (int i = 0; i < 8; i++) {
                points.add((pane.getWidth() * 0.4) * Math.cos(Math.toRadians(i * 45 + 45 / 2)));
                points.add((pane.getHeight() * 0.4) * Math.sin(Math.toRadians(i * 45 + 45 / 2)));
            }

        });

        pane.heightProperty().addListener(ov -> {
            points.clear();
            for (int i = 0; i < 8; i++) {
                points.add((pane.getWidth() * 0.4) * Math.cos(Math.toRadians(i * 45 + 45 / 2)));
                points.add((pane.getHeight() * 0.4) * Math.sin(Math.toRadians(i * 45 + 45 / 2)));
            }

        });
    }
}
