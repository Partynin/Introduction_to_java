package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GeometryFindTheBoundingRectangle_Ede15_17 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Rectangle rectangleText = new Rectangle(20, 10, 120, 50);
        Rectangle rectanglePoints = new Rectangle(200, 30, 150, 150);
        rectangleText.setFill(Color.WHITE);
        rectangleText.setStroke(Color.BLACK);
        rectanglePoints.setFill(null);
        rectanglePoints.setStroke(Color.BLACK);
        Text text = new Text(25, 25,
                "INSTRUCTION\nAdd: Left Click\nRemove: Right Click");

        pane.getChildren().addAll(rectanglePoints, rectangleText, text);

        pane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY &&
                    (e.getX() > rectanglePoints.getX() + 10) &&
                    (e.getX() < rectanglePoints.getX() + rectanglePoints.getWidth() - 10) &&
                    (e.getY() > rectanglePoints.getY() + 10) &&
                    (e.getY() < rectanglePoints.getY() + rectanglePoints.getHeight() - 10)) {
                Circle circle = new Circle(e.getX(), e.getY(), 10);
                circle.setFill(Color.WHITE);
                circle.setStroke(Color.BLACK);
                pane.getChildren().add(circle);
            }
            if (e.getButton() == MouseButton.SECONDARY  &&
                    (e.getX() > rectanglePoints.getX() + 10) &&
                    (e.getX() < rectanglePoints.getX() + rectanglePoints.getWidth() - 10) &&
                    (e.getY() > rectanglePoints.getY() + 10) &&
                    (e.getY() < rectanglePoints.getY() + rectanglePoints.getHeight() - 10)) {
                for (int i = 0; i < pane.getChildren().size(); i++) {
                    if (pane.getChildren().get(i).contains(e.getX(), e.getY())) {
                        pane.getChildren().remove(i);
                        break;
                    }
                }
            }
        });

        primaryStage.setScene(new Scene(pane, 400, 200));
        primaryStage.setTitle("FindTheBoundingRectangle");
        primaryStage.show();
    }
}
