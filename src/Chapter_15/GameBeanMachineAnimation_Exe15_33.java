package Chapter_15;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GameBeanMachineAnimation_Exe15_33 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();

        BeanMachinePane beanMachinePane = new BeanMachinePane();
        pane.getChildren().addAll(beanMachinePane);

        primaryStage.setScene(new Scene(pane, 270, 300));
        primaryStage.setTitle("BeanMachine");
        primaryStage.show();
    }

    public class BeanMachinePane extends Pane {
        // Been pane width and height
        private double w = 270;
        private double h = 300;
        private int[] arrayBeans = new int[8];

        public BeanMachinePane() {
            paintBeanMachine();
        }

        protected void paintBeanMachine() {
            // Paint the out line of the bean machine
            Polyline polyline = new Polyline(130, 50, 130, 75, 60, 210, 60, 250,
                    220, 250, 220, 210, 150, 75, 150, 50);

            for (int i = 0; i < 140; i += 20) {
                Line line = new Line(80 + i, 215, 80 + i, 250);
                getChildren().add(line);
            }

            getChildren().addAll(polyline);

            // Compute and add centre coordinates of pegs
            double x = 140;
            for (int i = 0; i < 140; i += 20) {
                for (int j = 0; j < i + 20; j += 20) {
                    Circle circle = new Circle(x + j, 90 + i, 5);
                    circle.setFill(Color.RED);
                    getChildren().add(circle);
                }
                x -= 10;
            }

            Timeline animation = new Timeline(
                    new KeyFrame(Duration.millis(4000), e -> animatePath()));
            animation.setCycleCount(10);
            animation.play();
        }

        /** Compute line as polyline for the path of bean */
        public Polyline computeBeanPathLine() {
            Polyline polyline = new Polyline(140, 70);
            ObservableList<Double> list = polyline.getPoints();
            double x = 140;
            double y = 70;
            int numberCell = 0;
            for (int i = 0; i < 7; i++) {
                int randomOne = ((int) (Math.random() * 2)) > 0 ? 1 : -1;
                if (randomOne > 0)
                    numberCell++;
                x = x + (10 * randomOne);
                list.add(x);
                y += 20;
                list.add(y);

                if (i == 6) {
                    if (arrayBeans[numberCell] == 0) {
                        list.add(x);
                        list.add(y + 35);
                    }
                    else if (arrayBeans[numberCell] == 1) {
                        list.add(x);
                        list.add(y + 25);
                    }
                    else if (arrayBeans[numberCell] == 2) {
                        list.add(x);
                        list.add(y + 15);
                    }
                    else if (arrayBeans[numberCell] == 3) {
                        list.add(x);
                        list.add(y + 5);
                    }
                    else if (arrayBeans[numberCell] == 4) {
                        list.add(x);
                        list.add(y - 5);
                    }
                    else {
                        list.add(x);
                        list.add(y
                        );
                    }
                }
            }
            System.out.println(numberCell);

            arrayBeans[numberCell] = arrayBeans[numberCell] + 1;

            return polyline;
        }

        /** Draw the path */
        public void animatePath() {
            Polyline polyline = computeBeanPathLine();
            polyline.setVisible(false);
            Circle bean = new Circle(5);
            bean.setFill(Color.MAROON);
            getChildren().addAll(polyline, bean);

            // Create a path transition
            PathTransition pt = new PathTransition();
            pt.setDuration(Duration.millis(5000));
            pt.setPath(polyline);
            pt.setNode(bean);
            pt.play();
        }
    }
}
