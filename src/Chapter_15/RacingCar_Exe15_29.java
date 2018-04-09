package Chapter_15;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RacingCar_Exe15_29 extends Application {
    private double width = 300;
    private double height = 100;
    @Override
    public void start(Stage primaryStage) throws Exception {
        PaintCar paintCar = new PaintCar();

        // Pause and resume animation
        paintCar.setOnMousePressed(e -> paintCar.pause());
        paintCar.setOnMouseReleased(e -> paintCar.resume());

        paintCar.setOnKeyPressed(e -> {
            if (KeyCode.UP == e.getCode())
                paintCar.increaseSpeed();
            if (KeyCode.DOWN == e.getCode())
                paintCar.decreaseSpeed();
        });

        primaryStage.setScene(new Scene(paintCar, width, height));
        primaryStage.setTitle("RacingCar");
        primaryStage.show();

        paintCar.requestFocus();
    }

    private class PaintCar extends Pane {
        private double x;
        private double y = 50;
        private double dx = 1;
        private Rectangle rectangle;
        private Polygon polygon;
        private Circle circleLeft;
        private Circle circleRight;
        private Timeline animation;

        public PaintCar() {
            rectangle = new Rectangle(x, y - 20, 50, 10);
            rectangle.setFill(Color.NAVY);
            polygon = new Polygon(x + 10, y - 20, x + 20, y - 30, x + 30, y - 30,
                    x + 40, y - 20);
            polygon.setFill(Color.BLUE);
            circleLeft = new Circle(x + 15, y - 5, 5);
            circleRight = new Circle(x + 35, y - 5, 5);
            getChildren().addAll(rectangle, polygon, circleLeft, circleRight);

            // Create an animation for moving the car
            animation = new Timeline(
                    new KeyFrame(Duration.millis(50), e -> moveCar()));
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play();  // Start animation
        }

        // Continue animation
        public void resume() {
            animation.play();
        }

        public void pause() {
            animation.pause();
        }

        public void increaseSpeed() {
            animation.setRate(animation.getRate() + 0.1);
        }

        public void decreaseSpeed() {
            animation.setRate(
            animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
        }

        protected void moveCar() {
            x += dx;
            rectangle.setX(x);
            rectangle.setY(y - 20);
            circleLeft.setCenterX(x + 15);
            circleRight.setCenterX(x + 35);
            ObservableList list = polygon.getPoints();
            list.clear();
            list.add(x + 10);
            list.add(y - 20);
            list.add(x + 20);
            list.add(y - 30);
            list.add(x + 30);
            list.add(y - 30);
            list.add(x + 40);
            list.add(y - 20);

            if (x > getWidth())
                x = 0;
        }
    }
}
