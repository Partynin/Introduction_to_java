package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;



public class CheckPoint extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(200, 200, 20);
        circle.setFill(Color.BLUE);
        Rectangle rectangle = new Rectangle(150, 150,15,15);
        rectangle.setStyle("-fx-fill: gold;");

        Line line = new Line(10, 10, 70, 30);
        line.setStrokeWidth(10);

        Rectangle r3 = new Rectangle(10, 10, 100, 200);
        r3.setArcWidth(40);
        r3.setArcHeight(20);

        Ellipse ellipse = new Ellipse(70, 20, 50, 100);

        Arc arc = new Arc(100, 100, 50, 50, 0, 180);
        arc.setStroke(Color.GREEN);
        arc.setFill(null);

        Arc arc1 = new Arc(100, 110, 50, 50, 0, -180);
        arc1.setFill(Color.RED);

        Polygon polygon = new Polygon(20, 40, 30, 50, 40, 90, 90 , 10, 10, 30);
        polygon.setFill(Color.GREEN);


        Pane pane = new Pane(arc, arc1, polygon);

        Scene scene = new Scene(pane, 200, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Test");
        primaryStage.show();
    }
}
