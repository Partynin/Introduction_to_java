package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ConnectTwoCircles_Exe14_22 extends Application {
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
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        Circle circle2 = new Circle(centerX2, centerY2, 15);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        Line line = new Line(centerX1, centerY1, centerX2, centerY2);

        pane.getChildren().addAll(line, circle1, circle2);
        pane.getChildren().add(new Text(centerX1, centerY1, "1"));
        pane.getChildren().add(new Text(centerX2, centerY2, "2"));

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("ConnectTwoCircles");
        primaryStage.show();
    }
}
