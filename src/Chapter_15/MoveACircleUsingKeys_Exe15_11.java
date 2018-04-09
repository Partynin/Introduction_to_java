package Chapter_15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveACircleUsingKeys_Exe15_11 extends Application {
    private double width = 300;
    private double height = 300;
    private Circle circle = new Circle(width / 2, height / 2,40);
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLUE);

        pane.getChildren().add(circle);

        circle.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP: moveUp(); break;
                case DOWN: moveDown(); break;
                case RIGHT: moveRight(); break;
                case LEFT: moveLeft(); break;
            }
        });

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("MoveACircleUsingKeys");
        primaryStage.show();

        circle.requestFocus();
    }

    public void moveUp() {
        circle.setCenterY(circle.getCenterY() - 10);
    }

    public void moveDown() {
        circle.setCenterY(circle.getCenterY() + 10);
    }

    public void moveRight() {
        circle.setCenterX(circle.getCenterX() + 10);
    }

    public void moveLeft() {
        circle.setCenterX(circle.getCenterX() - 10);
    }
}
