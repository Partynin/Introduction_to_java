package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoCircleAndTheirDistance_Ede14_21 extends Application {
    private static double width = 300;
    private static double height = 300;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        double centerX1 = 15 + Math.random() * (width - 30);
        double centerY1 = 15 + Math.random() * (height - 30);
        double centerX2 = 15 + Math.random() * (width - 30);
        double centerY2 = 15 + Math.random() * (height - 30);
        Circle circle1 = new Circle(centerX1, centerY1, 15);
        Circle circle2 = new Circle(centerX2, centerY2, 15);
        Line line = new Line(centerX1, centerY1, centerX2, centerY2);

        double dist = getDistance(centerX1, centerY1, centerX2, centerY2);
        pane.getChildren().add(new Text((centerX1 + centerX2) / 2,
                (centerY1 + centerY2) / 2, dist + ""));

        pane.getChildren().addAll(circle1, circle2, line);

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("TwoCirclesAndTheirDistance");
        primaryStage.show();
    }

    /** Return a distance between two points */
    public static double getDistance(double startX, double startY, double endX, double endY) {
        double distance = Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
        return distance;
    }
}
