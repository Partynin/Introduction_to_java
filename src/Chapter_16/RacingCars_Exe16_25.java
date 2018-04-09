package Chapter_16;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RacingCars_Exe16_25 extends Application {
    private double width = 500;
    private double height = 260;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        PaintCar paintCar2 = new PaintCar();
        PaintCar paintCar3 = new PaintCar();
        PaintCar paintCar4 = new PaintCar();
        PaintCar paintCar1 = new PaintCar();

        VBox paneForCar = new VBox(5);
        paneForCar.getChildren().addAll(paintCar1, paintCar2, paintCar3, paintCar4);

        HBox paneForSpeedCars = new HBox(5);
        TextField tfCar1 = new TextField();
        tfCar1.setPrefColumnCount(3);
        TextField tfCar2 = new TextField();
        tfCar2.setPrefColumnCount(3);
        TextField tfCar3 = new TextField();
        tfCar3.setPrefColumnCount(3);
        TextField tfCar4 = new TextField();
        tfCar4.setPrefColumnCount(3);
        paneForSpeedCars.getChildren().addAll(
                new Label("Car 1:"), tfCar1, new Label("Car 2:"),
                tfCar2, new Label("Car 3:"), tfCar3, new Label("Car 4:"), tfCar4);
        paneForSpeedCars.setAlignment(Pos.CENTER);

        pane.setCenter(paneForCar);
        pane.setTop(paneForSpeedCars);

        tfCar1.setOnAction(e -> {
            paintCar1.changeSpeed(Double.parseDouble(tfCar1.getText()));
        });

        tfCar2.setOnAction(e -> {
            paintCar2.changeSpeed(Double.parseDouble(tfCar2.getText()));
        });

        tfCar3.setOnAction(e -> {
            paintCar3.changeSpeed(Double.parseDouble(tfCar3.getText()));
        });

        tfCar4.setOnAction(e -> {
            paintCar4.changeSpeed(Double.parseDouble(tfCar4.getText()));
        });

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("RacingCar");
        primaryStage.show();
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
            setStyle("-fx-border-color: black");
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

        public void changeSpeed(double newSpeed) {
            if (newSpeed > 100)
                newSpeed = 100;
            animation.setRate(newSpeed);
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
