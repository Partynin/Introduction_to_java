package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MoveARectangleUsingMouse_Exe15_18 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        double width = 500;
        double height = 500;

        Rectangle rectangle = new Rectangle(width / 2.5, height / 2.5, 100, 50);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        Pane pane = new Pane(rectangle);

        rectangle.setOnMouseDragged(e -> {
            rectangle.setX(e.getX() - rectangle.getWidth() / 2);
            rectangle.setY(e.getY() - rectangle.getHeight() / 2);
        });

        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.setTitle("MoveTheRectangle");
        primaryStage.show();
    }


}
