package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise14_10 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Ellipse ellipse = new Ellipse(150, 70, 100, 50);
        ellipse.setFill(null);
        ellipse.setStroke(Color.BLACK);
        pane.getChildren().add(ellipse);

        Line lineL = new Line(50, 70, 50, 270);
        Line lineR = new Line(250, 70, 250, 270);
        pane.getChildren().addAll(lineL, lineR);

        Arc arc = new Arc(150, 270, 100, 50, 0, -180);
        arc.setFill(null);
        arc.setType(ArcType.OPEN);
        arc.setStroke(Color.BLACK);

        Arc arcAbove = new Arc(150, 270, 100, 50, 0, 180);
        arcAbove.setFill(null);
        arcAbove.setType(ArcType.OPEN);
        arcAbove.getStrokeDashArray().addAll(6.0, 15.0);
        arcAbove.setStroke(Color.BLACK);

        pane.getChildren().addAll(arc, arcAbove);

        Scene scene = new Scene(pane, 300, 450);
        primaryStage.setTitle("Exercise14_10");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
