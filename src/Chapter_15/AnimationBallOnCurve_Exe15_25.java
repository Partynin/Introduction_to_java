package Chapter_15;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationBallOnCurve_Exe15_25 extends Application {
    private static double width = 400;
    private static double height = 200;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Circle circle = new Circle(10);
        circle.setFill(Color.GREEN);

        Polyline polylineSin = new Polyline();
        ObservableList<Double> list = polylineSin.getPoints();
        double scaleFactor = 50;
        for (int x = -170; x <= 170; x++) {
            list.add(x + 200.0);
            list.add(100 - scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI));
        }
        polylineSin.setStroke(Color.RED);

        Line lineY = new Line(200, 10, 200, 190);
        Line lineX = new Line(10, 100, 390, 100);
        Polyline polylineY = new Polyline(195, 15, 200, 10, 205, 15);
        Polyline polylineX = new Polyline(385, 95, 390, 100, 385, 105);
        pane.getChildren().add(new Text(210, 15, "y"));
        pane.getChildren().add(new Text(385, 90, "x"));
        pane.getChildren().add(new Text(205, 113, "0"));
        pane.getChildren().add(new Text(255, 113, "\u03c0"));
        pane.getChildren().add(new Text(355, 113, "2\u03c0"));
        pane.getChildren().add(new Text(155, 113, "-\u03c0"));
        pane.getChildren().add(new Text(55, 113, "-2\u03c0"));

        pane.getChildren().addAll(polylineSin, lineX, lineY,
                polylineX, polylineY, circle);

        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(polylineSin);
        pt.setNode(circle);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(false);
        pt.play();

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("PlotTheSineAndCosine");
        primaryStage.show();

        pane.setOnMouseClicked(e -> {
            if(e.getButton() == MouseButton.PRIMARY)
                pt.pause();
            if(e.getButton() == MouseButton.SECONDARY)
                pt.play();
        });
    }
}
