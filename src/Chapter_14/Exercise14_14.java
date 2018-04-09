package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise14_14 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new RectanguloidPane(), 240, 240);
        primaryStage.setTitle("Exercise14_14"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}

class RectanguloidPane extends Pane {
    public RectanguloidPane() {
        Line lineRecFront1 = new Line(20, 80, 20, 200);
        lineRecFront1.endYProperty().bind(heightProperty().subtract(40));
        lineRecFront1.setStrokeWidth(3);
        lineRecFront1.setStroke(Color.GREEN);

        Line lineRecFront2 = new Line(20, 80, 200, 80);
        lineRecFront2.endXProperty().bind(widthProperty().subtract(40));
        lineRecFront2.setStrokeWidth(3);
        lineRecFront2.setStroke(Color.GREEN);

        Line lineRecFront3 = new Line(200, 80, 200, 200);
        lineRecFront3.startXProperty().bind(widthProperty().subtract(40));
        lineRecFront3.endXProperty().bind(widthProperty().subtract(40));
        lineRecFront3.endYProperty().bind(heightProperty().subtract(40));
        lineRecFront3.setStrokeWidth(3);
        lineRecFront3.setStroke(Color.GREEN);

        Line lineRecFront4 = new Line(20, 200, 200, 200);
        lineRecFront4.startYProperty().bind(heightProperty().subtract(40));
        lineRecFront4.endXProperty().bind(widthProperty().subtract(40));
        lineRecFront4.endYProperty().bind(heightProperty().subtract(40));
        lineRecFront4.setStrokeWidth(3);
        lineRecFront4.setStroke(Color.GREEN);


        Line lineRecBack1 = new Line(30, 70, 30, 190);
        lineRecBack1.endYProperty().bind(heightProperty().subtract(50));
        lineRecBack1.setStrokeWidth(3);
        lineRecBack1.setStroke(Color.GREEN);

        Line lineRecBack2 = new Line(30, 70, 210, 70);
        lineRecBack2.endXProperty().bind(widthProperty().subtract(30));
        lineRecBack2.setStrokeWidth(3);
        lineRecBack2.setStroke(Color.GREEN);

        Line lineRecBack3 = new Line(210, 70, 210, 190);
        lineRecBack3.startXProperty().bind(widthProperty().subtract(30));
        lineRecBack3.endXProperty().bind(widthProperty().subtract(30));
        lineRecBack3.endYProperty().bind(heightProperty().subtract(50));
        lineRecBack3.setStrokeWidth(3);
        lineRecBack3.setStroke(Color.GREEN);

        Line lineRecBack4 = new Line(30, 190, 210, 190);
        lineRecBack4.startYProperty().bind(heightProperty().subtract(50));
        lineRecBack4.endXProperty().bind(widthProperty().subtract(30));
        lineRecBack4.endYProperty().bind(heightProperty().subtract(50));
        lineRecBack4.setStrokeWidth(3);
        lineRecBack4.setStroke(Color.GREEN);

        Line lineLeftTop = new Line(20, 80, 30, 70);
        lineLeftTop.setStrokeWidth(3);
        lineLeftTop.setStroke(Color.GREEN);

        Line lineRightTop = new Line(200, 80, 210, 70);
        lineRightTop.startXProperty().bind(widthProperty().subtract(40));
        lineRightTop.endXProperty().bind(widthProperty().subtract(30));
        lineRightTop.setStrokeWidth(3);
        lineRightTop.setStroke(Color.GREEN);



        getChildren().addAll(lineRecFront1, lineRecFront2, lineRecFront3, lineRecFront4,
                lineRecBack1, lineRecBack2, lineRecBack3, lineRecBack4, lineLeftTop, lineRightTop);
    }
}
