package Chapter_20;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
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

/** ***20.5 (Combine colliding bouncing balls) The example in Section 20.7 displays multiple
 bouncing balls. Extend the example to detect collisions. Once two balls
 collide, remove the later ball that was added to the pane and add its radius to
 the other ball, as shown in Figure 20.17b. Use the Suspend button to suspend
 the animation and the Resume button to resume the animation. Add a mouse
 pressed handler that removes a ball when the mouse is pressed on the ball. */

public class CombineCollidingBouncingBalls_Exe20_5 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        MultipleBallPane ballPane = new MultipleBallPane();
        ballPane.setStyle("-fx-border-color: yellow");

        Button btAdd = new Button("+");
        Button btSubtract = new Button("-");
        HBox hBox = new HBox(10);
        Button btSuspend = new Button("Suspend");
        Button btResume = new Button("Resume");
        hBox.getChildren().addAll(btSuspend, btResume, btAdd, btSubtract);
        hBox.setAlignment(Pos.CENTER);

        btSuspend.setOnAction(e -> {
            ballPane.pause();
        });

        btResume.setOnAction(e -> ballPane.play());

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
            getChildren().add(new Ball(30, 30, 10, color));
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
            for (int i = 0; i < this.getChildren().size(); i++) {
                Ball ball = (Ball)this.getChildren().get(i);

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

                for (int j = 0; j < this.getChildren().size(); j++) {
                    Ball ball1 = (Ball)this.getChildren().get(j);
                    if (!(ball == ball1)) {
                        if (overlaps(ball1, ball)) {
                            if (i < j) {
                                ball.setRadius(ball.getRadius() + ball1.getRadius());
                                this.getChildren().remove(ball1);
                            } else {
                                ball1.setRadius(ball.getRadius() + ball1.getRadius());
                                this.getChildren().remove(ball);
                            }
                        }
                    }
                }
            }
        }

        /** This method find if the circles overlaps */
        public boolean overlaps(Circle circle1, Circle circle2) {
            double distance = Math.sqrt(Math.pow(circle2.getCenterX() - circle1.getCenterX(), 2) +
                    Math.pow(circle2.getCenterY() - circle1.getCenterY(), 2));
            if (distance <= circle1.getRadius() + circle2.getRadius())
                return true;
            else return false;
        }
    }

    class Ball extends Circle {
        private double dx = 1, dy = 1;

        Ball(double x, double y, double radius, Color color) {
            super(x, y, radius);
            setFill(color); // Set ball color
        }
    }
}
