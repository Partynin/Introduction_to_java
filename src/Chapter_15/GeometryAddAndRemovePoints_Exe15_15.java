package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GeometryAddAndRemovePoints_Exe15_15 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        pane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                Circle circle = new Circle(e.getX(), e.getY(), 5);
                circle.setFill(Color.WHITE);
                circle.setStroke(Color.BLACK);
                pane.getChildren().add(circle);
            }
            if (e.getButton() == MouseButton.SECONDARY) {
                for (int i = 0; i < pane.getChildren().size(); i++) {
                    if (pane.getChildren().get(i).contains(e.getX(), e.getY())) {
                        pane.getChildren().remove(i);
                        break;
                    }
                }
            }
        });

        primaryStage.setScene(new Scene(pane, 400, 200));
        primaryStage.setTitle("AddAndRemovePoints");
        primaryStage.show();
    }
}
