package Chapter_20;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Collections;
import java.util.LinkedList;

/** ***20.9 (Remove the largest ball first) Modify Listing 20.6, MultipleBallApp.java to
 assign a random radius between 2 and 20 when a ball is created. When the -
 button is clicked, one of largest balls is removed. */

public class RemoveTheLargestBallFirs_Exe20_9 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        MultipleBallPane ballPane = new MultipleBallPane();
        ballPane.setStyle("-fx-border-color: yellow");

        Button btAdd = new Button("+");
        Button btSubtract = new Button("-");
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btAdd, btSubtract);
        hBox.setAlignment(Pos.CENTER);

        // Add or remove a ball
        btAdd.setOnAction(e -> ballPane.add());
        btSubtract.setOnAction(e -> ballPane.subtract());

        // Pause and resume animation
        ballPane.setOnMousePressed(e -> ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());

        // Use a scroll bar to control animation speed
        ScrollBar sbSpeed = new ScrollBar();
        sbSpeed.setMax(20);
        sbSpeed.setValue(10);
        ballPane.rateProperty().bind(sbSpeed.valueProperty());

        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setTop(sbSpeed);
        pane.setBottom(hBox);

        // Create a scene and place the pane in the stage
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("MultipleBounceBall"); // Set the stage title
        primaryStage.setScene(scene);
        primaryStage.show(); // Display the stage

        pane.setOnKeyPressed(e -> ballPane.deleteBall());
    }

    private class MultipleBallPane extends Pane {
        private Timeline animation;

        public MultipleBallPane() {
            // Create an animation for moving the ball
            animation = new Timeline(
                    new KeyFrame(Duration.millis(50), e -> moveBall()));
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play();
        }

        public void add() {
            Color color = new Color(Math.random(), Math.random(), Math.random(), 0.5);
            getChildren().add(new Ball(30, 30,
                    (int)(2 + Math.random() * 18), color));
        }

        public void subtract() {
            if (getChildren().size() > 0) {
                getChildren().remove(0);
            }
        }

        public void play() {
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

        public DoubleProperty rateProperty() {
            return animation.rateProperty();
        }

        protected void moveBall() {
            for (Node node: this.getChildren()) {
                Ball ball = (Ball)node;
                // Check boundaries
                if (ball.getCenterX() < ball.getRadius() || ball.getCenterX() > getWidth() -
                        ball.getRadius()) {
                    ball.dx *= -1; // Change ball move direction
                }
                if (ball.getCenterY() < ball.getRadius() || ball.getCenterY() > getHeight() -
                        ball.getRadius()) {
                    ball.dy *= -1; // Change ball move direction
                }

                // Adjust ball position
                ball.setCenterX(ball.dx + ball.getCenterX());
                ball.setCenterY(ball.dy + ball.getCenterY());
            }
        }

        private void deleteBall() {
            LinkedList<Ball> list = new LinkedList<>();
            for (Node node: this.getChildren()) {
                Ball ball = (Ball) node;
                list.add(ball);
            }
            Collections.sort(list);
            this.getChildren().remove(list.getLast());
        }
    }

    class Ball extends Circle implements Comparable<Ball> {
        private double dx = 1, dy = 1;

        Ball(double x, double y, double radius, Color color) {
            super(x, y, radius);
            setFill(color); // Set ball color
        }

        @Override
        public int compareTo(Ball o) {
            if (this.getRadius() > o.getRadius())
                return 1;
            else if (this.getRadius() < o.getRadius())
                return -1;
            else
                return 0;
        }
    }
}
