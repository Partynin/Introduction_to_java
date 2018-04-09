package Chapter_15;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BallPane2 extends Pane {
    public final double radius = 30;
    private double x = radius, y = radius;
    private Circle circle = new Circle(x, y, radius);

    public BallPane2() {
        circle.setFill(Color.RED);
        getChildren().add(circle);
        setStyle("-fx-background-color: blue;");
    }

    public BallPane2(double width, double height) {
        circle.setFill(Color.RED);
        getChildren().addAll(circle);
    }

    public void moveLeft() {
        if (circle.getCenterX() - 1 < radius)
            return;
        else circle.setCenterX(circle.getCenterX() - 1);
    }

    public void moveRight() {
        if (getWidth() - 1 - circle.getCenterX() < radius)
            return;
        circle.setCenterX(circle.getCenterX() + 1);
    }

    public void moveUp() {
        if (circle.getCenterY() - 1 < radius)
            return;
        circle.setCenterY(circle.getCenterY() - 1);
    }

    public void moveDown() {
        if (getHeight() - 1 - circle.getCenterY() < radius)
            return;
        circle.setCenterY(circle.getCenterY() + 1);
    }
}
