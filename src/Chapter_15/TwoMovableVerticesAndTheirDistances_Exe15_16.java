package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoMovableVerticesAndTheirDistances_Exe15_16 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle circle1 = new Circle(40, 40, 10);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        Circle circle2 = new Circle(120, 150, 10);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        Line line = new Line(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(),
                circle2.getCenterY());
        line.startXProperty().bind(circle1.centerXProperty());
        line.startYProperty().bind(circle1.centerYProperty());
        line.endXProperty().bind(circle2.centerXProperty());
        line.endYProperty().bind(circle2.centerYProperty());

        double distance = getDistance(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(),
                circle2.getCenterY());
        Text text = new Text((40 + 120) / 2, (40 + 150) / 2, distance + "");

        pane.getChildren().addAll(line, text, circle1, circle2);

        circle1.setOnMouseDragged(e -> {
            pane.getChildren().remove(text);
            circle1.setCenterX(e.getX());
            circle1.setCenterY(e.getY());
            double distance1 = getDistance(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(),
                    circle2.getCenterY());
            text.setX((circle1.getCenterX() + circle2.getCenterX()) / 2);
            text.setY((circle1.getCenterY() + circle2.getCenterY()) / 2);
            text.setText(distance1 + "");
            pane.getChildren().add(text);
        });

        circle2.setOnMouseDragged(e -> {
            pane.getChildren().remove(text);
            circle2.setCenterX(e.getX());
            circle2.setCenterY(e.getY());
            double distance1 = getDistance(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(),
                    circle2.getCenterY());
            text.setX((circle1.getCenterX() + circle2.getCenterX()) / 2);
            text.setY((circle1.getCenterY() + circle2.getCenterY()) / 2);
            text.setText(distance1 + "");
            pane.getChildren().add(text);
        });



        primaryStage.setScene(new Scene(pane, 400, 200));
        primaryStage.setTitle("MovableVerticesAndTheirDistance");
        primaryStage.show();
    }

    /** Return a distance between two points */
    public static double getDistance(double startX, double startY, double endX, double endY) {
        double distance = Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
        return distance;
    }
}
