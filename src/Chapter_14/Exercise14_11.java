package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Exercise14_11 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Circle circle = new Circle(130, 130, 100);
        circle.setFill(null);
        circle.setStroke(Color.BLACK);

        Ellipse ellipseL = new Ellipse(80, 100, 30, 20);
        ellipseL.setStroke(Color.BLACK);
        ellipseL.setFill(null);

        Ellipse ellipseR = new Ellipse(180, 100, 30, 20);
        ellipseR.setStroke(Color.BLACK);
        ellipseR.setFill(null);

        Polygon polygon = new Polygon(130, 120, 150, 160, 110, 160);
        polygon.setStroke(Color.BLACK);
        polygon.setFill(null);

        Circle circle1L = new Circle(80, 100, 10);
        Circle circle1R = new Circle(180, 100, 10);

        Arc arc = new Arc(130, 180, 50, 30, 0, -180);
        arc.setFill(null);
        arc.setStrokeWidth(5);
        arc.setStroke(Color.RED);


        pane.getChildren().addAll(circle, ellipseL, ellipseR, polygon, circle1L, circle1R, arc);

        Scene scene = new Scene(pane, 280, 280);
        primaryStage.setTitle("Exercise14_11");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
