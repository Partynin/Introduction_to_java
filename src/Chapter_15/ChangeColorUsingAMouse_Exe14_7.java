package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeColorUsingAMouse_Exe14_7 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();

        Circle circle = new Circle(50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        circle.setOnMousePressed(event -> {
            circle.setFill(Color.BLACK);
        });

        circle.setOnMouseReleased(event -> {
            circle.setFill(Color.WHITE);
        });

        pane.getChildren().add(circle);

        primaryStage.setScene(new Scene(pane, 200, 200));
        primaryStage.setTitle("ChangeColorUsingMouse");
        primaryStage.show();
    }
}
